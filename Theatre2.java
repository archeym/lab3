package Lab3;

/**
 More Problems on Selection Statements

 Problem 2:

 The theatre has now decided to charge based both on the day of the week and on the age of the customer. The new table of prices is outlined below:

 Day:				    Age			    Price:

 Monday - Thursday   Under 5/Over 65		Free

 5 – 15			    €15

 15 - 65			    €20

 Friday - Sunday		Under 5/Over 65		€5

 5 – 15			    €20

 15 - 65			    €30

 Use instantiable classes in your application. Save the instantiable class as Theatre2.java

 Theatre2 -- the instantiable class, uses 2 nested if else selection statements to determine the cost of a theatre ticket based on a given day and a customer's age


 */

public class Theatre2 {

    // declare instance variables / data members
    // instance variable to store the day
    private String day;
    // instance variable to store the age
    private int age;
    // instance variable to store the price of a ticket based on the given day and age -- to be computed
    private int price;

    // declare constructors
    // declare a constructor without parameters
    public Theatre2(){
        day = "";  // initialize the day with the empty string; by default the day instance variable is initialized with null;
        // the age and price instance variables are initialized with their default value, which is 0
    }

    // declare a constructor with 2 parameters; this constructor allows to specify the values for day and age at the time of an object construction
    public Theatre2(String day, int age){
        this.day = day;
        this.age = age;
        // the price instance variable is initialized with its default value, which is 0
    }

    // declare setter methods -- declare a setter method for each of the instance variables that can be set/ assigned a value

    // setter method for the day instance variable
    public void setDay(String day){
        this.day = day;
    }

    // setter method for the age instance variable
    public void setAge(int myAge){
        age = myAge;
    }

    // declare getter methods --  declare a getter method for each of the instance variables whose values should be made available to the other classes that use this instantiable class; for example, the class with the main() method which uses this instantiable class (i.e. Theatre2App.java) would use the getter method to retrieve the price of a ticket
    // getter method to retrieve the ticket's price
    public int getPrice(){
        return price;
    }

    // declare a method to implement the actual processing: based on a given day and age determine the price of a ticket
    public void calculatePrice(){

        // the program should work irrespective of the way the day is written (e.g. lower case, upper case or a combination of the two)
        // therefore we must convert all the letters to either lower case or upper case
        // convert the way the day is written to lower case and store the result into the instance variable day
        // we can store the lower case version in the instance variable day because we do not need the previous content (i.e. value) of that variable
        day = day.toLowerCase();

        // check the day of the week
        // because we converted the day to lower case the selection statement should check the day against lower case Strings that represent the names of the days
        // use 2 nested if else selection statements to determine the cost of a theatre ticket based on a given day and age
        // outer if to determine the cost of the ticket based on the given day
        if (day.equals("monday") || day.equals("tuesday") || day.equals("wednesday") || day.equals("thursday")){
            // inner if to determine the cost of the ticket based on the given age
            if (age < 5 || age > 65) { // if age Under 5/ Over 65 then it's free
                price = 0;
            } else if (age >= 5 && age <= 15) { // if age between 5 and 15 inclusive the ticket is 15
                price = 15;
            } else { // if age higher than 15 and lower or equal with 65 then the ticket is 20
                price = 20;
            }
        } else if (day.equals("friday") || day.equals("saturday") || day.equals("sunday")) {
            if (age < 5 || age > 65) { // if age Under 5/ Over 65 then it's 5
                price = 5;
            } else if (age >= 5 && age <= 15) { // if age between 5 and 15 inclusive the ticket is 20
                price = 20;
            } else { // if age higher than 15 and lower or equal with 65 then the ticket is 30
                price = 30;
            }
        } else { // Q: why is this else branch needed? -- A: if the user entered an invalid day then we should not provide a valid price for the ticket
            price = -1;
        }
    }
}


