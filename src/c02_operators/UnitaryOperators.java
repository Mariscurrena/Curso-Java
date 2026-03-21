package c02_operators;

public class UnitaryOperators {
    public static void main(String[] args){
        /* Operators - Allow performing operations with variables, constants and every kind of data.
           These are used in almost all operations and are fundamental to define the logic of
           every application */
        /* Uni Operators
        --- Operates only under one only operated. */
        int a = 3;
        int b = 5;

        System.out.println(+b);
        System.out.println(-a);
        System.out.println(++b); // Increment Operator - Increments before print
        System.out.println(--a); // Decrement Operator - Decrements before print

        System.out.println(b++); // Prints and then increments.
        b++;
        System.out.println(b);

        // NOT is usually consider as uni operator
    }
}
