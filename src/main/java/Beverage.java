public abstract class Beverage {

    private String description;
    private double price;
    private boolean syrup;
    private boolean vanilla;
    private boolean cinnamon;

    public final double PRICE_SYRUP = 30;
    public final double PRICE_VANILLA = 30;
    public final double PRICE_CINNAMON = 30;

    public Beverage(String description, double price, boolean syrup, boolean vanilla, boolean cinnamon) {
        this.description = description;
        this.price = price;
        this.syrup = syrup;
        this.vanilla = vanilla;
        this.cinnamon = cinnamon;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public boolean isSyrup() {
        return syrup;
    }

    public boolean isVanilla() {
        return vanilla;
    }

    public boolean isCinnamon() {
        return cinnamon;
    }

    public double getPRICE_SYRUP() {
        return PRICE_SYRUP;
    }

    public double getPRICE_VANILLA() {
        return PRICE_VANILLA;
    }

    public double getPRICE_CINNAMON() {
        return PRICE_CINNAMON;
    }
}