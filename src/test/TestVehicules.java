package test;
import java.util.Scanner;
import vehicules.Vehicule;

public class TestVehicules {
    public static void main(String[] args){

        Vehicule v1 = new Vehicule();
        v1.afficherInfos();

        Scanner sc = new Scanner(System.in);

        System.out.print("Immatriculation :");
        String immatriculation = sc.nextLine();
        System.out.print("Marque :");
        String marque = sc.nextLine();
        System.out.print("Modele :");
        String modele = sc.nextLine();
        
        Vehicule v2 = new Vehicule(immatriculation, marque, modele, 35.0);
        v2.afficherInfos();

        Vehicule v3 = new Vehicule(v2);
        v3.afficherInfos();

        //Test méthode
        System.out.print("Avant trajet : ");
        v2.afficherInfos();
        v2.rouler(250);
        System.out.print("Apres 250 km : ");
        v2.afficherInfos();

        sc.close();

    }

    
}
