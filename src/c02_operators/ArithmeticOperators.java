package c02_operators;

public class ArithmeticOperators {
    public static void main(String[] args){
        /* Operators - Allow performing operations with variables, constants and every kind of data.
           These are used in almost all operations and are fundamental to define the logic of
           every application */

        // Arithmetic Operators
        /* These are the operators used to perform math operations such as add, less, module, multiplication, division
        and even complex operation */

        // Addition
        int a = 5;
        int b = 3;
        System.out.println(a + b); // Useful to perform concatenation of Strings not only to addition numbers

        // Less
        System.out.println(a - b);

        // Multiplication
        System.out.println(a * b);

        // Division
        System.out.println(a / b); // The result is going to be in the same data type than the variables
        System.out.println((double)a/(double)b); // Casting to receive the decimal value

        // Module
        System.out.println(a % b); // The result of the rest of the division
    }
}
