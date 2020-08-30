public abstract class Produs {
  private double pret;
  private String culoare;
  public int codCumparator;
  public Produs(double pret, String culoare){
      this.pret=pret;
      this.culoare=culoare;
  }
    
  public double getPret(){
      return this.pret;
  }
    
  public void setPret(double pret){
      this.pret = pret;
  }
  
  public String getCuloare(){
      return this.culoare;
  }
  
}