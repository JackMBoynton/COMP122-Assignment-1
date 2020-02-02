public class Collatz {
    // This method takes an integer n and applies the collatz conjecture to it, giving us the next integer as a result of applying collatz.
    public static int next(int n) {
        int newn = 0; // The modified version of n we will give back.
        if (n%2 == 0) {
            newn = n/2; // This is saying if n is even then make the new version of n equal to n divided by 2.
        } else if (n%2 == 1) {
            newn = (3*n) + 1; // This is saying if n is odd then make the new version of n equal to n multiplied by 3 and add 1.
        }
        return newn;
    }

    // This method takes an int which we perform Collatz Conjecture on and gives the stopping time back (how many steps it takes to achieve the number 1 from n).
    public static int stoppingTime(int n) {
        int counter = 1; // As further in the method, we already pre apply Collatz. The counter starts at 1 and not 0 like it usually would.
        if (n == 1) {
            return 0; // If n = 1 we're there, no steps needed.
        } else if (n > 1) {
            int newValue; // Modified n.
            newValue = next(n); // Applying Collatz.
            while (newValue > 1) { // If the new n after Collatz is larger than 1, then do the following actions until it equals 1.
                newValue = next(newValue); // Apply collatz again to the new value.
                counter = counter + 1; // Increment our stopping time by 1 as we have taken a step.
            }
        }
        return counter; // Successfully return the stopping time.
    }

    // This method takes an integer and applies collatz to it then gives us back the sequence of numbers from n all the way to 1.
    public static String sequence(int n) { 
        String output = "";
        if (n == 1) {
            System.out.println("1"); // Again if n = 1, then we have to do nothing, so output 1.
        } else if (n > 1) {
            int newValue; // Modified n.
            newValue = next(n); // Pre apply Collatz.
            output = output + n + ", " + newValue; // Out output string becomes empty output string, with n now inside it, then we add a comma to split the list, now add the second collatz value.
            while (newValue > 1) { // If the new n after Collatz is larger than 1, then do the following actions until it equals 1.
                newValue = next(newValue); // Apply collatz again to the new value.
                output = output + ", " + newValue; // Ammend our string to contain the new collatz value split by a comma for each time the loop goes round.
            }
        }
        return output;
    }

    // This method is the main method that returns all the first 20 collatz numbers and their sequences.
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) { // Do this loop 20 times for the first 20 numbers.
            if (i == 1) {
                System.out.print(sequence(i)); // This had to be implemented to stop the extra new line being implemented (buggy) this fixed it, as no \n was needed after 1.
            } else {
                System.out.print(sequence(i) + "\n"); // Repeat this 19 times after 1, printing the sequence on a new line for 2-20.
            }
        }
    }

}
