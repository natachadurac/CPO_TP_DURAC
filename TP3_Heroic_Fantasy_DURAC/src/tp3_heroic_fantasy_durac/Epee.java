/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_durac;

/**
 *
 * @author natac
 */
public class Epee extends Arme {
    private int finesse;

    public Epee(String nom, int finesse, int niv_attaque) {
        super(nom, niv_attaque);
        if (finesse > 100) {
            this.finesse = 100;
        } else if (finesse < 0) {
            this.finesse = 0;
        this.finesse = finesse;
        }
    }

    @Override
    public String toString() {
        return "Epee{" +super.toString()+ "finesse=" + finesse + '}';
    }
    
    
}
