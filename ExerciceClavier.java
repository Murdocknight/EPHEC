public class ExerciceClavier{
  public static void main (String args[]){
    int nb1, nb2, somme;
    
    System.out.println ("Donnez le premier nombre entier: ");
    nb1 = Clavier.lireInt();
    System.out.println ("Donnez le deuxième nombre entier: ");
    nb2 = Clavier.lireInt();
    somme = nb1 + nb2;
    System.out.print ("Somme de " + nb1 + " et " +nb2 + " est de : " + somme + "! Yay!");
  }
}