/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clans;

import java.util.Random;


/**
 *
 * @author humeau
 */
public class Clans {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Joueur j1 = new Joueur("j1");
        Joueur j2 = new Joueur("j2");

        Jeu j = new Jeu();
        
        j.run(j1, j2, false);

    }
}
