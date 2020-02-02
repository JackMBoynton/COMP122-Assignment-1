public class Beer extends ColdBeverage {

    private Beer() {
        shortName = "CB";
        price = 3;
    }

    private static Beer _Beer;

    public static Beer accessBeer() {
        _Beer = new Beer();
        return _Beer;
    }
}
