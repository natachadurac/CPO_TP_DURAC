/*
 * Natacha DURAC
 * 23/09/2024
 * TP1
 */
package tp1_guessmynumber_durac;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author natac
 */
public class TP1_guessMyNumber_DURAC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random generateurAleat = new Random();
        //for (int i=1; i <= 5; i++){
            //int n = generateurAleat.nextInt(100);
            //System.out.println(n);
        int n = generateurAleat.nextInt(100);
        int valeur;
        int cpt;
        Scanner sc = new Scanner(System.in);
        valeur=sc.nextInt();
        cpt=1;
        if (n==valeur){
            System.out.println("Gagné !");
        }
        while (n!=valeur){
        
        if (n>valeur){
           System.out.println("Trop petit");
        }
        if (n<valeur){
            System.out.println("Trop grand");
        }
        System.out.println("Saisissez un nb entre 0 et 100");
        valeur=sc.nextInt();
        cpt+=1;
        }
        
        }
    }
    

