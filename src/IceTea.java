public class IceTea extends ColdBeverage {
    private IceTea() {
        shortName = "CT"; // Assinging values to both attributes inheritted from Beverage -> ColdBeverage.
        price = 1;
    }

    private static IceTea _IceTea; // Creating _IceTea to assign a new instance of IceTea to.

    public static IceTea accessIceTea() {
        _IceTea = new IceTea(); // Create a new instance of IceTea using the constructor above with the default attribute values.
        return _IceTea; // Give the new IceTea instance back to allow other classes to access it outside of this class.
    }
}
