import java.util.*;
public interface MagazinInterface{
  public void folosesteCabina(int cod);
  
  public void elibereazaCabina();
  
  public void adaugaCumparator(String nume, String prenume, boolean cardReducere)
  throws PreaMultiCumparatori;
  
  public void afisazaCumparatorii();
  
  public void adaugaProdusPentruCumparator(int cod,Produs produs);
  
  public void afiseazaProdusePentruCumparator(int cod);
  
  public void afiseazaProduseDinMagazin();
  
}