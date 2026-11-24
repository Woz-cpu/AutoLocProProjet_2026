package clients;

public class Client {
    private String nom;
    private String prenom;
    private String numeroPermis;
    private String telephone;
    private int anneeNaissance;

    public Client() {
    this.nom = "N/A";
    this.prenom = "N/A";
    this.numeroPermis = "N/A";
    this.telephone = "N/A";
    this.anneeNaissance = 2000;
    compteurClients++;
    System.out.println("Client cree via le constructeur par defaut :");
    System.out.println("Nom: " + this.nom);
    System.out.println("Prenom: " + this.prenom);
    System.out.println("Numero de permis: " + this.numeroPermis);
    System.out.println("Telephone: " + this.telephone);
    System.out.println("Annee de naissance: " + this.anneeNaissance);
    System.out.println("Nombre de clients crees: " + compteurClients);
    }

    public Client(String nom, String prenom, String numeroPermis, String telephone, int anneeNaissance) {
        this.nom = nom;
        this.prenom = prenom;
        this.numeroPermis = numeroPermis;
        this.telephone = telephone;
        this.anneeNaissance = anneeNaissance;
        compteurClients++;
        System.out.println("Client cree via le constructeur d'initialisation :");
        System.out.println("Nom: " + this.nom);
        System.out.println("Prenom: " + this.prenom);
        System.out.println("Numero de permis: " + this.numeroPermis);
        System.out.println("Telephone: " + this.telephone);
        System.out.println("Annee de naissance: " + this.anneeNaissance);
        System.out.println("Nombre de clients crees: " + compteurClients);
    }

    public Client(Client c) {
        this(c.nom, c.prenom, c.numeroPermis, c.telephone, c.anneeNaissance);
    }

    public int calculerAge(int anneeCourante) {
        return anneeCourante - anneeNaissance;
    }

    public String getNom() {
        return nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public String getNumeroPermis() {
        return numeroPermis;
    }
    public String getTelephone() {
        return telephone;
    }
    public int getAnneeNaissance() {
        return anneeNaissance;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public void setNumeroPermis(String numeroPermis) {
        this.numeroPermis = numeroPermis;
    }
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    public void setAnneeNaissance(int anneeNaissance) {
        this.anneeNaissance = anneeNaissance;
    }

    private static int compteurClients = 0;

    public static int getCompteurClients() {
        return compteurClients;
    }
}