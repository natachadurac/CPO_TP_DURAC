/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_durac;

/**
 *
 * @author natac
 */
public abstract class Arme {
    String nom;
    int niv_attaque;

    public Arme(String nom, int niv_attaque) {
        this.nom = nom;
        this.niv_attaque = niv_attaque;
    }
   
    @Override
    public String toString () {
        return "Le nom de l'arme est : "+nom+" Le niv attaque vaut : "+niv_attaque;
    }
}
