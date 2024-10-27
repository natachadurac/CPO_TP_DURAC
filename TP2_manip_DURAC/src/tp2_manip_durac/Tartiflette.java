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
public class Tartiflette {
   int nbCalories;
   public Tartiflette(int nbcal) {
        nbCalories = nbcal;
    }
   
   public void incrementerCalories(int calories) {
        nbCalories += calories; // Incrémente nbCalories
    }
}
