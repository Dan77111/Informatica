
/**
 *
 */
public class Cane
{
  private String nome;
  private String razza;
  private int anni;
  public Cane(String nome, String razza, int anni){
    this.nome = nome;
    this.razza = razza;
    this.anni = anni;
  }
  public void setNome(String nome){
    this.nome = nome;
  }
  public void setRazza(String razza){
    this.razza = razza;
  }
  public void setAnni(int anni){
    this.anni = anni;
  }
  public void setCane(String nome, String razza, int anni){
    setNome(nome);
    setRazza(razza);
    setAnni(anni);
  }
  public String getNome(){
    return nome;
  }
  public String getRazza(){
    return razza;
  }
  public int getAnni(){
    return anni;
  }
  public void printInfo(){
    System.out.printf("Nome: %s | Razza: %s | Anni: %d \n", nome, razza, anni);
  }
  public int getEtaInAnniUmani(){
    return anni*7;
  }
}
