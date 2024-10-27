/*
 * Natacha DURAC
 * 27/10/2024
 * TP2 Manipulation des objets
 */
package tp2_manip_durac;

/**
 *
 * @author natac
 */
public class TP2_manip_DURAC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tartiflette assiette1 = new Tartiflette(500) ;
        Tartiflette assiette2 = new Tartiflette(600) ;
        Tartiflette assiette3 = assiette2 ; //ne crée pas un nouvel object, mais assiette3 a la même référence que assiette2
        
        System.out.println("nb de calories de Assiette 2 : " +assiette2.nbCalories) ;
        System.out.println("nb de calories de Assiette 3 : " +assiette3.nbCalories) ;
        
        assiette2.incrementerCalories(100);
        System.out.println("nb de calories de Assiette 2 : " +assiette2.nbCalories) ;
        System.out.println("nb de calories de Assiette 3 : " +assiette3.nbCalories) ;

    }
    
}
