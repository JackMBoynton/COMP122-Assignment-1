public class Beer extends ColdBeverage {

    private Beer() {
        shortName = "CB"; // Assinging values to both attributes inheritted from Beverage -> ColdBeverage.
        price = 3;
    }

    private static Beer _Beer; // Creating _Beer to assign a new instance of Beer to.

    public static Beer accessBeer() {
        _Beer = new Beer(); // Create a new instance of Beer using the constructor above with the default attribute values.
        return _Beer; // Give the new beer instance back to allow other classes to access it outside of this class.
    }
}
