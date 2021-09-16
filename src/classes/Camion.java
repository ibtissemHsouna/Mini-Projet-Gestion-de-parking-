/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author poste
 */
  public class Camion extends véhicule {

      private boolean remorque;
    public Camion(String marque, String modéle, String immatriculation,boolean remorque) {
        super(marque, modéle, immatriculation);
        this.remorque=remorque;
    }

    public boolean isRemorque() {
        return remorque;
    }

    public void setRemorque(boolean remorque) {
        this.remorque = remorque;
    }
    
     @Override
    public String toString() {
        String affichage;
        if(isRemorque())
            affichage="Le camion "+getMarque()+" "+getModéle()+"d'imatriculation"+getImmatriculation()+"contient un remorque";
        else
             affichage="Le camion "+getMarque()+" "+getModéle()+"d'imatriculation"+getImmatriculation()+" ne contient pas un remorque";
        return affichage;
    }
    
    
    
}
