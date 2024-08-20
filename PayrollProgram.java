import java.util.Scanner;

// sV 20Aug2024
/*
*PayrollProgram.java
*
* Input: User's name, weekly hours worked (in whole number), User's hourly pay rate
*
* Processing: Total weekly pay including overtime if more than 40 hours worked that week
*
* Output: Polite greeting to the user and regular and overtime pay
*
 */
import java.util.Scanner;
public class PayrollProgram {
    public static void main(String[] args) {

        System.out.print("\n\n...Hello and welcome!\n");
        // Variables used in this program
        String userName = "";
        int hoursWorked = 0;
        int overtimeHours = 0;
        int anotherNumber;
        int payRate = 0;
        double hourlyPayRate = 0.0;
        double weeklyPayWithoutOvertime = 0.0;
        double overTimePay = 0.0;

        // Say hello to the user and get user's information
        //Get the user's name
        //Create a Scanner object to get input from the user
        Scanner myScannerObj = new Scanner(System.in);

        //Ask user for their name
        System.out.println("\n\nEnter your name:\n");
        userName = myScannerObj.nextLine();
        System.out.println("\nHello "  + userName + (". I hope you're doing well today."));

        //Get weekly hours worked from the user.
        //Output statement prompting the user for hours worked.
        System.out.println("\n\nPlease enter how many hours did you work this week (use whole numbers)\n");
        //Use the Scanner object to get input from this prompt and store what was returned from your Scanner object in a variable
        hoursWorked = myScannerObj.nextInt();

        //Get user's pay rate
        System.out.println("\n\nPlease enter your pay rate (use whole numbers)\n");
        //Use the Scanner object to get input from this prompt and store what was returned from your Scanner object in a variable
        payRate = myScannerObj.nextInt();

        //Create an output statement to the user echoing the user's input
        System.out.println("\n\nHey " + userName + ", you worked " + hoursWorked + " hours this week." );

        //Processing
        overtimeHours = hoursWorked - 40;
        if (hoursWorked>40) {
            overTimePay = overtimeHours * payRate * 1.5;
        }
        else {
            overTimePay = 0;
        }

        //Calculate weekly regular pay
        if (hoursWorked >= 40) {
            weeklyPayWithoutOvertime = hoursWorked * payRate;
        }

    }
}