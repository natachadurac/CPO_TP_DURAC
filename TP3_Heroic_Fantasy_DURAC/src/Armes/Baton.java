/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

import Armes.Arme;

/**
 *
 * @author natac
 */
public class Baton extends Arme {
    private int age;

    public Baton(String nom, int age, int niv_attaque) {
        super(nom, niv_attaque);
        if (age > 100) {
            this.age = 100;
        } else if (age < 0) {
            this.age = 0;
        this.age = age;
        }
    }
    
    
}
