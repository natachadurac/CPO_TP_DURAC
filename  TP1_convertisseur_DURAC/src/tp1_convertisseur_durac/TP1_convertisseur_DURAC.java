/*
 * Natacha DURAC
 * 23/09/2024
 * TP1
 */
package tp1_convertisseur_durac;

import java.util.Scanner;

/**
 *
 * @author natac
 */
public class TP1_convertisseur_DURAC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double temperature; //création d'une variable double
        Scanner sc = new Scanner(System.in);
        System.out.println("Bonjour, saisissez une valeur :");
        temperature=sc.nextDouble(); //affectation de la saisie de l'utilisateur dans la variable
        
        int valeur;
        System.out.println("Saisissez la conversion que vous souhaiter effectuer :\n1) De Celcius vers Kelvin\n2) De Kelvin vers Celcius\n3) De Farenheit vers Celcius\n4) De Celcius vers Farenheit\n5) De Kelvin vers Farenheit\n6) De Farenheit vers Kelvin");
        valeur=sc.nextInt();
        
        if (valeur == 1) {
            System.out.println(temperature + " degré Celsius est égal à " + CelciusVersKelvin(temperature) + " degrés Kelvin");
        } else if (valeur == 2) {
            System.out.println(temperature + " degré Kelvin est égal à " + KelvinVersCelcius(temperature) + " degrés Celsius");
        } else if (valeur == 3) {
            System.out.println(temperature + " degré Fahrenheit est égal à " + FarenheitVersCelcius(temperature) + " degrés Celsius");
        } else if (valeur == 4) {
            System.out.println(temperature + " degré Celsius est égal à " + CelciusVersFarenheit(temperature) + " degrés Fahrenheit");
        } else if (valeur == 5) {
            System.out.println(temperature + " degré Kelvin est égal à " + KelvinVersFarenheit(temperature) + " degrés Fahrenheit");
        } else if (valeur == 6) {
            System.out.println(temperature + " degré Fahrenheit est égal à " + FarenheitVersKelvin(temperature) + " degrés Kelvin");
        } else {
            System.out.println("Choix invalide !");
        }
        
    }

public static double CelciusVersKelvin (double tCelcius) {
    return tCelcius+273;
}
public static double KelvinVersCelcius (double tKelvin) {
    return tKelvin-273;
} 
public static double FarenheitVersCelcius (double tFarenheit) {
    return tFarenheit-32;
}
public static double CelciusVersFarenheit (double tCelcius) {
    return tCelcius+32;
}
public static double KelvinVersFarenheit (double tKelvin) {
    return tKelvin-459.67;
}
public static double FarenheitVersKelvin (double tFarenheit) {
    return tFarenheit+459.67;
}

}
