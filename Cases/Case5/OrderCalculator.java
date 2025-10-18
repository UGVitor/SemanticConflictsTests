// Left.java
public class OrderCalculator {
    public double applyDiscount(double total, boolean isVip) {
        // Left: aplica 10% de desconto para clientes VIP
        if (isVip) {
            total = total * 0.9;
        }
        return total + calculateShipping(total);
    }

    private double calculateShipping(double total) {
        return 15.0;
    }
}
