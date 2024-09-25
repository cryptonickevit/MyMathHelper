import java.util.Scanner;

/**
 * This class provides methods to calculate the GCD and perform prime factorization.
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

    // Method for finding GCD using the Euclidean algorithm
    public int calculateGCD(int num1, int num2) {
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }

    // Method for performing prime factorization
    public void performPrimeFactorization(int number) {
        System.out.print(PF_OUTPUT);
        // Handle 2 as a special case
        while (number % 2 == 0) {
            System.out.print(2 + " x ");
            number /= 2;
        }
        // Handle odd numbers
        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            while (number % i == 0) {
                System.out.print(i + " x ");
                number /= i;
            }
        }
        // If the remaining number is a prime greater than 2
        if (number > 2) {
            System.out.print(number);
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
                    if (num1 < 0) {
                        System.out.println(INVALID_INPUT);
                        break;
                    }

                    System.out.println(INPUT_TWO);
                    int num2 = scan.nextInt();
                    if (num2 < 0) {
                        System.out.println(INVALID_INPUT);
                        break;
                    }

                    scan.nextLine();

                    int gcd = helper.calculateGCD(num1, num2);
                    System.out.println(GCD_OUTPUT + gcd);
                    break;


                case "2":
                    System.out.println(PF_NOTIFICATION);
                    System.out.println(INPUT_ONE);
                    int num3 = scan.nextInt();
                    scan.nextLine(); // Consume newline character
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
