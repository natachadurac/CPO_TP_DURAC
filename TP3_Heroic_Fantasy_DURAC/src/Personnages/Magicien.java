/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

import Armes.Baton;
import Personnages.Personnage;

/**
 *
 * @author natac
 */
public class Magicien extends Personnage {
    private boolean confirme;

    public Magicien(String nom, int niveauVie, boolean confirme) {
        super(nom, niveauVie);
        this.confirme = confirme;
    }

    public void setConfirme(boolean confirme) {
        this.confirme = confirme;
    }

    @Override
    public void attaquer(Personnage autre) {
        if (getArmeEnMain() instanceof Baton) {
            Baton baton = (Baton) getArmeEnMain();
            int degats = getArmeEnMain().getNiveauAttaque() * baton.getAge();
            if (confirme) degats /= 2;
            autre.estAttaque(degats);
            seFatiguer();
            System.out.println(getNom() + " attaque " + autre.getNom() + " avec " + getArmeEnMain() + " infligeant " + degats + " dégâts.");
        } else {
            System.out.println(getNom() + " ne peut attaquer efficacement qu'avec un bâton.");
        }
    }
}
