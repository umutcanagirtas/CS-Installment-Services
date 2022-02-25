package models.installmentModels;

public class Error {
    private long type;
    private Object title;
    private Object message;
    private Object returnUrl;

    public long getType() { return type; }
    public void setType(long value) { this.type = value; }

    public Object getTitle() { return title; }
    public void setTitle(Object value) { this.title = value; }

    public Object getMessage() { return message; }
    public void setMessage(Object value) { this.message = value; }

    public Object getReturnUrl() { return returnUrl; }
    public void setReturnUrl(Object value) { this.returnUrl = value; }
}