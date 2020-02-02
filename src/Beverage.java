public class Beverage {
    // This is the superclass that others will inherit from.
    public int price; // Every subclass has to have an attribute price.
    public String shortName; // Every subclass has to have a 'Label' as called in readme file. I called it short name.

    public int getPrice() {
        return price; // Method returning the price of the beverage.
    }

    @Override
    public String toString() {
        return shortName; // Overriding the toString method to return the short name of the beverage.
    }
}