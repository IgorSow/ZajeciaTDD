package machine;

public class SodaMachine {

    public double sell(double priceOfSoda, double balance) {

        if (balance >= priceOfSoda) {
            balance = balance - priceOfSoda;
            return balance;
        } else
            return balance;
    }

    public String payAndGetSoda(double priceOfSoda, double balance, String sodaName) {
        if (priceOfSoda == 1) return DrinkName.COKE.getNameOfDrink();
        if (priceOfSoda == 2) return DrinkName.FANTA.getNameOfDrink();
        if (priceOfSoda == 3) return DrinkName.SPRITE.getNameOfDrink();
        if (priceOfSoda == 4) return DrinkName.BEER.getNameOfDrink();
        return "";
    }

    public DrinkStatus sell(String types, double balance) {

        DrinkName sodaPrice = DrinkName.valueOf(types);

        DrinkName drinkName1 = DrinkName.valueOf(types);
        return null;

       // double balanceAfterBuy = balance - sodaPrice;

     //   return new DrinkStatus(drinkName1, balanceAfterBuy);

    }


}



