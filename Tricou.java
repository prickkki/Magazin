public class Tricou extends Produs {
    public Tricou( String culoare ,double pret){
          super(pret,culoare);
  }    
    
   @Override 
   public String toString(){
         return "tricou cu pretul de " +getPret()+ " si culoarea " +getCuloare() ;
  }
}