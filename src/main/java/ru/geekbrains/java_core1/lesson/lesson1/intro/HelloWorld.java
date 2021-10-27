package ru.geekbrains.java_core1.lesson.lesson1.intro;

//UpperCamelCase ( PascalCase)someExampleLongNamedClass
public class HelloWorld {

    public static void main (String[] args){
 //      printHelloWorld();
        byte byteVariable;
        byteVariable=20;
 //       System.out.println(byteVariable);
        byte b = 14; //1 8bit -128..127
        short  shortVar = 90;//2 b 32768...32767
        int integerVar = 2_100_999_999; //4b -2.1b.
        long longVar = 1_999_999_222_545_999_999L;//8b

        double doubleVar = 10.1238;//8b
        float floatVar = 0.24f;//4b

        char charVar = 78;//2и 0юю65535
        char charVar1 = 'Q';
        char charVar2 ='\u0000';
        char charVar3 ='\u3278';
        System.out.println(charVar3 );

        boolean booleanVar = true;

        float f = 10.0f / 3;
        double d = 10.0 / 3;
        System.out.println("Double:" + d);
        System.out.println("Float" + f);

        String stringVar = new String ("Some");
        String s = "Hello";
        System.out.println(s);
        HelloWorld hw = new HelloWorld();
    }

    public static void printHelloWorld () {
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
    }

}
