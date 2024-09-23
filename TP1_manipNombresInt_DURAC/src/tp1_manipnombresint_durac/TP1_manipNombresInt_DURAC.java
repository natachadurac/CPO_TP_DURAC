/*
 * Natacha DURAC
 * 23/09/2024
 * TP1
 */
package tp1_manipnombresint_durac;

import java.util.Scanner;

/**
 *
 * @author natac
 */
public class TP1_manipNombresInt_DURAC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int entier1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Saisissez un entier");
        entier1=sc.nextInt();
        
        int entier2;
        System.out.println("Saisissez un deuxieme entier");
        entier2=sc.nextInt();
        
        int somme;
        somme=entier1+entier2;
        int difference;
        difference=entier1-entier2;
        int produit;
        produit=entier1*entier2;
        int quotient;
        quotient=entier1/2;
        int modulo;
        modulo=entier1%entier2;
        
        System.out.println("La somme est :"+somme);
        System.out.println("La différence est : "+difference);
        System.out.println("Le produit est : "+produit);
        System.out.println("Le quotient est : "+quotient);
        System.out.println("Le reste de la division est : "+modulo);
    }
    
}
