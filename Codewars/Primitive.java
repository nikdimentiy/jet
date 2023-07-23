// Preparation for coding interview: CodeWars task: solution -> https://www.codewars.com/kata/557810cf791bbfd5ff00008f/java

import java.math.*; // import the java.math package for BigInteger class

public class Primitive {

    public String determineType(String number) {
        BigInteger value = new BigInteger(number); // create a BigInteger object from the input string

        // compare the value with the minimum and maximum values of byte type
        if (value.compareTo(BigInteger.valueOf(Byte.MIN_VALUE)) >= 0 &&
            value.compareTo(BigInteger.valueOf(Byte.MAX_VALUE)) <= 0) {
            return "byte"; // return "byte" if the value is in the range
        } 
        // compare the value with the minimum and maximum values of short type
        else if (value.compareTo(BigInteger.valueOf(Short.MIN_VALUE)) >= 0 &&
                   value.compareTo(BigInteger.valueOf(Short.MAX_VALUE)) <= 0) {
            return "short"; // return "short" if the value is in the range
        } 
        // compare the value with the minimum and maximum values of int type
        else if (value.compareTo(BigInteger.valueOf(Integer.MIN_VALUE)) >= 0 &&
                   value.compareTo(BigInteger.valueOf(Integer.MAX_VALUE)) <= 0) {
            return "int"; // return "int" if the value is in the range
        } 
        // compare the value with the minimum and maximum values of long type
        else if (value.compareTo(BigInteger.valueOf(Long.MIN_VALUE)) >= 0 &&
                   value.compareTo(BigInteger.valueOf(Long.MAX_VALUE)) <= 0) {
            return "long"; // return "long" if the value is in the range
        } else {
            return "none"; // return "none" if the value is out of the range of any primitive type
        }
    }

    public static void main(String[] args) {
        Primitive primitive = new Primitive(); // create a Primitive object

        String[] integerStrings = {"100", "50000", "1000000", "-120", "30000"}; // an array of strings representing integers

        for (String num : integerStrings) { // loop through each string in the array
            String type = primitive.determineType(num); // call the determineType method and store the result in type variable
            System.out.println(num + ": " + type); // print the input string and its corresponding type
        }
    }
}
