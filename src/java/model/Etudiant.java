/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author pc
 */

    public class Etudiant {
    String nom;
    int not1;
    int not2;

    public Etudiant(String nom, int not1, int not2) {
        this.nom = nom;
        this.not1 = not1;
        this.not2 = not2;
    }
   public float calcul(int not1,int not2) {
      return (not1+not2) /2;
   }
}

