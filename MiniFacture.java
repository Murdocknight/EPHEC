public class MiniFacture{
  public static void main (String args[]){
    //Constantes
    final int p1 = 10; 
    final int p2 = 15;
    final int p3 = 25; 
    final double tvaProd1  = 0.06;
    final double tvaProd2  = 0.21;
    final double ristourne = 0.04;
    final int remise = 25000;
    
    //Variables
    int q1, q2, q3; //quantités
    double tot1, tot2, tot3; //total par prix
    double somme; //montant à payer TVAC
    double ristTot; //ristourne totale en Euro
    double total; //prix client
    
    //Introduction de données au clavier
    System.out.println("Quantité du 1er produit: ");
    q1 = Clavier.lireInt();
    System.out.println("Quantité du 2ème produit: ");
    q2 = Clavier.lireInt();
    System.out.println("Quantité du 3ème produit: ");
    q3 = Clavier.lireInt();
    
    //Calcul du prix total
    tot1 = (p1*q1)+((p1*q1)*tvaProd1);
    tot2 = (p2*q2)+((p2*q2)*tvaProd1);
    tot3 = (p3*q3)+((p3*q3)*tvaProd2);
    somme = tot1 + tot2 + tot3;
    if (somme>remise){
      ristTot = somme * ristourne;
    }else{
      ristTot = 0;
    }
    total = somme - ristTot;
    
    //Affichage
    System.out.println("Prix à payer TVAC: " + String.format("%.2f",somme) + " €");   //moins de chiffres après la virgule c'est String.format("%.2f", VARIABLE)
    System.out.println("Ristourne "+ (ristourne*100) +"% client: " + String.format("%.2f", ristTot) + " €");
    System.out.println("Prix Client: " + String.format("%.2f",total) + " €");
  }
}