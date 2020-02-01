public class NoBeverage extends Beverage {
    public static void main(String[] args) {
        NoBeverage NoBeverage = new NoBeverage();
        NoBeverage.shortName = "--";
        NoBeverage.price = 0;
        System.out.println(NoBeverage.toString() + " " + NoBeverage.getPrice());
    }
}
