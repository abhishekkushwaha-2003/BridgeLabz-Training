package Day2.DealTracker;

public class Deal extends Promotion<String> {

    private int discount;
    private int minimumPurchase;

    public Deal(String code, String validTill, int discount, int minPurchase) {
        super(code, validTill);
        this.discount = discount;
        this.minimumPurchase = minPurchase;
    }

    public int getDiscount() {
        return discount;
    }

    public int getMinimumPurchase() {
        return minimumPurchase;
    }

    @Override
    public String toString() {
        return code + " | " + discount + "% | Min ₹" +
               minimumPurchase + " | Valid Till: " + validTill;
    }
}
