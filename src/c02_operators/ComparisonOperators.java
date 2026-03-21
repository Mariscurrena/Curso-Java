package c02_operators;

public class ComparisonOperators {
    public static void main(String[] args){
        /* Operators - Allow performing operations with variables, constants and every kind of data.
           These are used in almost all operations and are fundamental to define the logic of
           every application */

        // Comparison/Relational Operators
        /* These operators just response with 'true' or 'false' about certain statements.
        * These are useful to compare values or conditions*/
        int a = 5;
        int b = 3;

        // '==' is equal than.
        /* IMPORTANT NOTE:
        * Assignation is using a single '='
        * Comparison is using double '=='*/
        System.out.println(a == b); // false
        System.out.println(a == 5); // true

        // '!=' is not equal than.
        System.out.println(a != b);

        System.out.println(a > b); // a is higher than b
        System.out.println(a >= b); // a is higher or equal than b
        System.out.println(a < b); // a is lower than b
        System.out.println(a <= b); // a is lower or equal than b

    }
}
