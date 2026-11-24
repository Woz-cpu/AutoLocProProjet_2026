package vehicules;
public class Vehicule{
    String immatriculation;
    String marque;
    String modele;
    int kilometrage;
    double tarifJournalier;
    boolean disponible;
//constructeur neutre
    public Vehicule(){
        System.out.println("Constructeur par defaut appele");
        this.immatriculation = "N/A";
        this.marque = "N/A";
        this.modele = "N/A";
        this.kilometrage = 0;
        this.tarifJournalier =0.0;
        this.disponible =true;
        
    }
    public Vehicule(String immatriculation, String marque,String modele, double tarifJournalier){
        System.out.println("Constructeur d initialisaiton appele");
    }
}