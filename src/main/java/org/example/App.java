package org.example;

public class App
{

    public static double Laske(int fahrenheit) {
        double celsius;

        celsius = ((fahrenheit - 32) * 5 / 9);
        System.out.println(celsius);
        return celsius;
    }


    public static void main( String[] args ) {

        System.out.println( "Let's calculate fahrenheit to celsius! :)" );

    }
}
