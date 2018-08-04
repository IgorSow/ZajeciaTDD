package machine;

public class DrinkStatus {
    private DrinkName boughtDrinkName;
    private double balanceAfterDrink;

    public DrinkStatus(DrinkName boughtDrinkName, double balanceAfterDrink) {
        this.boughtDrinkName = boughtDrinkName;
        this.balanceAfterDrink = balanceAfterDrink;
    }

    public DrinkName getBoughtDrinkName() {
        return boughtDrinkName;
    }

    public void setBoughtDrinkName(DrinkName boughtDrinkName) {
        this.boughtDrinkName = boughtDrinkName;
    }

    public double getBalanceAfterDrink() {
        return balanceAfterDrink;
    }

    public void setBalanceAfterDrink(double balanceAfterDrink) {
        this.balanceAfterDrink = balanceAfterDrink;
    }


}
