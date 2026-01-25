package Day2.DealTracker;

public class Promotion<T> {

    protected T code;
    protected String validTill;

    public Promotion(T code, String validTill) {
        this.code = code;
        this.validTill = validTill;
    }

    public T getCode() {
        return code;
    }

    public String getValidTill() {
        return validTill;
    }
}

