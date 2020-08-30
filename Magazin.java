 import java.util.*;
import static java.lang.System.out;
public class Magazin implements MagazinInterface{
            private static Magazin instance;
            public List<Cumparator> cumpList = new ArrayList<>();
            public List<Cabina> cabinaList = new ArrayList<>();
            private int codCumparator;
            Meniu meniu = new Meniu() ;
            
            Magazin (){
                  instantiazaCabinele();
                }
                
              public static final Magazin getInstance(){
                    if(instance== null){
                        instance = new Magazin();
                    }
                    return instance;
            }
            
            public void instantiazaCabinele(){
               Cabina cab1=new Cabina(1);
               Cabina cab2=new Cabina(2);
               Cabina cab3=new Cabina(3);
               cabinaList.add(cab3);
               cabinaList.add(cab1);
               cabinaList.add(cab2);
            }
              
             public void folosesteCabina(int cod) {
                System.out.println("Alege un cumparator pentru a proba produsele");
                 int codCumparator = meniu.getCod();
                 boolean codCorect=false;
                 while (!codCorect){
                        for(Cumparator c:cumpList){
                            if(c.codCumparator == cod) {
                                if (c.produseList.size()<=3){
                                    System.out.println("Alege o cabina");
                                    
                                    codCorect = true;
                                }
                            }
                        }   
                        if(!codCorect){          
                            System.out.println("Cumparatorul nu exista! Te rog introdu un cod din lista pentru a adauga produsul.");
                            cod = meniu.getCod();
                        }     
                    }
            }

            public void elibereazaCabina(){
            }
  
            public  void adaugaCumparator(String nume, String prenume, boolean cardReducere)
            throws PreaMultiCumparatori {
                    if(cumpList.size()<100)
                    {
                        Cumparator cump = new Cumparator(nume , prenume , cardReducere) ;  
                        cumpList.add(cump);
                        cump.codCumparator=genereazaCod();
                        System.out.println("S-a adugat un cumparator");
                    }          
                    else{   
                        throw new PreaMultiCumparatori();
                    }   
            }
  
            public void afisazaCumparatorii(){
                    cumpList.forEach(out::println) ;
            } 
     
            public void adaugaProdusPentruCumparator(int cod, Produs produs){
                    boolean codCorect=false;
                    while (!codCorect){
                        for(Cumparator c:cumpList){
                            if(c.codCumparator == cod) {
                                c.produseList.add(produs);
                                codCorect = true;
                            }
                        }   
                        if(!codCorect){          
                            System.out.println("Cumparatorul nu exista! Te rog introdu un cod din lista pentru a adauga produsul.");
                            cod = meniu.getCod();
                        }     
                    }
            } 
         
            public void afiseazaProdusePentruCumparator(int cod){
                    boolean codCorect=false;
                    while(!codCorect){
                        for(Cumparator c:cumpList){
                             if(c.codCumparator==cod){
                                 c.produseList.forEach(out::println);
                                 codCorect = true ;
                             }
                        }
                        if(!codCorect){
                                System.out.println("Introdu un cod din lista !");
                                cod = meniu.getCod();
                        }
                    }
            }
      
            public int genereazaCod(){ 
                    int codCumparator=0;
                    for (int i=0;i<cumpList.size();i++)
                    {
                            codCumparator=cumpList.size();
                        }     
                    return codCumparator;
            }
   
            public void afiseazaProduseDinMagazin(){
                    List<Produs> produseMagazinList = new ArrayList<>();
                    Produs tricou0= new Tricou ("verde" , 50 );
                    Produs blug0= new Blug (100 , "albastru" , true);
                    Produs rochie0 = new Rochie( 140 , " rosu " );
                    Produs tricou1= new Tricou ("alb" , 30 );
                    Produs blug1= new Blug (120 , "negru" , false);
                    Produs rochie1 = new Rochie( 200 , " galbena " );
                    produseMagazinList.add(tricou0); 
                    produseMagazinList.add(tricou1); 
                    produseMagazinList.add(blug0); 
                    produseMagazinList.add(blug1); 
                    produseMagazinList.add(rochie0); 
                    produseMagazinList.add(rochie1);                    
                    for (Produs p:produseMagazinList){
                         if (p  instanceof Blug){
                                System.out.println(p);
                         }
                    }
            } 
            
            public double vizualizareSuma(int cod){
                    double pretTotal=0;
                    boolean codCorect=false;
                    while(!codCorect){
                            for(Cumparator c:cumpList){
                               if(c.codCumparator==cod){ 
                                    for(Produs p: c.produseList){
                                        if (p instanceof Tricou & c.cardReducere ) {
                                         pretTotal+=p.getPret()-p.getPret()*0.15;
                                        } else{
                                        pretTotal+=p.getPret();
                                       }
                                    }
                                    codCorect=true;
                               } 
                          } 
                          if (!codCorect){
                                  System.out.println("Alege un cod din lista de cumparatori");
                                  cod = meniu.getCod();
                          }
                    }
                    return pretTotal;
            }
}
