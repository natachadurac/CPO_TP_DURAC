/*
 * Natacha DURAC
 * 28/10/2024
 * TP2 Coder une première relation entre deux objets
 */
package tp2_relation_1_durac;

/**
 *
 * @author natac
 */
public class TP2_relation_1_DURAC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Voiture uneClio = new Voiture ("Clio", "Renault", 5 ) ;
        Voiture uneAutreClio = new Voiture ("Clio", "Renault", 5 ) ;
        Voiture une2008 = new Voiture ("2008", "Peugeot", 6 ) ;
        Voiture uneMicra = new Voiture ("Micra", "Nissan", 4 ) ;
        Personne bob = new Personne("Bobby", "Sixkiller");
        Personne reno = new Personne("Reno", "Raines");
        System.out.println("liste des voitures disponibles "+ uneClio +"\n" + uneAutreClio + "\n" + une2008 + "\n" + uneMicra ) ;
        
        bob.liste_voitures[0] = uneClio ;
        bob.nbVoitures = 1 ;
        uneClio.Proprietaire = bob ;
        System.out.println("La premiere voiture de Bob est " +bob.liste_voitures[0] ) ;
        
        bob.liste_voitures[1] = une2008 ;
        bob.nbVoitures = 2 ;
        une2008.Proprietaire = bob ;
        System.out.println("La deuxième voiture de Bob est " +bob.liste_voitures[1] ) ;
        
        reno.liste_voitures[0] = uneMicra ;
        reno.nbVoitures = 1 ;
        uneMicra.Proprietaire = reno ;
        System.out.println("La premiere voiture de Reno est " +reno.liste_voitures[0] ) ;
        
        reno.liste_voitures[1] = uneAutreClio ;
        reno.nbVoitures = 2 ;
        uneAutreClio.Proprietaire = reno ;
        System.out.println("La deuxieme voiture de Reno est " +reno.liste_voitures[1] ) ;
    }
    
}
