package Lab3;

import java.util.Scanner;

public class Theatre1IfApp {
    public static void main(String args[]){
        // declare variables
        String d; // declare a variable to store the day entered by the user
        Theatre1If t; // declare a variable named t of type Theatre1If

        t = new Theatre1If(); // create an object of type Theatre1If
        Scanner sc = new Scanner(System.in); // create an object of type Scanner to allow input from the keyboard

        // input
        // prompt the user to input a day
        System.out.println("enter a day: ");
        d = sc.next(); // reads a single word from the keyboard

        // use (i.e. by calling/invoking) the setter method setDay() to store in the instance variable named day of the object t the day provided by the user
        t.setDay(d);

        // processing: calculate the price of a tiket in the given day
        t.calculatePrice();

        // output
        // invoke/call the getter method getPrice() to retrieve the cost of the ticket
        int p = t.getPrice();
        // it is not mandatory, but we can display a user friendly message in case that the day is not valid, and therefore there is a negative value in the p variable (recall that the calculatePrice() method of the Theatre1If class assigns/stores -1 in the price instance variable if the day is invalid)
        if (p < 0 ){
            System.out.println("the day provided is invalid. run the program again.");
        } else {
            System.out.println("the cost of a ticket on " + d + " is " + p);
        }
    }
}
