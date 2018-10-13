public class Commercant{
  public static void main (String args[]){
    //Constantes
    final int p1 = 10; 
    final int p2 = 5;
    final int p3 = 20;
    
    //Variables
    int q1, q2, q3; //quantités
    int tot1, tot2, tot3; //total par prix
    int somme; //montant à payer en total
    
    //Introduction de données au clavier
    System.out.println("Quantité du 1er produit: ");
    q1 = Clavier.lireInt();
    System.out.println("Quantité du 2ème produit: ");
    q2 = Clavier.lireInt();
    System.out.println("Quantité du 3ème produit: ");
    q3 = Clavier.lireInt();
    
    //Calcul et affichage du prix total
    somme = tot1 + tot2 + tot3;
    System.out.print("Prix à payer est de: " + somme);
  }
}