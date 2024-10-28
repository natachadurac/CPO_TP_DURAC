/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_durac;

/**
 *
 * @author natac
 */
public class Personne {
    String nom;
    String prenom;
    int nbVoitures =0;
    Voiture [] liste_voitures ;
    
    @Override
    public String toString () {
        return "Nom : "+ nom+"\n" +"Prenom :"+ prenom;
    }
    
    public Personne(String Nom, String Prenom){
        nom=Nom;
        prenom=Prenom;
        liste_voitures = new Voiture [3] ;
    }
    
    public boolean ajouter_voiture(Voiture voiture_a_ajouter) {
        if (voiture_a_ajouter.Proprietaire != null) {
            System.out.println("La voiture a déjà un proprietaire");
            return false;
        }

        if (nbVoitures >= 3) {
            System.out.println("Limite de 3 voitures atteinte");
            return false;
        }

        liste_voitures[nbVoitures] = voiture_a_ajouter;
        nbVoitures+=1;
        voiture_a_ajouter.Proprietaire = this;

        return true;
    }
}
