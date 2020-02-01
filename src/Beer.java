public class Beer extends ColdBeverage {
    public static void main(String[] args) {
        Beer Beer = new Beer();
        Beer.shortName = "CB";
        Beer.price = 3;
        System.out.println(Beer.toString() + " " + Beer.getPrice());
    }

}
