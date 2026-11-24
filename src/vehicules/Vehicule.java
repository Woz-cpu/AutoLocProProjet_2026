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
    //initialisation neutre
    public Vehicule(String immatriculation, String marque,String modele, double tarifJournalier){
        System.out.println("Constructeur d'initialisaiton appele");
        this.immatriculation =immatriculation;
        this.marque = marque;
        this.modele = modele;
        this.kilometrage = 0;
        this.tarifJournalier = tarifJournalier;
        this.disponible =true;
    }
    //constructeur de copie
    public Vehicule(Vehicule v){
        System.out.println("Constructeur de copie appele");
        if (v != null){
            this.immatriculation = v.immatriculation;
            this.marque = v.marque;
            this.modele = v.modele;
            this.kilometrage = v.kilometrage;
            this.tarifJournalier = v.tarifJournalier;
            this.disponible = v.disponible;
        }
    }
