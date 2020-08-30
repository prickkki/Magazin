import java.util.*;

public class Cumparator{
   private String nume ;
   private String prenume;
   public boolean cardReducere;
   public int codCumparator;
   public List<Produs>produseList= new ArrayList<>();
   public Cumparator(){
    }
    
   public Cumparator(String nume, String prenume, boolean cardReducere)
   {this.nume=nume;
    this.prenume=prenume;
    this.cardReducere=cardReducere;
   }
   
   public boolean getcardReducere(){
      return this.cardReducere=cardReducere;
    }
    
   @Override 
   public String toString(){
       if (cardReducere==true){
        return codCumparator +" -> "+ "Numele este " + nume + " " +prenume+ " si are card de cumparaturi ";
    }
        else
        return codCumparator +" -> "+ "Numele este " + nume + " " +prenume+ " si nu are card de cumparaturi ";
     
   }
}