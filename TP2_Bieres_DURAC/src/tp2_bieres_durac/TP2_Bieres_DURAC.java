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
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvee des trolls",7.0,"Dubuisson");
        uneBiere.lireEtiquette();
        
        BouteilleBiere deuxBiere = new BouteilleBiere("Leffe",6.6,"Abbaye de Leffe");
        deuxBiere.lireEtiquette();
        
        BouteilleBiere troisBiere = new BouteilleBiere("Heineken",5.0,"Abbaye de Heineken");
        troisBiere.lireEtiquette();
        
        BouteilleBiere quatreBiere = new BouteilleBiere("Chouffe",5.5,"Abbaye de Chouffe");
        quatreBiere.lireEtiquette();
        
        uneBiere.Décapsuler();
        troisBiere.Décapsuler();
        
        System.out.println(uneBiere);
        System.out.println(deuxBiere);
        System.out.println(troisBiere);
        System.out.println(quatreBiere);

    }
}
