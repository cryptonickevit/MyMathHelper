import java.util.Scanner;
import java.util.ArrayList;

/**
 * @author Kevin Tang
 * @version September 25, 2024
 */
public class MyMathHelper {
    public static final String WELCOME_MESSAGE = "Welcome to My Math Helper!";
    public static final String MAIN_MENU_ONE = "Please Select an Operation";
    public static final String MAIN_MENU_TWO = "1 - Calculate Greatest Common Denominator";
    public static final String MAIN_MENU_THREE = "2 - Perform Prime Factorization";
    public static final String MAIN_MENU_FOUR = "3 - Exit";
    public static final String GCD_NOTIFICATION = "Ready to Calculate Greatest Common Denominator";
    public static final String PF_NOTIFICATION = "Ready to Perform Prime Factorization";
    public static final String INPUT_ONE = "Please Enter an Integer";
    public static final String INPUT_TWO = "Please Enter a Second Integer";
    public static final String GCD_OUTPUT = "The Greatest Common Denominator is ";
    public static final String PF_OUTPUT = "The Prime Factorization is ";
    public static final String EXIT_MESSAGE = "Thank you for using My Math Helper!";
    public static final String INVALID_MENU_SELECTION = "Invalid selection!";
    public static final String INVALID_INPUT = "Invalid Input - Returning to Main Menu";

    // Using the Euclidean algorithm for GCD
    public int calculateGCD(int num1, int num2) {
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }

    public void performPrimeFactorization(int number) {
        ArrayList<String> primeFactors = new ArrayList<String>();
        while (number % 2 == 0) {
            primeFactors.add(Integer.toString(2));
            number /= 2;
        }
        for (int i = 3; i <= number / 2; i += 2) {
            while (number % i == 0) {
                primeFactors.add(Integer.toString(i));
                number /= i;
            }
        }
        if (number > 2) {
            primeFactors.add(Integer.toString(number));
        }


        for (int i = 0; i < primeFactors.size(); i += 2) {
            primeFactors.add(i, " x ");
        }
        for (int i = 1; i < primeFactors.size(); i++) {
            System.out.print(primeFactors.get(i));
        }
        System.out.println();
    }


    public static void main(String[] args) {
        boolean continueProgram = true;
        Scanner scan = new Scanner(System.in);

        System.out.println(WELCOME_MESSAGE);

        MyMathHelper helper = new MyMathHelper();

        do {
            System.out.println(MAIN_MENU_ONE);
            System.out.println(MAIN_MENU_TWO);
            System.out.println(MAIN_MENU_THREE);
            System.out.println(MAIN_MENU_FOUR);

            String choice = scan.nextLine();

            switch (choice) {
                case "1":
                    System.out.println(GCD_NOTIFICATION);

                    System.out.println(INPUT_ONE);
                    int num1 = scan.nextInt();
                    scan.nextLine();
                    if (num1 <= 0) {
                        System.out.println(INVALID_INPUT);
                        break;
                    }

                    System.out.println(INPUT_TWO);
                    int num2 = scan.nextInt();
                    scan.nextLine();
                    if (num2 <= 0) {
                        System.out.println(INVALID_INPUT);
                        break;
                    }


                    int gcd = helper.calculateGCD(num1, num2);
                    System.out.println(GCD_OUTPUT + gcd);
                    break;

                case "2":
                    System.out.println(PF_NOTIFICATION);
                    System.out.println(INPUT_ONE);
                    int num3 = scan.nextInt();
                    scan.nextLine(); // Consume newline character

                    if (num3 < 2) {
                        System.out.println(INVALID_INPUT);
                        break;
                    }

                    System.out.print(PF_OUTPUT);
                    helper.performPrimeFactorization(num3);
                    break;

                case "3":
                    System.out.println(EXIT_MESSAGE);
                    continueProgram = false;
                    break;

                default:
                    System.out.println(INVALID_MENU_SELECTION);
            }

        } while (continueProgram);
    }
}
