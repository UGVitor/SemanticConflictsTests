// Base.java
public class OrderCalculator {
    public double applyDiscount(double total, boolean isVip) {
        // Base: apenas retorna o total original
        return total + calculateShipping(total);
    }

    private double calculateShipping(double total) {
        return 15.0; // frete fixo
    }
}
