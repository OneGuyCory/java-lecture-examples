package class01;

// TODO: import Scanner from java.util

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* PRINTING TO THE CONSOLE */

        // TODO: Use System.out to print to the console
        System.out.println("Printing to the console!");


        /* DECLARING AND INITIALIZING VARIABLES */

        // TODO: Declare and initialize several variables and print them to the console
        String name = "Cory";
        int age = 31;
        Boolean isTired = true;

        System.out.println("My name is " + name + " and I am " + age + " years old. If you asked me if I was tired I would tell you that was " + isTired);


        /* WRITING METHODS */

        // TODO: After coding your method below main(), call it here and print the result

        System.out.println(printName("Cory", "Deuschle"));


        /* USING METHODS FROM OTHER CLASSES */

        // TODO: Call each of the static methods from the Examples class

        Examples.sayHello("Cory");
        System.out.println(Examples.addThreeNums(2, 5, 12));

        /* USING SCANNER TO GET USER INPUT */

        // TODO: Declare and initialize a Scanner object using System.in
        Scanner input = new Scanner(System.in);

        // TODO: Get user input
        // Precede your input with output to the user so they know what you need
        System.out.println("what is your favorite color?");

        // Receive the input and store it in a variable
        String favColor = input.nextLine();
        // Do something with the stored user input
        System.out.println("Your favorite color is: " + favColor);
        // Always close the Scanner object at the end of the main method
        // for efficiency and security
        // TODO: Close Scanner
        input.close();
    }

    // TODO: Code a method to return a full name as a String using firstName and lastName
    public static String printName(String firstName, String lastName) {
        return  firstName + " " + lastName;
    }


}