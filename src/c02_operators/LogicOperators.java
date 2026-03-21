package c02_operators;

public class LogicOperators {
    public static void main(String[] args){
        /* Operators - Allow performing operations with variables, constants and every kind of data.
           These are used in almost all operations and are fundamental to define the logic of
           every application */
        /* Logic Operators
            --- These are used to combine boolean expressions (true or false) */

        // AND (&&) - Validates that all conditions are the true
        /* Truth Table - Search at Google
        | State 1 | State 2 | Result |
        |  true   |  true   |  true  |
        |  true   |  false  |  false |
        |  false  |  true   |  false |
        |  false  |  false  |  false |
         */
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);

        // AND Example
        System.out.println(3 > 2 && 5 == 2);

        // OR (||) - Validates that at least one condition are true
        /* Truth Table - Search at Google
        | State 1 | State 2 | Result |
        |  true   |  true   |  true  |
        |  true   |  false  |  true  |
        |  false  |  true   |  true  |
        |  false  |  false  |  false |
         */
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);

        // OR Example
        System.out.println(3 > 2 || 5 == 2);

        // NOT (!) - Invert the result
        /* Truth Table - Search at Google
        | State 1 | Result  |
        |  true   |  false  |
        |  false  |  true   |
         */
        System.out.println(!true);
        System.out.println(!false);

        // NOT Example
        System.out.println(!(3 > 2 || 5 == 2));
    }
}
