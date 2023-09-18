package org.example;

public class App
{

    public static double Laske(int fahrenheit) {
        double celsius;

        celsius = ((fahrenheit - 32) * 5 / 9);
        System.out.println(celsius);
        return celsius;
    }

    public static double Matka(int aloituspaikka, int loppupaikka) {
        int matka;

        matka = loppupaikka - aloituspaikka;
        System.out.println("Pisteiden " + aloituspaikka + " ja " + loppupaikka + " välimatka on " + matka);
        return matka;
    }


    public static void main( String[] args ) {

        System.out.println( "Let's calculate stuff :)");

    }
}
