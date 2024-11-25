/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

import Armes.Epee;
import Personnages.Personnage;

/**
 *
 * @author natac
 */
public class Guerrier extends Personnage {
    private boolean aCheval;

    public Guerrier(String nom, int niveauVie, boolean aCheval) {
        super(nom, niveauVie);
        this.aCheval = aCheval;
    }

    public void setACheval(boolean aCheval) {
        this.aCheval = aCheval;
    }

    @Override
    public void attaquer(Personnage autre) {
        if (getArmeEnMain() instanceof Epee) {
            Epee epee = (Epee) getArmeEnMain();
            int degats = getArmeEnMain().getNiveauAttaque() * epee.getFinesse();
            if (aCheval) degats /= 2;
            autre.estAttaque(degats);
            seFatiguer();
            System.out.println(getNom() + " attaque " + autre.getNom() + " avec " + getArmeEnMain() + " infligeant " + degats + " dégâts.");
        } else {
            System.out.println(getNom() + " ne peut attaquer efficacement qu'avec une épée.");
        }
    }
}
