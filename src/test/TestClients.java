package test;
import clients.Client;

public class TestClients {
    public static void main(String[] args) {
    Client client1 = new Client( "Sean", "MOY", "6767676767", "1234567890", 2007);
    System.out.println("\nNom client1: " + client1.getNom() + "\n");
    Client client2 = new Client();
    System.out.println("\nNom client2: " + client2.getNom() + "\n");
    System.out.println("Nombre de clients crees: " + Client.getCompteurClients());
    }
}
