/*
 * Natacha DURAC
 * 11/10/2024
 * TP2 BIERES
 */
package tp2_bieres_durac;

/**
 *
 * @author natac
 */
public class TP2_Bieres_DURAC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BouteilleBiere uneBiere = new BouteilleBiere();
        uneBiere.nom = "Cuvée des trolls";
        uneBiere.degreAlcool = 7.0;
        uneBiere.brasserie="Dubuisson";
        uneBiere.ouverte=false;
        uneBiere.lireEtiquette();

    }
    
}
