import java.util.*;
public class Meniu {
  public void afisazaTitlu(){
     System.out.println("----------------------------------------");
      System.out.println("          Meniul aplicatiei"             );
      System.out.println("----------------------------------------");
  }
 
  public void afisazaMeniu(){
      System.out.println("\n  0. Exit " );
      System.out.println("  1. Adauga un cumparator in magazin " );
      System.out.println("  2. Adauga un produs pentru un cumparator");
      System.out.println("  3. Afiseaza cumparatorii din magazin ");
      System.out.println("  4. Afiseaza produsele unui cumparator ");
      System.out.println("  5. Foloseste cabina " );
      System.out.println("  6. Elibereaza cabina " );
      System.out.println("  7. Afiseaza blugii din magazin");
      System.out.println("  8. Afiseaza suma platit de un cumparator ");
  }
 
  public int citesteOptiune(){
     Scanner sc = new Scanner(System.in);
     System.out.println(" \nAlege o optiune din meniu apasand un numar: " );
     int optiune=-1;
     while (optiune <0 || optiune >9){
        try{
         optiune = Integer.parseInt(sc.nextLine());
        }
        catch (NumberFormatException e){
            System.out.println(" \n Ai ales o optiune gresita. Te rog alege un numar:" );}
        };
     return optiune;
  }
  
  public boolean returenazaCardCumparator(){
      boolean booleanIntrodus=false;
      Scanner sc = new Scanner(System.in);
      boolean cardReducere=true;
      while(!booleanIntrodus){
            try{
               cardReducere =sc.nextBoolean();
               booleanIntrodus = true;
                }catch(InputMismatchException e ){
                 System.out.println("Introdu true sau false ! ")  ;
                 booleanIntrodus= false;
                 sc.next();
            }
      } 
      return cardReducere;
  }
  
  public double returneazaPret(){
      boolean booleanIntrodus=false;
      Scanner sc=new Scanner(System.in);
      double pret=0;
      while(!booleanIntrodus){
         try{
              pret=sc.nextDouble();
              booleanIntrodus=true;
              }catch(InputMismatchException e){
              System.out.println("Introdu un pret de tip double :");
              booleanIntrodus=false;
              sc.next();
          }
    }
    return pret;
  }
  
  public boolean returenazaBuzunare(){
      boolean booleanIntrodus=false;
      Scanner sc = new Scanner(System.in);
      boolean buzunare=true;
      System.out.println("Alege true daca are buzunare/false daca nu are");
      while(!booleanIntrodus){
            try{
               buzunare =sc.nextBoolean();
               booleanIntrodus = true;
                }catch(InputMismatchException e ){
                 System.out.println("Introdu true sau false ")  ;
                 booleanIntrodus= false;
                 sc.next();
            }         
      } 
      return buzunare;
  }
  
  public String returneazaTipPordus(){
     Scanner sc = new Scanner(System.in);
     String tipProdus="";
     while(!tipProdus.equals("tricou")&&!tipProdus.equals("blug")&&!tipProdus.equals("rochie")){
          System.out.println("Introdu un tip de produs");
          tipProdus=sc.nextLine();
            }
     return tipProdus;
  }
  
  public int getCod(){
      boolean booleanIntrodus=false;
      Scanner sc = new Scanner(System.in);
      int codCumparator=0;
      while(!booleanIntrodus){
            try{
               codCumparator= sc.nextInt();
               booleanIntrodus = true;
                }catch(InputMismatchException e ){
                 System.out.println("Introdu un cod numeric")  ;
                 booleanIntrodus= false;
                 sc.next();
            } 
      } 
      return codCumparator;
    }
  
  
}