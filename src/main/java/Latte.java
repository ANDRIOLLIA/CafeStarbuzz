public class Latte extends Beverage{

    private boolean milk;
    private final double amountCoffee = 30;
    private final double PRICE_MILK = 0;

    public Latte(
            String description, double price, boolean syrup,
            boolean vanilla, boolean cinnamon, boolean milk) {
        super(description, price, syrup, vanilla, cinnamon);
        this.milk = milk;
    }

    public boolean isMilk() {
        return milk;
    }

    public double getPRICE_MILK() {
        return PRICE_MILK;
    }

    public double getAmountCoffee() {
        return amountCoffee;
    }
}
