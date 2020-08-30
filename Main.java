// cazurile 5 si 6 nu am reusit sa le termin ! 

import java.util.*;
public class Main {
  public static final int CAZ_EXIT=0;
  public static final int CAZ_ADAUGA_CUMPARATOR=1;
  public static final int CAZ_ADAUGA_UN_PRODUS_PENTRU_UN_CUMPARATOR=2;
  public static final int CAZ_AFISAZA_CUMPARATORII=3;
  public static final int CAZ_AFISAZA_PRODUSELE_UNUI_CUMPARATOR=4;
  public static final int CAZ_AFISAZA_BLUGII_DIN_MAGAZIN=7;
  public static final int CAZ_AFISAZA_SUMA_CUMPARATORULUI=8;
  
   public static void main (String [] args){
      Meniu meniu = new Meniu();
      Magazin magazin = Magazin.getInstance();
      Scanner sc = new Scanner(System.in);
      meniu.afisazaTitlu();
      Thread t = new Thread (new TimpulDeFunctionare());
      t.start();
      while(true){
           meniu.afisazaMeniu();
           int optiune=meniu.citesteOptiune();
           switch(optiune){  
                case CAZ_EXIT:// 0.
                     System.out.println("Se inchide aplicatia ");
                     System.exit(100);
                break;
                ///////////////////////////////////////////////////////////////////////////////////////////////////////
                case CAZ_ADAUGA_CUMPARATOR:// 1.   
                     System.out.println("Scrie numele cumparatorului " );
                     String nume=sc.nextLine();
                     System.out.println("Scrie prenumele cumparatorului");
                     String prenume=sc.nextLine();
                     System.out.println("Scrie true daca are card de cumparatori / false daca nu are" );
                     boolean cardCumparator=meniu.returenazaCardCumparator();
                     try{
                         magazin.adaugaCumparator(nume, prenume, cardCumparator);
                      }catch(PreaMultiCumparatori e ){
                          System.out.println("Prea multi cumparatori. Cumparatorul tau nu s-a adaugat! ");
                } 
                
                break;
                ///////////////////////////////////////////////////////////////////////////////////////////////////////////////
                case CAZ_ADAUGA_UN_PRODUS_PENTRU_UN_CUMPARATOR:// 2.
                     System.out.println("Alege numarul cumparatorului din lista :");
                     magazin.afisazaCumparatorii();
                     int codCumparator = meniu.getCod();
                     System.out.println("Alege tipul produsului: tricou/blug/rochie");
                     String tipProdus = meniu.returneazaTipPordus();
                     System.out.println("Alege Culoarea produsului"); 
                     String culoare=sc.nextLine();
                     System.out.println("Alege pretul produsului ");
                     double pret=meniu.returneazaPret();
    
                     if(tipProdus.equals("blug")){
                       boolean buzunare=meniu.returenazaBuzunare();
                       Produs blug = new Blug(pret,culoare,buzunare);
                       magazin.adaugaProdusPentruCumparator(codCumparator,blug);
                }
                
                    if(tipProdus.equals("tricou")){
                      Produs tricou = new Tricou(culoare,pret);
                      magazin.adaugaProdusPentruCumparator(codCumparator,tricou);
                }
                
                    if(tipProdus.equals("rochie")){
                      Produs rochie= new Rochie(pret,culoare);
                      magazin.adaugaProdusPentruCumparator(codCumparator,rochie);
                }
                break;
                ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                case CAZ_AFISAZA_CUMPARATORII:// 3.
                     magazin.afisazaCumparatorii();
                break;
                ///////////////////////////////////////////////////////////////////////////////////////////////////////////////
                case CAZ_AFISAZA_PRODUSELE_UNUI_CUMPARATOR:// 4.
                     System.out.println("Alege numarul cumparatorului din lista :");
                     magazin.afisazaCumparatorii();
                     int cumparator=meniu.getCod();
                     magazin.afiseazaProdusePentruCumparator(cumparator);
                break;
                /////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                case CAZ_AFISAZA_BLUGII_DIN_MAGAZIN://7.
                     System.out.println("Blugii din magazin sunt : " );
                     magazin.afiseazaProduseDinMagazin();
                break;
                //////////////////////////////////////////////////////////////////////////////////////////////////////////
                case CAZ_AFISAZA_SUMA_CUMPARATORULUI://8.
                     System.out.println("Alege numarul cumparatorului din lista :");
                     magazin.afisazaCumparatorii();
                     cumparator=meniu.getCod();
                     double pretTotal=magazin.vizualizareSuma(cumparator);
                     System.out.println("Pretul platit de cumparator este de " + pretTotal );
                break;
     
           
              
          }   
      } 
  }
}
      
 