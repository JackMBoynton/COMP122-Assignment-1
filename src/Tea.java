public class Tea extends HotBeverage {
    private Tea() {
        shortName = "HT"; // Assinging values to both attributes inheritted from Beverage -> HotBeverage.
        price = 2;
    }

    private static Tea _Tea; // Creating _Tea to assign a new instance of Tea to.

    public static Tea accessTea() {
        _Tea = new Tea(); // Create a new instance of Tea using the constructor above with the default attribute values.
        return _Tea; // Give the new Tea instance back to allow other classes to access it outside of this class.
    }
}
