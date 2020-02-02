public class NoBeverage extends Beverage {
    // This is a placeholder class for when a beverage has run out.
    private NoBeverage() {
        shortName = "--"; // Assinging values to both attributes inheritted from Beverage.
        price = 0;
    }

    private static NoBeverage _noBeverage; // Creating _noBeverage to assign a new instance of noBeverage to.

    public static NoBeverage accessNoBeverage() {
        _noBeverage = new NoBeverage(); // Create a new instance of noBeverage using the constructor above with the default attribute values.
        return _noBeverage; // Give the new noBeverage instance back to allow other classes to access it outside of this class.
    }
}
