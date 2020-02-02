public class Tea extends HotBeverage {
    private Tea() {
        shortName = "HT";
        price = 2;
    }

    private static Tea _Tea;

    public static Tea accessTea() {
        _Tea = new Tea();
        return _Tea;
    }
}
