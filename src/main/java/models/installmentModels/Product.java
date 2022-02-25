
package models.installmentModels;

public class Product {
    private String code;
    private String name;
    private Price price;
    private boolean installment;
    private String installmentText;
    private long productGroupId;
    private String variantCode;
    private String deliveryChargeMessage;

    public String getCode() { return code; }
    public void setCode(String value) { this.code = value; }

    public String getName() { return name; }
    public void setName(String value) { this.name = value; }

    public Price getPrice() { return price; }
    public void setPrice(Price value) { this.price = value; }

    public boolean getInstallment() { return installment; }
    public void setInstallment(boolean value) { this.installment = value; }

    public String getInstallmentText() { return installmentText; }
    public void setInstallmentText(String value) { this.installmentText = value; }

    public long getProductGroupId() { return productGroupId; }
    public void setProductGroupId(long value) { this.productGroupId = value; }

    public String getVariantCode() { return variantCode; }
    public void setVariantCode(String value) { this.variantCode = value; }

    public String getDeliveryChargeMessage() { return deliveryChargeMessage; }
    public void setDeliveryChargeMessage(String value) { this.deliveryChargeMessage = value; }
}
