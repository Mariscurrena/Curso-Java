package c02_operators;

public class AssignationOperators {
    public static void main(String[] args){
        /* Operators - Allow performing operations with variables, constants and every kind of data.
           These are used in almost all operations and are fundamental to define the logic of
           every application */

        // Assignation Operators
        /* Allow assigning values to variables, not only numerical values, all types of values (String, char, Object
        * float, double, etc)
        '=' is the most common one.
        */
        var a = 5;
        var b = 3;

        a = b; //Assignation of other variables value
        System.out.println(a);

        a = b * 2; //Assignation using a variable value modified with arithmetic.
        System.out.println(a);

        a += 1; //Direct assignation operator. Short way than a = a + 1. It's really useful in loops.
        System.out.println(a);

        // Direct Assignations examples. The IDE itself infers the result's operation
        a -= 1; // a = a - 1 // 7 = 7 - 1 // a = 6
        System.out.println(a);

        a *= 1; // a = a * 1 // 6 = 6 * 1 // a = 6
        System.out.println(a);

        a /= 1; // a = a / 1 // 6 = 6 / 1 // a = 6
        System.out.println(a);
    }
}
