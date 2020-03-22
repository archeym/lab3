package Lab3;
/**
 GuessApp
 uses the instantiable class GuessNumber
 allows the user to guess a number 1 time
 */

import java.util.*;

public class GuessApp {

    public static void main(String[] args) {

        //declare a local variable named num to store the number provided by the user
        int num;

        //declare a variable named input, and create an object of type Scanner
        Scanner input = new Scanner(System.in);

        //declare a variable and create an object of type GuessNumber
        GuessNumber checker = new GuessNumber();


        //input, prompt the user to enter a number
        System.out.println("Enter the number:  ");
        num = input.nextInt();

        //to assign/store in the instance variable guess of the object checker the number provided by the user
        //and saved in the local variable num
        checker.setGuess(num);

        //processing
        //call compare() on object checker to determine whether the user provide the correct number
        checker.compute();

        //output
        //retreive the message to find out whether the user guessed or not
        //save the message in the variable called m
        String m = checker.getMessage();
        System.out.println(m);

        //retrieve the secret number
        int s = checker.getSecret();
        System.out.println("secret number is: " + s);

    }//end main
}//end class
