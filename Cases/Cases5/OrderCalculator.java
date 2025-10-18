public class OrderCalculator {
    public double applyDiscount(double total, boolean isVip) {
	if (isVip) {
            total = total * 0.9;
        }
        return total + calculateShipping(total);
    }

    private double calculateShipping(double total) {
        return 15.0;
    }
}