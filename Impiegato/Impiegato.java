
/**
 * 
 */
public class Impiegato
{
    private String nome;
    private int stipendio;
    public Impiegato(String nome, int stipendio){
        setNome(nome);
        setStipendio(stipendio);
    }
    public String getNome(){
        return nome;
    }
    public int getStipendio(){
        return stipendio;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setStipendio(int stipendio){
        this.stipendio = stipendio;
    }
}
