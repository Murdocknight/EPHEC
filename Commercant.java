public class Commercant{
  public static void main (String args[]){
    //Constantes
    final int p1 = 10; 
    final int p2 = 5;
    final int p3 = 20;
    
    //Variables
    int q1, q2, q3; //quantit�s
    int tot1, tot2, tot3; //total par prix
    int somme; //montant � payer en total
    
    //Introduction de donn�es au clavier
    System.out.println("Quantit� du 1er produit: ");
    q1 = Clavier.lireInt();
    System.out.println("Quantit� du 2�me produit: ");
    q2 = Clavier.lireInt();
    System.out.println("Quantit� du 3�me produit: ");
    q3 = Clavier.lireInt();
    
    //Calcul et affichage du prix total
    somme = tot1 + tot2 + tot3;
    System.out.print("Prix � payer est de: " + somme);
  }
}