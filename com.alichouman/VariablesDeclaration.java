package com.alichouman;

import java.util.Arrays;

public class VariablesDeclaration {

    public static void main(String[] args) {

        //Primitive types
        int age = 25;
        double salary = 3000.00;
        char gender = 'M';
        boolean isActive = true;

        //Reference types
        String name = "Bill";
        int[] numbers = {1,2,3,4,5,6};
        Object object = new Object();

        int number; // Variable declaration
        number = 42; // Variable initialization

        int otherNumber = 10; // Variable declaration and initialization

        /*
            Variable names in Java must start with a letter, underscore
            (_) or dollar sign ($).
            After the first character, you can use letters, numbers, underscores, or dollar signs.
            Reserved keywords (such as int , double , if , etc.) cannot be used as variable names.
            Java is case sensitive, so age and Age are considered different.
         */
        int myVariable;
        double mySalary;

    }
}
