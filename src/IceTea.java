public class IceTea extends ColdBeverage {
    private IceTea() {
        shortName = "CT";
        price = 1;
    }

    private static IceTea _IceTea;

    public static IceTea accessIceTea() {
        _IceTea = new IceTea();
        return _IceTea;
    }
}
