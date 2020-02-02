public class VendingMachine {    
     NoBeverage empty = NoBeverage.accessNoBeverage();
     Tea vendingTea = Tea.accessTea();
     Coffee vendingCoffee = Coffee.accessCoffee(); // Creating instances for each beverage so their attributes are available to the VendingMachine class,
     IceTea vendingIceTea = IceTea.accessIceTea(); // as they exist in their own classes.
     Beer vendingBeer = Beer.accessBeer();

	private int cassette = 0; // Creating the cassette.
    private Beverage[][] BeverageArray = new Beverage[4][5]; // Creating the 2d array.

    // This takes the coin the individual passes in and adds it to the cassette balance.
    public void insertCoin(int coin) {
        cassette += coin;
    }

    // This method takes the row and column that the person would want their drink from and retrieves it for them.
    public Beverage getBeverage(int r, int c) {
        Beverage selection = BeverageArray[r][c]; // This is the selection made by the individual.
        int selectionPrice = selection.getPrice(); // The price of the selection.
        if (cassette >= selectionPrice && selection != empty) { // This is checking the individual has inserted enough currency into the cassette and the chosen selection is not empty.       
            BeverageArray[r][c] = empty; // The beverage has been bought so clear it out and make it unavailable.
            cassette -= selectionPrice; // Take the balance of the beverage from the cassette.
            return selection; // Give the individual their beverage.
        } else {
            return empty; // However, if they do not have enough, or the beverage is unavailable do nothing.
        }
    }

    // This pre-constructs the Array and fills it with our beverages as objects, before they are string manipulated into the format below.
    public void ArrayConstruct() {
        for (int i = 0; i <= 3; i++) {
            if (i == 0) { // We are saying if we are on row 1 then we're dealing with Tea.
                for (int j = 0; j <= 4; j++) { // Then we are saying, as we're dealing with Tea, fill every element on this row with Tea.
                    BeverageArray[i][j] = vendingTea;
                }
            } else if (i == 1) { // Row 2 deals with Coffee and so on..
                for (int j = 0; j <= 4; j++) { // Fill every element on this row with Coffee and so on..
                    BeverageArray[i][j] = vendingCoffee;
                }
            } else if (i == 2) {
                for (int j = 0; j <= 4; j++) {
                    BeverageArray[i][j] = vendingIceTea;
                }
            } else if (i == 3) { // Until the final row, which is Beer.
                for (int j = 0; j <= 4; j++) { // Again, final row, all elements being filled with Beer objects.
                    BeverageArray[i][j] = vendingBeer;
                }
            }
        }
    }

    // This method takes the integers i and j and searches the 2d array turning each Beverage into the correct string format: "[r,c]:XX:£p" ready for outputting.
    public String ReturnFormattedArray(int i, int j) {
        return "[" + i + "," + j + "]:" + BeverageArray[i][j].toString() + ":£" + BeverageArray[i][j].getPrice() + " ";
    }

    // Here we're overriding the already existing toString method to create our own for this class.
    @Override
    public String toString() {
        String FormattedText = "Cassette: £" + cassette + "\n";
        for (int i = 0; i <= 3; i++) { // This is the loop that increments for the rows.
            for (int j = 0; j <= 4; j++) { // This is the loop that increments for the columns.
                FormattedText += ReturnFormattedArray(i, j); // This is the method from above, it takes the String FormattedText from earlier and concatinates the result from the method to it.
            }
            FormattedText += "\n"; // This gives us a new line every row, for the vending machine structure.
        }
        return FormattedText;
    }

    // This is the main method that the program runs.
    public static void main(String[] args) { 
        VendingMachine vendingMachine = new VendingMachine(); // Creating a new instance of vendingMachine so the methods are accessible.
        vendingMachine.ArrayConstruct(); // This builds the array up for us with our beverages.
        vendingMachine.insertCoin(5);
        vendingMachine.getBeverage(2, 2); // The methods being used in main are taken from the Assessment readme to make sure the results are as expected.
        vendingMachine.getBeverage(0, 1);
        System.out.print(vendingMachine.toString()); // Printing the Vending Machine after the test methods are complete.
    }
}