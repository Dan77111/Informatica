import java.time.*;
/**
 *
 */
public class Impiegato
{
    protected String nome;
    protected int stipendio;
    protected Data data;
    public Impiegato(String nome, int stipendio, Data data){
        setNome(nome);
        setStipendio(stipendio);
        setData(data);
        aumentaStipendio();
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
    public void setData(Data data){
        this.data = data;
    }
    public void aumentaStipendio(){
        LocalDate dataAttuale = data.getCurrentDate();
        int nAnni = dataAttuale.getYear() - data.getAnno();
        for ( int i = 0; i < nAnni; i ++ ){
            stipendio += 2*(stipendio/100);
        }
    }
}
