public class VendingMachine {    
     NoBeverage empty = NoBeverage.accessNoBeverage();
     Tea vendingTea = Tea.accessTea();
     Coffee vendingCoffee = Coffee.accessCoffee();
     IceTea vendingIceTea = IceTea.accessIceTea();
     Beer vendingBeer = Beer.accessBeer();

	private  int cassette = 0;
     Beverage[][] BeverageArray = new Beverage[4][5];

    private  void insertCoin(int coin) {
        cassette += coin;
    }

    private  Beverage getBeverage(int r, int c) {
        Beverage selection = BeverageArray[r][c];
        int selectionPrice = selection.getPrice();
        if (cassette >= selectionPrice && selection != empty) {            
            BeverageArray[r][c] = empty;
            cassette -= selectionPrice;
            return selection;
        } else {
            return empty;
        }
    }

    private  void ArrayConstruct() {
        for (int i = 0; i <= 3; i++) {
            if (i == 0) {
                for (int j = 0; j <= 4; j++) {
                    BeverageArray[i][j] = vendingTea;
                }
            } else if (i == 1) {
                for (int j = 0; j <= 4; j++) {
                    BeverageArray[i][j] = vendingCoffee;
                }
            } else if (i == 2) {
                for (int j = 0; j <= 4; j++) {
                    BeverageArray[i][j] = vendingIceTea;
                }
            } else if (i == 3) {
                for (int j = 0; j <= 4; j++) {
                    BeverageArray[i][j] = vendingBeer;
                }
            }
        }
    }

    private  String ReturnFormattedArray(int i, int j) {
        return "[" + i + "," + j + "]:" + BeverageArray[i][j].toString() + ":£" + BeverageArray[i][j].getPrice() + " ";
    }

    @Override
    public String toString() {
        String FormattedText = "Cassette: £" + cassette + "\n";
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 4; j++) {
                FormattedText += ReturnFormattedArray(i, j);
            }
            FormattedText += "\n";
        }
        return FormattedText;
    }

    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.ArrayConstruct();
        vendingMachine.insertCoin(5);
        vendingMachine.getBeverage(2, 2);
        vendingMachine.getBeverage(0, 1);
        System.out.print(vendingMachine.toString());
    }
}