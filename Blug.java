public class Blug extends Produs {
   private boolean buzunare;
   public Blug(double pret, String culoare,boolean buzunare ){
        super(pret, culoare);
        this.buzunare=buzunare;
   }
   
   @Override 
   public String toString(){
       if(buzunare)
       return "blugi cu pretul de " + getPret() + " culoare "
        +getCuloare()+ " si au buzunare ";
      else{
        return "blugi cu pretul de " + getPret() + " culoare "
         +getCuloare()+ " si nu au buzunare ";
      }
   }
}
