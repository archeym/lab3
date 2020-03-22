package Lab3;

/**
 More Problems on Selection Statements

 Problem 2:

 The theatre has now decided to charge based both on the day of the week and on the age of the customer. The new table of prices is outlined below:

 Day:				Age			Price:

 Monday - Thursday		Under 5/Over 65		Free

 5 – 15			€15

 15 - 65			€20

 Friday - Sunday			Under 5/Over 65		€5

 5 – 15			€20

 15 - 65			€30

 Use instantiable classes in your application. Save the instantiable class as Theatre2.java

 Theatre2App.java
 -- prompts the user to input a day and the age of the customer
 -- uses the instantiable class Theatre2 to determine the actual cost of a theatre ticket based on the given day and age

 */

import java.util.Scanner;
public class Theatre2App {

    public static void main(String args[]){

        // declare local variables
        String d;
        int age;

        // declare a variable of type Scanner named input, and create an object of type Scanner to allow input from the keyboard
        Scanner input = new Scanner(System.in);
        // prompt the user to input a day
        System.out.println("enter day: ");
        d = input.next(); // reads a single word from the keyboard
        // prompt the user to input the customer's age
        System.out.println("enter age: ");
        age = input.nextInt();
        System.out.println("Example 1");
        // in this example, first, we create an object using the constructor which takes in 2 values (i.e. the day and the age), and second, we create create an object using the constructor which does not take in any values
        // Example 1
        // declare a variable named myObj of type Theatre2
        Theatre2 myObj;
        // create an object of type Theatre2 using the constructor which takes in 2 values
        myObj = new Theatre2(d, age);

        // processing: calculate the price of a tiket based on the given day and age
        // call/invoke the method calculatePrice() on the object myObj
        myObj.calculatePrice();

        // output
        // invoke/call the getter method getPrice() to retrieve the price of the ticket
        int p = myObj.getPrice();
        // it is not mandatory, but we can display a user friendly message in case that the day is not valid, and therefore there is a negative value in the p variable (recall that the calculatePrice() method of the Theatre2 class assigns/stores -1 in the price instance variable if the day is invalid)
        if (p < 0){
            System.out.println("invalid input");
        } else {
            System.out.println(p);
        }
        System.out.println("Example 2");
        // Example 2
        // declare a variable named anotherObj of type Theatre2
        Theatre2 anotherObj;
        // create an object of type Theatre2 using the constructor which does not take in any data
        anotherObj = new Theatre2();
        // use (i.e. by calling/invoking) the setter method setDay() to store in the instance variable named day of the object anotherObj the day provided by the user
        anotherObj.setDay(d);
        // use (i.e. by calling/invoking) the setter method setAge() to store in the instance variable named age of the object anotherObj the age provided by the user
        anotherObj.setAge(age);

        // processing: calculate the price of a tiket based on the given day and age
        // call/invoke the method calculatePrice() on the object anotherObj
        anotherObj.calculatePrice();

        // output
        // invoke/call the getter method getPrice() to retrieve the price of the ticket
        p = anotherObj.getPrice();
        // it is not mandatory, but we can display a user friendly message in case that the day is not valid, and therefore there is a negative value in the p variable (recall that the calculatePrice() method of the Theatre2 class assigns/stores -1 in the price instance variable if the day is invalid)
        if (p < 0){
            System.out.println("invalid input");
        } else {
            System.out.println(p);
        }
    }
}
