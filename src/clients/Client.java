package clients;

public class Client {
    public String nom;
    public String prenom;
    public String numeroPermis;
    public String telephone;
    public int anneeNaissance;

    public Client() {
    this.nom = "N/A";
    this.prenom = "N/A";
    this.numeroPermis = "N/A";
    this.telephone = "N/A";
    this.anneeNaissance = 2000;
    }

    public Client(String nom, String prenom, String numeroPermis, String telephone, int anneeNaissance) {
        this.nom = nom;
        this.prenom = prenom;
        this.numeroPermis = numeroPermis;
        this.telephone = telephone;
        this.anneeNaissance = anneeNaissance;
        System.out.println("Nom: " + this.nom);
        System.out.println("Prénom: " + this.prenom);
        System.out.println("Numéro de permis: " + this.numeroPermis);
        System.out.println("Téléphone: " + this.telephone);
        System.out.println("Année de naissance: " + this.anneeNaissance);
    }

    public Client(Client c) {
        this(c.nom, c.prenom, c.numeroPermis, c.telephone, c.anneeNaissance);
    }

    public int calculerAge(int anneeCourante) {
        return anneeCourante - anneeNaissance;
    }
}