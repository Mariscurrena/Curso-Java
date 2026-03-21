package c01_data_variables;

public class VCEjemplos {
    public static void main(String[] args){
        // Tipo | Nombre | Inicializacion | Punto y Coma
        /*String myName = "Angel";
        System.out.println(myName);

        int myAge = 24;
        System.out.println(myAge);

        myName = "24";
        System.out.println(myName);

        double money;

        /// ////
        money = 1.23456789;
        System.out.println(money);

        /// ////// Constantes
        // final | Tipo | NOMBRE EN MAYUSCULAS | Inicializar | Punto y Coma
        final String EMAIL = "angelmariscurrena@demo.com";
        System.out.println(EMAIL);

        String emailTest = "angelmariscurrena@demo.com";
        emailTest = "N/A";
        System.out.println(emailTest);

        // VAR
        // Inferencia del tipo de variable
        var emailTestVar = "estebanmariscurrena@demo.com";
        System.out.println(emailTestVar);

        var ageVar = 24;
        System.out.println(ageVar);*/


        /*
        * Tipos de Datos
        * */

        //Integer
        /*int myInt = 6;
        System.out.println(myInt);

        double myDouble = 6.1666666;
        System.out.println(myDouble);

        char myChar = 'a';
        System.out.println(myChar);

        boolean myBool = true;
        System.out.println(myBool);

        String myString = "Hola";
        System.out.println(myString);

        String variable = "Texto";

        System.out.println(variable.getClass().getSimpleName());

        int numero = 10;
        System.out.println(((Object)numero).getClass().getSimpleName());

        Double doble = 234.234;
        System.out.println(doble.getClass().getSimpleName());

        char caracter = 'c';
        Object objectChar = (Object)caracter;
        if (objectChar instanceof Character){
            System.out.println("Char");
        }else{
            System.out.println("No Char");
        }*/

        // Ejercicios - HANDS ON LAB
        String myName = "Angel Mariscurrena"; // Ejercicio 1
        System.out.println(myName);

        int myAge = 24; // Ejercicio 2
        System.out.println(myAge);

        double myHeight = 1.85; // Ejercicio 3
        System.out.println(myHeight);

        boolean iLikeCoding = true; // Ejercicio 4
        System.out.println(iLikeCoding);

        final String MYEMAIL = "angelmariscurrena@gmail.com"; // Ejercicio 5
        System.out.println(MYEMAIL);

        char myLetter = 'a'; // Ejercicio 6
        System.out.println(myLetter);

        // Ejercicio 7
        String myHome = "Gustavo A. Madero";
        System.out.println(myHome);
        myHome = "Mexico";
        System.out.println(myHome);

        // Ejercicio 8
        int a = 12;
        int b = 18;
        System.out.println(a+b);

        // Ejercicio 9
        System.out.println(((Object)a).getClass().getSimpleName());
        System.out.println(((Object)b).getClass().getSimpleName());

        // Ejercicio 10
        int c;
        c = a*b;
        System.out.println(c);
    }
}
