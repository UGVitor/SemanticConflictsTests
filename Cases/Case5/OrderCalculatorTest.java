
public class OrderCalculator {
    public double applyDiscount(double total, boolean isVip) {

        double shipping = calculateShipping(total);
        if (total > 100) {
            shipping = 0.0; // frete grátis
        }
        return total + shipping;;
    }

    private double calculateShipping(double total) {
        return 15.0;
    }
}
