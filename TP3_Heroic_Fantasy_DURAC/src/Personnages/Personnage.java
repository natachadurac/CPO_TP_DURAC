/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;
import Armes.*;
import tp3_heroic_fantasy_durac.etreVivant;
import Personnages.*;



/**
 *
 * @author natac
 */
import java.util.ArrayList;

public abstract class Personnage implements etreVivant {
    private String nom;
    private int niveauVie;
    private ArrayList<Arme> inventaire = new ArrayList<>();
    private Arme armeEnMain = null;
    private static int nbPersonnages = 0;

    public Personnage(String nom, int niveauVie) {
        this.nom = nom;
        this.niveauVie = Math.max(niveauVie, 0);
        nbPersonnages++;
    }

    public String getNom() {
        return nom;
    }

    public int getNiveauVie() {
        return niveauVie;
    }

    public void ajouterArme(Arme arme) {
        if (inventaire.size() < 5) {
            inventaire.add(arme);
        }
    }

    public Arme getArmeEnMain() {
        return armeEnMain;
    }

    public boolean equiperArme(String nomArme) {
        for (Arme arme : inventaire) {
            if (arme.getNom().equals(nomArme)) {
                armeEnMain = arme;
                System.out.println(nom + " est maintenant équipé avec " + arme);
                return true;
            }
        }
        System.out.println("Arme " + nomArme + " introuvable dans l'inventaire de " + nom);
        return false;
    }

    @Override
    public String toString() {
        return "Personnage: " + nom + ", Vie: " + niveauVie +
                ", Arme en main: " + (armeEnMain != null ? armeEnMain : "Aucune");
    }

    public static int getNbPersonnages() {
        return nbPersonnages;
    }

    public void seFatiguer() {
        niveauVie = Math.max(niveauVie - 10, 0);
    }

    public boolean estVivant() {
        return niveauVie > 0;
    }

    public void estAttaque(int points) {
        niveauVie = Math.max(niveauVie - points, 0);
    }

    public abstract void attaquer(Personnage autre);
}


