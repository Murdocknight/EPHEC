public class Etudiants{
  public static void main (String args[]){
    
    //Declaration de variables
    int matricule;
    int echec;
    int echecMat1;
    int echecMat2;
    int noEchec;
    int nbEleves;  //compteur d'éleves
    
    double result1;
    double result2;
    double moyenne;
    double moyenneMat1;
    double moyenneMat2;
    
    String matiere1 = "Math";
    String matiere2 = "Java";
     
    //Initialisation de variables
    echecMat1 = 0;
    echecMat2 = 0;
    noEchec = 0;
    nbEleves = 0;
    moyenneMat1 = 0;
    moyenneMat2 = 0;
    
    do{
      echec = 0;
      
      //Encodage de Matricule
        System.out.println("Introduisez le numéro de matricule de l'étudiant");
        matricule = Clavier.lireInt();
      
      //Enodage de cotes + calcul d'échecs
      if (matricule > 0){
        do{
          System.out.println("Introduisez la cote /20 de " + matiere1);
          result1 = Clavier.lireDouble();
        }while((result1 <=0) || (result1>=20));
        if (result1<10){
          echecMat1++;
          echec++;
        }
        do{
          System.out.println("Introduisez la cote /20 de " + matiere2);
          result2 = Clavier.lireDouble();
        }while((result2 <=0) || (result2>=20));
        if (result2<10){
          echecMat2++;
          echec++;
        }
        if ((result1>10) && (result2>10)){
          noEchec++;
        } 
        
        //Stockage des résultats pour le calcul de mayenne
        moyenne = (result1 + result2)/2;
        moyenneMat1 = moyenneMat1 + result1;
        moyenneMat2 = moyenneMat2 + result2;

        //Affichage pour l'étudiant donné
        System.out.println("La moyenne de l'étudiant PSR" + matricule + ": " + moyenne);
        System.out.println("Le nombre d'échecs de l'étudiant PSR" + matricule + ": " + echec);
        
        nbEleves++;  
      }else{
        System.out.println("Fin d'encodage");
      }   
    }while(matricule > 0);
    
    //Calcul de moyennes
    moyenneMat1 = moyenneMat1 / nbEleves;
    moyenneMat2 = moyenneMat2 / nbEleves;
    
    //Affichage
    System.out.println("La moyenne pour " + matiere1 + " de " + nbEleves + " étudiants : " + moyenneMat1);
    System.out.println("La moyenne pour " + matiere2 + " de " + nbEleves + " étudiants : " + moyenneMat2);
    System.out.println("Le nombre d'échecs en " + matiere1 + " sur " + nbEleves + " étudiants : " + echecMat1);
    System.out.println("Le nombre d'échecs en " + matiere2 + " sur " + nbEleves + " étudiants : " + echecMat2);
    System.out.println("Le nombre d'étudiants sans échec : " + noEchec);
    
  }
}