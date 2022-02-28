package servicesTestCases.installmentServicesTestCases;

import static io.restassured.RestAssured.*;
import com.fasterxml.jackson.core.JsonProcessingException;
import helpers.Log;
import models.installmentModels.InstallmentService;
import models.installmentModels.Product;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import responseServices.ResponseInstallmentServices;

import java.util.List;

@Listeners(helpers.Listeners.class)
public class InstallmentServicesTestCases {

    InstallmentService service = new InstallmentService();

    @Test(retryAnalyzer = retry.RetryAnalyzer.class)
    public void getProductListWithInstallmentValueAsOne() throws JsonProcessingException {
        service = ResponseInstallmentServices.installmentServicesResponses(1);
        List<Product> products = service.getResult().getData().getProducts();
        for (Product product : products) {
            if (!product.getInstallment() && product.getInstallmentText().isEmpty() && product.getProductGroupId() != 1) {
                Assert.fail("There is a item with an installment option in the list of items without installments.");
            }
        }
    }

    @Test(retryAnalyzer = retry.RetryAnalyzer.class)
    public void getProductListWithInstallmentValueAsZero() throws JsonProcessingException {
        service = ResponseInstallmentServices.installmentServicesResponses(0);
        List<Product> products = service.getResult().getData().getProducts();
        for (Product product : products) {
            if (product.getInstallment() && product.getInstallmentText().length() > 1 && product.getProductGroupId() != 0) {
                Log.error(product.getName() + " has an installment option");
                Assert.fail("There is a item with an installment option in the list of items without installments.");
            }
        }
    }

    @Test(retryAnalyzer = retry.RetryAnalyzer.class)
    public void getProductListWithoutInstallmentValue() {
        int status = given().get("https://2c9889a3-719f-4417-ba0a-2938d8eab343.mock.pstmn.io/test/?installment=").statusCode();
        Assert.assertEquals(500, status);
    }
}