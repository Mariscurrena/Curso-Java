package c01_data_variables;

public class DataTypes {
    public static void main(String[] args){
        // Data Types and Primitive Types
        // // Primitive types of data are the main types where all the language has been developed.
        // // Combining these primitive data types we are able to create complex data types.

        // // data types beginning with lower letter are primitives, data types beginning with upper are complex

        // Most Basics...?

        // Integer - Data without decimals
        int myInt = 24;
        System.out.println(myInt);

        // Double - Data with decimals
        // // There's other types of decimal data types (float, short, long, byte, etc) change the long of memory/spaces. On this basic course let's focus on just double
        double myDouble = 24.85;
        System.out.println(myDouble);

        // Char - Characters, only with single ''
        char myChar = 'a';
        System.out.println(myChar);

        // Boolean - Bool Logic, true or false
        boolean myBool = false;
        myBool = true;
        System.out.println(myBool);

        // String - It's not a primitive type, actually is a class, complex data
        // // However, due to String is used quite often, it's common to hear that String is a kind of primitive data type.
        String myString = "Hi! :)";
        System.out.println(myString);

        // How to know the data time while compiling?
        // // It's easier to work with class' objects.
        // // All primitive data type have their equivalence with Classes
        System.out.println(myString.getClass().getSimpleName()); // Only useful with objects.
        // // myString is an object, for that reason it has the .getClass() method.
        // // int x = 10 is just a memory space (stack). It doesn't have methods, properties or a way to know who it is.

        // There's a couple of ways to do it with primitive data types.
        // // 1. Involve the primitive on an object, Java automatically convert it. This is called autoboxing.
        // // // Now is an object and can use methods.
        int number = 100;
        System.out.println(((Object)number).getClass().getSimpleName());

        // // 2. Use the classes data types
        Double doubleClass = 123.456;
        System.out.println(doubleClass.getClass().getSimpleName());

        // // 3. Use instanceof method, however, the primitive must be involved.
        char simpleChar = 'c';
        Object objectChar = (Object)simpleChar;
        if (objectChar instanceof Character){
            System.out.println("Char");
        }else{
            System.out.println("No Char");
        }
    }
}
