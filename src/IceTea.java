public class IceTea extends ColdBeverage {
    public static void main(String[] args) {
        IceTea IceTea = new IceTea();
        IceTea.shortName = "CT";
        IceTea.price = 1;
        System.out.println(IceTea.toString() + " " + IceTea.getPrice());
    }
}
