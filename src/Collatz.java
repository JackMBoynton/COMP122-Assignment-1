public class Collatz {

    public static int next(int n) {
        int newn = 0;
        if (n%2 == 0) {
            newn = n/2;
        } else if (n%2 == 1) {
            newn = (3*n) + 1;
        }
        return newn;
    }

    public static int stoppingTime(int n) {
        int counter = 1;
        if (n == 1) {
            return 0;
        } else if (n > 1) {
            int newValue;
            newValue = next(n);
            while (newValue > 1) {
                newValue = next(newValue);
                counter = counter + 1;
            }
        }
        return counter;
    }

    public static String sequence(int n) {
        String output = "";
        if (n == 1) {
            System.out.println("1");
        } else if (n > 1) {
            int newValue;
            newValue = next(n);
            output = output + n + ", " + newValue;
            while (newValue > 1) {
                newValue = next(newValue);
                output = output + ", " + newValue;
            }
        }
        return output;
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            if (i == 1) {
                System.out.print(sequence(i));
            } else {
                System.out.print(sequence(i) + "\n");
            }
        }
    }

}
