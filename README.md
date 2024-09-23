**Description**

For the challenge section of this homework, you will be using loops to implement an interactive program with a menu called MyMathHelper.java. The program will allow the user to select one of two options which will then perform different calculations utilizing loops. The user can either select to calculate the greatest common denominator of two integers or they can do a prime factorization of a given integer.

**Operations**

Greatest Common Denominator

The greatest common denominator (GCD) of two integers is the largest integer that divides both without a remainder. For example, 4 is the greatest common denominator of the input (8, 12), and 9 is the greatest common denominator of the input (9,81).

**Prime Factorization**

The prime factorization (PF) of any given integer is the list of smallest prime numbers, in ascending order, that multiply together to form the given integer. For example, the prime factorization of 12 is 2 x 2 x 3, this can be seen as 12 = 4 x 3. 3 is prime so it does not require any further reduction, then 4 = 2 x 2. Another example would be 36 which is 6 x 6, 6 reduces to 2 x 3 so the final factorization is 2 x 2 x 3 x 3.

**Instructions**  

For this assignment you will be required to implement an interactive menu, but first you should welcome the user with a one time only welcome message.

Specific implementation requirements include

This menu will prompt the user to select one of three options. 1 - Calculate Greatest Common Denominator 2 - Perform Prime Factorization 3 - Exit

Your program MUST handle invalid inputs by printing the INVALID_MENU_SELECTION message followed by reprinting the menu. Once a valid selection is made, your program will print the relevant prompt followed by prompting for the correct number of integers, one line at a time. There will be two prompts for GCD and one for PF. Your program should print the correct solution to the console then go back to the main menu. If the user enters an invalid input, print the INVALID_INPUT message and return to the main menu. For GCD all integers must be positive. For PF the integer must be 2 or greater. For GCD the larger integer could be input either first or last When the user selects exit, the EXIT_MESSAGE should be printed and the program should end. The output should match exactly as expected. Use String variables provided in the starter code. Your program should not crash for any input. You may not utilize static or multiple Scanner objects. You may not utilize java.lang.Math for this assignment. You may not utilize System.exit() in CS18000 assignments. Testing Brackets [] are used to indicate input.

**Sample Output 1**

Welcome to My Math Helper! Please Select an Operation 1 - Calculate Greatest Common Denominator 2 - Perform Prime Factorization 3 - Exit [1] Ready to Calculate Greatest Common Denominator Please Enter an Integer [8] Please Enter a Second Integer [12] The Greatest Common Denominator is 4 Please Select an Operation 1 - Calculate Greatest Common Denominator 2 - Perform Prime Factorization 3 - Exit [3] Thank you for using My Math Helper!

**Sample Output 2**

Welcome to My Math Helper! Please Select an Operation 1 - Calculate Greatest Common Denominator 2 - Perform Prime Factorization 3 - Exit [2] Ready to Perform Prime Factorization Please Enter an Integer [36] The Prime Factorization is 2 x 2 x 3 x 3 Please Select an Operation 1 - Calculate Greatest Common Denominator 2 - Perform Prime Factorization 3 - Exit [3] Thank you for using My Math Helper!

**Sample Output 3** 

Welcome to My Math Helper! Please Select an Operation 1 - Calculate Greatest Common Denominator 2 - Perform Prime Factorization 3 - Exit [2] Ready to Perform Prime Factorization Please Enter an Integer [1] Invalid Input - Returning to Main Menu Please Select an Operation 1 - Calculate Greatest Common Denominator 2 - Perform Prime Factorization 3 - Exit [3] Thank you for using My Math Helper!

**Sample Output 4**

Welcome to My Math Helper! Please Select an Operation 1 - Calculate Greatest Common Denominator 2 - Perform Prime Factorization 3 - Exit [wrong] Invalid selection! Please Select an Operation 1 - Calculate Greatest Common Denominator 2 - Perform Prime Factorization 3 - Exit [5] Invalid selection! Please Select an Operation 1 - Calculate Greatest Common Denominator 2 - Perform Prime Factorization 3 - Exit [3] Thank you for using My Math Helper!

**Submit**

After testing your solution and verifying that it meets the requirements described in this document, you can submit on Vocareum. You have 10 submission attempts to achieve full points.
