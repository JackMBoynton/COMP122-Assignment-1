public class Coffee extends HotBeverage {
    public static void main(String[] args) {
        Coffee Coffee = new Coffee();
        Coffee.shortName = "HC";
        Coffee.price = 2;
        System.out.println(Coffee.toString() + " " + Coffee.getPrice());
    }
}
