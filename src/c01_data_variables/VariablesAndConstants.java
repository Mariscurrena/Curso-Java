package c01_data_variables;

public class VariablesAndConstants {
    public static void main(String[] args){
        //Tipos de variables

        // Tipo de dato | nombre de la variable | = inicializacion | Punto y coma
        // String
        String name = "Angel! :)";
        System.out.println(name);

        // Integer
        int age = 24;
        System.out.println(age);

        // Re-initialize a variable updating the value
        name = "Esteban";
        System.out.println(name);

        // Re-initialize a variable with a different variable type
        // Java is a static type language, so it doesn't allow define a variable with a different type.
        // name = 24; // --- Error
        // Due to Java is a compiled language instead of an interpreted one, an error failed the program in the compilation even before the program is actually run.
        name = "24";
        System.out.println(name);

        // Constants
        // // A variable can change their value while the program is executed, while a constant cannot change the value once is defined.
        // // Use the reserved word 'final'
        // // Best Practice: Constant's names are always in Upper case to identify them faster.
        // // Not all programming languages have constants, it depends on the definition of it.
        final String EMAIL = "angel@demo.com";
        // email = "angelmariscurrena@demo.com"; // Error - Its a constant
        System.out.println(EMAIL);

        // VAR
        // // 'var' is part of the changes introduced on the new Java Versions.
        // // 'var' is a reserved word that supports define any kind of type. Infering the type from the value
        // // 'var' is really similar than the JS definition.
        // // 'var' neither allow dynamic var.
        // // Type Inference
        var email = "angel@demo.com";
        // email = 43; // error
        System.out.println(email);

        var year = 1999;
        // var int year = 1999; // Error, one or another
        System.out.println(year);
    }
}