/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_durac;

/**
 *
 * @author natac
 */
public class Voiture {
    String Modele;
    String Marque;
    int PuissanceCV;
    Personne Proprietaire;
    
    public Voiture(String modele, String marque, int puissanceCV){
        Modele=modele;
        Marque=marque;
        PuissanceCV=puissanceCV;
        Proprietaire=null;
        
    }
    
    @Override
    public String toString () {
        return "Modele : "+ Modele+"\n" + "Marque : "+Marque+"\n" +"Puissance : "+ PuissanceCV;
    }
    
    
}
