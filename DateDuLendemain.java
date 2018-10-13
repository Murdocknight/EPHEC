public class DateDuLendemain{
  public static void main (String args[]){
       
    // Variables
    int jj;
    int mm;
    int aaaa;
    boolean anBis;
    int jjMax;
    
        
    anBis = false;
    
    // Encodage de données
    System.out.println("ENCODAGE DE DATE");
    System.out.println("Introduire le jour");
    jj   = Clavier.lireInt();
    System.out.println("Introduire le mois");
    mm   = Clavier.lireInt();
    System.out.println("Introduire l'année");
    aaaa = Clavier.lireInt();
    
    // Test de l'année bisextile
    if (aaaa%100==0){
      anBis = false;
    }else if (aaaa%400==0){
      anBis = true;
    }else if (aaaa%4==0){
      anBis = true;
    }
    System.out.println(aaaa + " bisextile? " + anBis);
    
    // mois de 30 et 31 jours
    if (anBis == false){
      if (mm ==2){
        jjMax = 28;
      }else if (mm%2==0){
        jjMax = 30;
      }else{
        jjMax = 31;
      }
    }else{
      if (mm ==2){
        jjMax = 29;
      }else if (mm%2==0){
        jjMax = 30;
      }else{
        jjMax = 31;
      }
    } 
    
    // Le jour de landemain
    if (jj<jjMax){
      jj++;
    }else if (jj==jjMax && mm<12){
      jj++;
      mm++;
    }else{
      jj++;
      mm++;
      aaaa++;
    }
    
    System.out.println("Demain nous sommes le " + jj + " /  " + mm + " / " + aaaa);
  }
}