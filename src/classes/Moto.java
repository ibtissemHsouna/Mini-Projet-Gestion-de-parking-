/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;


public class Moto extends véhicule{
private int vitesseMax;
    public Moto(String marque, String modéle, String immatriculation,int vitesseMax) {
        super(marque, modéle, immatriculation);
        this.vitesseMax=vitesseMax;
    }

    public int getVitesseMax() {
        return vitesseMax;
    }

    public void setVitesseMax(int vitesseMax) {
        this.vitesseMax = vitesseMax;
    }
    
     @Override
    public String toString() {
        String affichage="La moto "+getMarque()+" "+getModéle()+"d'imatriculation"+getImmatriculation()+"a une vitesse maximale "+getVitesseMax();
        return affichage;
    }
}
