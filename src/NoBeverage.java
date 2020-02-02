public class NoBeverage extends Beverage {
    private NoBeverage() {
        shortName = "--";
        price = 0;
    }

    private static NoBeverage _noBeverage;

    public static NoBeverage accessNoBeverage() {
        _noBeverage = new NoBeverage();
        return _noBeverage;
    }
}
