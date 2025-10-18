public class OrderCalculator {
    public double applyDiscount(double total, boolean isVip) {
        return total + calculateShipping(total);
    }

    private double calculateShipping(double total) {
        return 15.0;
    }
}