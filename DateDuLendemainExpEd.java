public class DateDuLendemainExpEd{
  public static void main (String args[]){
    
    /* la deuxième version de l'exercice:
     * utilisation de switch et de tests d'erreur
     */
    
    // Variables
    int jj;
    int mm;
    int aaaa;
    boolean anBis;
    int jjMax;
    
    // Initialisation de variables
    anBis = false;
    jjMax=0;
    
    // Encodage de données
    System.out.println("ENCODAGE DE DATE");
    do{
      System.out.println("Introduire le jour");
      jj   = Clavier.lireInt();
    }while((jj<1) || (jj>31));
    do{
      System.out.println("Introduire le mois");
      mm   = Clavier.lireInt();
    }while((mm<1) || (mm>12));
    do{
      System.out.println("Introduire l'année");
      aaaa = Clavier.lireInt();
    }while((aaaa<1900) || (aaaa>2400));
    
    // Test de l'année bisextile
    if (aaaa%100==0){
      anBis = false;
    }else if (aaaa%400==0){
      anBis = true;
    }else if (aaaa%4==0){
      anBis = true;
    }
    System.out.println(aaaa + " bisextile? " + anBis);
    
    // Nombre maximum des jours du mois
    switch (mm){
      case 1: case 3: case 5: case 7: case 8: case 10: case 12: 
        jjMax = 31;
        break;
      case 4: case 6: case 9: case 11:
        jjMax = 30;
        break;
      default  : 
        if (anBis == true){
          jjMax = 29;
        }else{
          jjMax = 28;
        }
      } 
    
    // Le jour de landemain
    if (jj<jjMax){
      jj++;
    }else{ 
      jj=1;
    }
    if (mm<12){
      mm++;
    }else{
      mm=1;
      aaaa++;
    }
 
    System.out.println("Demain nous sommes le " + jj + " /  " + mm + " / " + aaaa);
  }
}