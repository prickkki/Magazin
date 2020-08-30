public class Rochie extends Produs {
    public Rochie(double pret, String culoare){
        super(pret,culoare);
    }
    
    @Override
    public String toString(){
     return "rochie cu pretul " +getPret()+ " si culoare " +getCuloare() ;
    }
}