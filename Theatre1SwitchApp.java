package Lab3;

/**
 More Problems on Selection Statements

 Problem 1:

 Your local theatre charges different prices during the week and during the weekends.  The prices are outlined in the table below:

 Day:				Price:

 Monday - Thursday		€20

 Friday - Sunday			€30

 You have been asked to develop an application that allows a user to enter the day of the week and then display the cost of a theatre ticket for that person based on the day of the week.

 Use instantiable classes in your application.  Save the instantiable class as Theatre1.java

 Theatre1SwitchApp.java
 -- prompts the user to input a day
 -- uses the instantiable class Theatre1Switch to determine the actual cost of a theatre ticket based on the given day

 */

import java.util.Scanner;
public class Theatre1SwitchApp {
    public static void main(String args[]){
        // declare variables
        String d; // declare a variable to store the day entered by the user
        Theatre1Switch t; // declare a variable named t of type Theatre1If

        t = new Theatre1Switch(); // create an object of type Theatre1Switch

        // input
        Scanner sc = new Scanner(System.in); // create an object of type Scanner to allow input from the keyboard

        // prompt the user to input a day
        System.out.println("enter a day: ");
        d = sc.next(); // reads one single word from the keyboard

        // use (i.e. by calling/invoking) the setter method setDay() to store in the instance variable named day of the object t the day provided by the user
        t.setDay(d);

        // processing: calculate the price of a tiket in the given day
        t.calculatePrice();

        // output
        // invoke/call the getter method getPrice() to retrieve the price of the ticket
        int p = t.getPrice();

        // it is not mandatory, but we can display a user friendly message in case that the day is not valid, and therefore there is a negative value in the cost variable (recall that the calculatePrice() method of the Theatre1Switch class assigns/stores -1 in the price instance variable if the day is invalid)
        if (p < 0 ){
            System.out.println("the day provided is invalid. run the program again.");
        } else {
            System.out.println("the cost of a ticket on " + d + " is " + p);
        }
    }
}

