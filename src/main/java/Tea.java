public class Tea extends Beverage {

    private boolean mint;
    private final double PRICE_MINT = 10;

    public Tea(String description, double price, boolean syrup, boolean vanilla, boolean cinnamon, boolean mint) {
        super(description, price, syrup, vanilla, cinnamon);
        this.mint = mint;
    }



    public boolean isMint() {
        return mint;
    }

    public double getPRICE_MINT() {
        return PRICE_MINT;
    }
}
