package responseServices;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.response.Response;
import models.installmentModels.InstallmentService;

import static io.restassured.RestAssured.*;


public class ResponseInstallmentServices {
    public static InstallmentService installmentServicesResponses(int installmentValue) throws JsonProcessingException {
        Response response=given()
                .get("https://2c9889a3-719f-4417-ba0a-2938d8eab343.mock.pstmn.io/test/{installment}={value}","installment",installmentValue)
                .then()
                .statusCode(200)
                .extract()
                .response();
        String responseString = response.htmlPath().getString("body");
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(responseString, InstallmentService.class);
    }
}
