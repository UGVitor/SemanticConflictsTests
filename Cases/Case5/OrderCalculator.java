// Right.java
public class OrderCalculator {
    public double applyDiscount(double total, boolean isVip) {
        // Right: mantém o preço, mas zera o frete se o valor for alto
        double shipping = calculateShipping(total);
        if (total > 100) {
            shipping = 0.0; // frete grátis
        }
        return total + shipping;
    }

    private double calculateShipping(double total) {
        return 15.0;
    }
}
