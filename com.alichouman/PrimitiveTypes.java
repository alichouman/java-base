package com.alichouman;

public class PrimitiveTypes {

   /*
        Integer Types:
        byte: Occupies 8 bits and stores values from -128 to 127.
        short: Occupies 16 bits and stores values from -32,768 to 32,767.
        int: The most common integer data type, occupies 32 bits and stores values from -2^31 to 2^31-1.
        long: Occupies 64 bits and stores values from -2^63 to 2^63-1. It must be followed by the letter 'L' or 'l'.
   */

    byte myByte = 100;
    short myShort = 1000;
    int myInt = 100000;
    long myLong = 10000000000L;

    /*
        Floating Point Types:
        float: Occupies 32 bits and is used to represent floating point numbers
        simple precision. It must be followed by the letter 'F' or 'f'.
        double: Occupies 64 bits and is used to represent double precision floating point numbers. It is the standard floating point type in Java.
     */

    float myFloat = 3.14f;
    double myDouble = 3.14;

    /*
        Character Type:
        char: Occupies 16 bits and stores a single Unicode character. Must be used with single quotes.
     */

    char myChar = 'A';

    /*
        Boolean Type:
        boolean: Can store only two values: true or false .
        It is often used for conditions in flow control structures.
     */

    boolean isNew = false;

}
