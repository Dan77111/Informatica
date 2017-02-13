/**
 * Una classe CerchioSulPiano che estende Cerchio
 * aggiungendo il campo centro di tipo Punto.
 *
 * Bisogner� quindi implementare:
 * - il costruttore vuoto
 * - il costruttore che prende i valori per gli attributi
 * - il costruttore che prende una istanza di CerchioSulPiano
 * - i metodi get e set per il nuovo attributo
 * - un metodo che imposta entrambi gli attributi
 * - un metodo copia che i valori di un'altra istanza di CerchioSulPiano
 * - il metodo equals()
 *
 * Dovremo riscrivere:
 * - il metodo toString()
 *
 * Terremo buoni i metodi:
 * - isDegenere()
 * - setRaggio(double)
 * - getRaggio()
 * - getCirconferenza()
 * - getArea()
 */
public class CerchioSulPiano extends Cerchio {
    private Punto centro= new Punto();
    public CerchioSulPiano(){
        this(1,0,0);
    }
    public CerchioSulPiano(double raggio, double x, double y){
        super(raggio);
        setCentro(x,y);
    }
    public CerchioSulPiano(double raggio, Punto punto){
        super(raggio);
        setCentro(punto);
    }
    public void setCentro(Punto punto){
        setCentro(punto.getAscissa(), punto.getOrdinata());
    }
    public void setCentro(double x, double y){
        centro.setAscissa(x);
        centro.setOrdinata(y);
    }
    public Punto getCentro(){
        return centro;
    }
    public void setCerchioSulPiano(double raggio, Punto punto){
        setCerchioSulPiano(raggio, punto.getAscissa(), punto.getOrdinata());
    }
    public void setCerchioSulPiano(double raggio, double x, double y){
        setCentro(x, y);
        setRaggio(raggio);
    }
    public void copia(CerchioSulPiano c){
        setCerchioSulPiano(c.getRaggio(), c.getCentro());
    }
    public boolean equals(CerchioSulPiano c){
        return getCentro().equals(c.getCentro()) && getRaggio() == c.getRaggio();
    }
    public String toString(){
        return String.format("Centro: %s, Raggio: %f", centro, getRaggio() );
    }
}
