import java.util.Scanner;

public class Bridge{
  public static void main (String args[]){
    
    //Déclaration de variables
    int cpt;
    int p;
    int t;
    int k;
    int c;
    
    int a;
    int r;
    int d;
    int v;
    
    char valeur;
    char couleur;
    Scanner clavier = new Scanner(System.in);
    
    int pHonneur;
    int pDistrib;
    int totalMain;
 
    //Initialisation de variables
    p = 0;
    t = 0;
    k = 0;
    c = 0;
    
    a = 0;
    r = 0;
    d = 0;
    v = 0;
    
    pDistrib = 0;
    
    //Encodage de cartes
    for(cpt = 0; cpt<13; cpt++){
      do{
        System.out.println("Introduire la valeur de la carte");
        valeur = clavier.next().charAt(0);
      }while((valeur != 'A') && (valeur != 'a') && (valeur != 'R') && (valeur != 'r') && (valeur != 'D') && (valeur != 'd') 
           &&(valeur != 'V') && (valeur != 'v') && (valeur != 'X') && (valeur != 'x') && (valeur != '9') && (valeur != '8')
           &&(valeur != '7') && (valeur != '6') && (valeur != '5') && (valeur != '4') && (valeur != '3') && (valeur != '2'));
      if ((valeur == 'A') || (valeur == 'a')){
        a++;
      }else if ((valeur == 'R') || (valeur == 'r')){
        r++;
      }else if ((valeur == 'D') || (valeur == 'd')){
        d++;
      }else if ((valeur == 'V') || (valeur == 'v')){
        v++;
      }
      
      do{
        System.out.println("Introduire la couleur de la carte");
        couleur = clavier.next().charAt(0);
      }while((couleur != 'P') && (couleur != 'p') && (couleur != 'T') && (couleur != 't') && (couleur != 'C') && (couleur != 'c')
           &&(couleur != 'K') && (couleur != 'k'));
      if ((couleur == 'P') || (couleur == 'p')){
        p++;
      }else if ((couleur == 'T') || (couleur == 't')){
        t++;
      }else if ((couleur == 'K') || (couleur == 'k')){
        k++;
      }else if ((couleur == 'C') || (couleur == 'c')){
        c++;
      }
    }
    
    //Calcul de points
    pHonneur = (a*4) + (r*3) + (d*2) + (v*1);

    if (p == 0){
      pDistrib = pDistrib + 3;
    }else if (p == 1){
      pDistrib = pDistrib + 2;
    }else if (p == 2){
      pDistrib = pDistrib + 1;
    }else if (p >5){
      pDistrib = pDistrib + (p - 5);
    }
    
    if (t == 0){
      pDistrib = pDistrib + 3;
    }else if (t == 1){
      pDistrib = pDistrib + 2;
    }else if (t == 2){
      pDistrib = pDistrib + 1;
    }else if (t >5){
      pDistrib = pDistrib + (t - 5);
    }
    
    if (k == 0){
      pDistrib = pDistrib + 3;
    }else if (k == 1){
      pDistrib = pDistrib + 2;
    }else if (k == 2){
      pDistrib = pDistrib + 1;
    }else if (k >5){
      pDistrib = pDistrib + (k - 5);
    }
    
    if (c == 0){
      pDistrib = pDistrib + 3;
    }else if (c == 1){
      pDistrib = pDistrib + 2;
    }else if (c == 2){
      pDistrib = pDistrib + 1;
    }else if (c >5){
      pDistrib = pDistrib + (c - 5);
    }
    
    totalMain = pHonneur + pDistrib;
    System.out.println("Total de points d'honneur: " + pHonneur);
    System.out.println("Total de points de distribution: " + pDistrib);
    System.out.println("Total de la main: " + totalMain);
    
    
    System.out.println("TEST ");
    System.out.println("P="+p);
    System.out.println("T="+t);
    System.out.println("K="+k);
    System.out.println("C="+c);
    System.out.println("A="+a);
    System.out.println("R="+r);
    System.out.println("D="+d);
    System.out.println("V="+v);
    
  }
}