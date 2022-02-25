
package models.installmentModels;

public class Price {
    private double current;
    private double total;
    private String currency;
    private String currencyCode;

    public double getCurrent() { return current; }
    public void setCurrent(double value) { this.current = value; }

    public double getTotal() { return total; }
    public void setTotal(double value) { this.total = value; }

    public String getCurrency() { return currency; }
    public void setCurrency(String value) { this.currency = value; }

    public String getCurrencyCode() { return currencyCode; }
    public void setCurrencyCode(String value) { this.currencyCode = value; }
}
