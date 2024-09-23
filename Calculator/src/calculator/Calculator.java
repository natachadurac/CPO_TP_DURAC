/*
 * Natacha DURAC
 * 23/09/2024
 * Partie 3 TP0
 */
package calculator;

import java.util.Scanner;

/**
 *
 * @author natac
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Please enter the operator :\n 1) add\n 2) substract\n 3) multiply\n 4) divide\n 5) modulo");
        int operateur;
        Scanner sc = new Scanner(System.in);
        operateur=sc.nextInt();
        
        if (operateur<1 || operateur>5){
           System.out.println("Choisissez une valeur entre 1 et 5");
        }
        
        int operande1;
        System.out.println("\n Saisir une premiere valeur");
        operande1=sc.nextInt();
        
        int operande2;
        System.out.println("\n Saisir une deuxieme valeur");
        operande2=sc.nextInt();
        
        if (operateur==1){
           System.out.println(operande1+operande2); 
        }
        if (operateur==2){
           System.out.println(operande1-operande2); 
        }
        if (operateur==3){
           System.out.println(operande1*operande2); 
        }
        if (operateur==4){
           System.out.println(operande1/operande2); 
        }
        if (operateur==5){
           System.out.println(operande1%operande2); 
        }
        
        System.exit(0); 
    }
    
}
