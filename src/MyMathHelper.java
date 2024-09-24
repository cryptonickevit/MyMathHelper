import java.util.Scanner;

//Javadoc goes here

public class MyMathHelper {
    int twoCounter = 0;
    int threeCounter = 0;


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


    void FactorFinder(int value){
        while (value % 2 == 0) {
            value /= 2;
            this.twoCounter++;
        }
        while (value % 3 == 0) {
            value /= 3;
            this.threeCounter++;
        }
    }

    public int GCDresult(int number, int exponent) {
        if (exponent == 0) return 1; // Any number to the power of 0 is 1

        int result = number;

        for (int i = 0; i < exponent-1; i++) {
            result *= number;
        }
        return result;
    }

    public int PFresult(int number, int exponent) {
        if (exponent == 0) return 1; // Any number to the power of 0 is 1


        for (int i = 0; i < exponent-1; i++) {
            System.out.print(number);
        }
        return number;
    }


    public static void main(String[] args) {
        boolean test = true;
        Scanner scan = new Scanner(System.in);

        System.out.println(WELCOME_MESSAGE);
        System.out.println(MAIN_MENU_ONE);
        System.out.println(MAIN_MENU_TWO);
        System.out.println(MAIN_MENU_THREE);
        System.out.println(MAIN_MENU_FOUR);

        MyMathHelper integer2 = new MyMathHelper();
        MyMathHelper integer1 = new MyMathHelper();

        String scan1 = scan.nextLine();

        do{
            switch (scan1){
                case "1":
                    integer1.twoCounter = 0;
                    integer1.threeCounter = 0;
                    integer2.threeCounter = 0;
                    integer2.twoCounter = 0;
                    System.out.println(GCD_NOTIFICATION); // GCD Calculation
                    System.out.println(INPUT_ONE);
                    int scan2 = scan.nextInt();
                    System.out.println(INPUT_TWO);
                    int scan3 = scan.nextInt();
                    integer1.FactorFinder(scan2);
                    integer2.FactorFinder(scan3);
                    if (integer1.twoCounter < integer2.twoCounter) {
                        integer2.twoCounter = integer1.twoCounter;
                    }
                    else {
                        integer1.twoCounter = integer2.twoCounter;
                    }

                    if (integer1.threeCounter < integer2.threeCounter) {
                        integer2.threeCounter = integer1.threeCounter;
                    }
                    else {
                        integer1.threeCounter = integer2.threeCounter;
                    }
                    System.out.println(integer2.threeCounter);
                    int GCD = integer2.GCDresult(2, integer2.twoCounter) * integer2.GCDresult(3, integer2.threeCounter);

                    System.out.println(GCD_OUTPUT + GCD);
                    break;
                case "2":
                    integer1.twoCounter = 0;
                    integer1.threeCounter = 0;
                    integer2.threeCounter = 0;
                    integer2.twoCounter = 0;
                    System.out.println(PF_NOTIFICATION);
                    System.out.println(INPUT_ONE);
                    int scan4 = scan.nextInt();
                    System.out.println(INPUT_TWO);
                    int scan5 = scan.nextInt();
                    integer1.FactorFinder(scan4);
                    integer2.FactorFinder(scan5);
                    if (integer1.twoCounter < integer2.twoCounter) {
                        integer2.twoCounter = integer1.twoCounter;
                    }
                    else {
                        integer1.twoCounter = integer2.twoCounter;
                    }

                    if (integer1.threeCounter < integer2.threeCounter) {
                        integer2.threeCounter = integer1.threeCounter;
                    }
                    else {
                        integer1.threeCounter = integer2.threeCounter;
                    }
                    System.out.println(integer2.PFresult(2, integer2.twoCounter) + integer2.PFresult(3, integer2.threeCounter));
                    break;
                case "3":
                    test = false;
                    break;
            }

        }while (test);





    } // End main
} // End class
