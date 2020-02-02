public class Coffee extends HotBeverage {
    private Coffee() {
        shortName = "HC"; // Assinging values to both attributes inheritted from Beverage -> HotBeverage.
        price = 2;
    }

    private static Coffee _Coffee; // Creating _Coffee to assign a new instance of Coffee to.

    public static Coffee accessCoffee() {
        _Coffee = new Coffee(); // Create a new instance of Coffee using the constructor above with the default attribute values.
        return _Coffee; // Give the new Coffee instance back to allow other classes to access it outside of this class.
    }
}
