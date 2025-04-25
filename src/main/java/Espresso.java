public class Espresso extends Beverage{

    private final double amountCoffee = 50;

    public Espresso(
            String description, double price, boolean syrup,
            boolean vanilla, boolean cinnamon) {
        super(description, price, syrup, vanilla, cinnamon);
    }

    public double getAmountCoffee() {
        return amountCoffee;
    }
}
