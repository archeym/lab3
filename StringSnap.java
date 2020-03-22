package Lab3;
/**
 StringSnap -- checks whether 2 Strings are the same, and then prints "SNAP" if they are the same.

 Instruction: Once we finish writing a program we must test it to make sure that the program works exactly as described in the problem's text.
 Compile and run the program with the next inputs:
 Test 1:
 enter first word:
 john
 enter second word:
 john

 the result should be:
 SNAP !!!
 ------------------------
 Test2:
 enter first word:
 john
 enter second word:
 mark

 no message should be displayed
 -------------------------
 Test 3:
 enter first word:
 john
 enter second word:
 JOHN

 the result should be:
 SNAP1, with ignoreCase
 SNAP2 with UpperCase

 */

import java.util.*;

//declare a class named StringSnap
public class StringSnap {

    public static void main(String[] args) {
        //declare 2 local variables to store the input provided by the user
        String text1, text2;

        //declare a variable named sc of type Scanner, and create and object of type Scanner
        Scanner sc = new Scanner(System.in);

        //input, prompt user to provide the first String word
        System.out.println("Please enter word 1: ");
        text1 = sc.next();//reads one word

        System.out.println("Please enter word 2: ");
        text2 = sc.next();

        //processing
        if(text1.equals(text2)){
            System.out.println("SNAP, same words !!!");
        }
//        else{
//            System.out.println("Not same words !! check your input.");
//        }

        System.out.println("-------------");
        System.out.println("Lets check that two pieces of the text are different !");
        if(!text1.equals(text2)){
            System.out.println("Yes, the two pieces of the text are different.");
        }else{
            System.out.println("Nope, the two pieces of the text are same.");
        }
        System.out.println("-------------");

        if(text2.equalsIgnoreCase(text1)){
            System.out.println("SNAP1 with ignoreCase");
        }

//        boolean isEqual = text2.equalsIgnoreCase(text1);
//
//        if(isEqual){
//            System.out.println("SNAP1 with ignoreCase");
//        }

        System.out.println("-------------");

        text1 = text1.toUpperCase();
        text2 = text2.toUpperCase();

        if(text1.equals(text2)){
            System.out.println("SNAP 2 with Uppercase");
        }

    }//end main
}//end class
