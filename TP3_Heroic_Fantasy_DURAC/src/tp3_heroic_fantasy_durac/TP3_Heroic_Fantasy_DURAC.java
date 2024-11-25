/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heroic_fantasy_durac;

import Armes.Epee;
import Armes.Baton;
import Armes.Arme;
import java.util.ArrayList;

/**
 *
 * @author natac
 */
public class TP3_Heroic_Fantasy_DURAC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Arme> armes = new ArrayList<Arme>();
        
        Epee epee1= new Epee("Excalibur",7,5) ;
        Epee epee2= new Epee("Durandal",4,7) ;
        
        Baton baton1= new Baton("Chene", 4, 5) ;
        Baton baton2= new Baton("Charme", 5, 6) ;
        
        armes.add(epee1);
        armes.add(epee2);
        armes.add(baton1);
        armes.add(baton2);
        
        for (int i = 0; i < armes.size(); i++) {
            Arme arme = armes.get(i);            
            System.out.println(arme);
        }
        
    }
    
}
