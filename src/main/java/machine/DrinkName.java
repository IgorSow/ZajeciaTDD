package machine;

public enum DrinkName {
    COKE("coke",1),
    FANTA("fanta",2),
    SPRITE("sprite",3),
    BEER("beer",4);

    private final String nameOfDrink;
    private final double price;

    private DrinkName(String nameOfDrink, double price) {
        this.nameOfDrink = nameOfDrink;
        this.price = price;
    }

    public String getNameOfDrink() {
        return nameOfDrink;
    }

    public double getPrice() {
        return price;
    }
}


