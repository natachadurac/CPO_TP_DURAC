/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heroic_fantasy_durac;

import Armes.Epee;
import Armes.Baton;
import Armes.Arme;
import java.util.ArrayList;
import Personnages.Magicien;
import Personnages.Guerrier;
import Personnages.Personnage;



/**
 *
 * @author natac
 */
public class TP3_Heroic_Fantasy_DURAC {

    /**
     * @param args the command line arguments
     */

public class Main {
    public static void main(String[] args) {
        Epee excalibur = new Epee("Excalibur", 7, 5);
        Epee durandal = new Epee("Durandal", 4, 7);
        Baton chene = new Baton("Chêne", 4, 5);
        Baton charme = new Baton("Charme", 5, 6);

        Magicien gandalf = new Magicien("Gandalf", 65, true);
        Guerrier conan = new Guerrier("Conan", 78, false);

        gandalf.ajouterArme(chene);
        gandalf.ajouterArme(charme);
        gandalf.ajouterArme(excalibur);

        conan.ajouterArme(excalibur);
        conan.ajouterArme(durandal);

        gandalf.equiperArme("Chêne");
        conan.equiperArme("Excalibur");

        gandalf.attaquer(conan);
        conan.attaquer(gandalf);

        System.out.println(gandalf);
        System.out.println(conan);

        System.out.println("Nombre de personnages créés: " + Personnage.getNbPersonnages());
    }
}
}
