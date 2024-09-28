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
        Scanner sc = new Scanner(System.in);
        
        //Le joueur choisit le niveau de difficulté
        System.out.println("Choisir la difficulte :\n1) Facile\n2) Normale\n3) Difficile");
        int difficulte = sc.nextInt();
        int nb_max_coups = 10; //Ces 10 coups correspondent au nombre de coups pour le niveau Normal
        
        //Les différentes conditions selon le niveau choisi
        
        if (difficulte==1){
           nb_max_coups=15;
           System.out.println("Vous avez 15 coups maximum");
        } else if (difficulte==2){
           nb_max_coups=10;
           System.out.println("Vous avez 10 coups maximum");
        } else if (difficulte==3){
           nb_max_coups=5;
           System.out.println("Vous avez 5 coups maximum"); 
        } else{
            System.out.println("Numero invalide, difficulte Normale par defaut\nVous avez 10 coups maximum");
        }
        
        //On génère le nombre à trouver
        int n = generateurAleat.nextInt(100);
        int valeur;
        int cpt =0;
        System.out.println("Donnez un nombre entre 0 et 100");
        
        while (cpt<nb_max_coups){
           valeur=sc.nextInt();
           cpt++;
           
           if (n==valeur){ //On teste si la valeur est égale au nombre, si oui le jeu s'arrête
            System.out.println("Gagne !");
            break;
           } else{
              if (n>valeur){ //On teste si la valeur est plus petite que le nombre
                  if (n-valeur>20){
                      System.out.println("Vraiment trop petit");
                  }else{
                      System.out.println("Trop petit");
                  }
              } else{
                  if (valeur-n>20){
                      System.out.println("Vraiment trop grand!");
                  }else{
                      System.out.println("Trop grand");
                  }
              }
              System.out.println("Tentative numero "+cpt+" sur "+nb_max_coups);
              if (cpt == nb_max_coups) {
                    System.out.println("Tentatives epuisees. Le nombre était " + n);
                } else {
                    System.out.println("Essayez encore");
              }
           }
        }
    }
}


