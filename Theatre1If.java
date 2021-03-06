package Lab3;


public class Theatre1If {
    // declare instance variables / data members
    private String day; // instance variable to store the day
    private int price; // instance variable to store the price of a ticket based on the given day

    public Theatre1If() {
        day = ""; // initialize the day with the empty string; by default the day instance variable is initialized with null;
        // the price will be initialized with zero
    }

    // declare a setter method for each of the instance variables that can be set/ assigned a value
    // setter method for the day instance variable
    public void setDay(String day){
        this.day = day;
    }


    // declare a getter method for each of the instance variables whose values should be made available to the other classes that use this instantiable class
    // for example, the class with the main() method which uses this instantiable class (i.e. Theatre1If.java) would use the getter method to retrieve the price of a ticket
    // getter method to retrieve the ticket price
    public int getPrice(){
        return price;
    }


    // the method which does the actual processing: based on a given day determines the price of the ticket
    public void calculatePrice(){
        // the program should work irrespective of the way the day is written (e.g. lower case, upper case or a combination of the two)
        // therefore we must convert all the letters to either lower case or upper case
        // convert the way the day is written to lower case and store the result into the instance variable day
        // we can store the lower case version in the instance variable day because we do not need the previous content (i.e. value) of that variable
        day = day.toLowerCase();

        // because we converted the day to lower case the selection statement should check the day against lower case Strings that represent the names of the days
        // uses the if selection statement to determine the price of a theatre ticket based on a given day
        if (day.equals("monday") || day.equals("tuesday") || day.equals("wednesday") || day.equals("thursday")){
            price = 20;
        } else if (day.equals("friday") || day.equals("saturday") || day.equals("sunday")){
            price = 30;
        } else { // why is this else branch needed? -- if the user entered an invalid day then we should not provide a valid price for the ticket
            price = -1;
        }
    }
}



