
package classes;

public class Voiture extends véhicule{

    private int nombrePorte;
    public Voiture(String marque, String modéle, String immatriculation,int nombrePortes) {
        super(marque, modéle, immatriculation);
        this.nombrePorte=nombrePorte;
    }

    public int getNombrePorte() {
        return nombrePorte;
    }

    public void setNombrePorte(int nombrePorte) {
        this.nombrePorte = nombrePorte;
    }

    @Override
    public String toString() {
        String affichage="la voiture "+getMarque()+" "+getModéle()+"d'imatriculation"+getImmatriculation()+"contient"+getNombrePorte();
        return affichage;
    }
    
    
    
}
