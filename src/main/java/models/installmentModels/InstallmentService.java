package models.installmentModels;

public class InstallmentService {
    private Result result;
    private Error error;

    public Result getResult() { return result; }
    public void setResult(Result value) { this.result = value; }

    public Error getError() { return error; }
    public void setError(Error value) { this.error = value; }
}
