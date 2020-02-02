public class Coffee extends HotBeverage {
    private Coffee() {
        shortName = "HC";
        price = 2;
    }

    private static Coffee _Coffee;

    public static Coffee accessCoffee() {
        _Coffee = new Coffee();
        return _Coffee;
    }
}
