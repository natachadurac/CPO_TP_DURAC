/*
 * Natacha DURAC
 * 11/10/2024
 * TP2 convertisseur objet
 */
package tp2_convertisseurobjet_durac;

import java.util.Scanner;

/**
 *
 * @author natac
 */
public class TP2_convertisseurObjet_DURAC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Convertisseur convertisseur = new Convertisseur();
        
        System.out.println("Choisissez une conversion:\n");
        System.out.println("1. Celsius vers Kelvin\n2. Kelvin vers Celsius\n3. Fahrenheit vers Celsius\n4. Celsius vers Fahrenheit");
        
        int choix = scanner.nextInt();
        if (choix!=1 && choix!=2 && choix!=3 && choix!=4){
           System.out.println("Choix invalide. Veuillez réessayer.");
           return;
        }
        System.out.print("Entrez la température à convertir: ");
        double temperature = scanner.nextDouble();
        double resultat;
        
        if (choix == 1) {
            resultat = convertisseur.CelciusVersKelvin(temperature);
            System.out.println(temperature + " °C = " + resultat + " K");
        } else if (choix == 2) {
            resultat = convertisseur.KelvinVersCelcius(temperature);
            System.out.println(temperature + " K = " + resultat + " °C");
        } else if (choix == 3) {
            resultat = convertisseur.FarenheitVersCelcius(temperature);
            System.out.println(temperature + " °F = " + resultat + " °C");
        } else {
            resultat = convertisseur.CelciusVersFarenheit(temperature);
            System.out.println(temperature + " °C = " + resultat + " °F");
        }
        
        
        
        
        //convertisseur.CelciusVersKelvin(25);
        //convertisseur.KelvinVersCelcius(30);
        //Convertisseur convertisseur2 = new Convertisseur();
        //convertisseur.FarenheitVersCelcius(25);
        //convertisseur.CelciusVersFarenheit(25);
        //System.out.println(convertisseur);
        //System.out.println(convertisseur2);
    }
    
}
