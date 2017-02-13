/**
 * Una semplice classe Cerchio con:
 * - un attributo per il raggio
 * - un costruttore vuoto
 * - un costruttore che prende un argomento per il raggio
 * - un costruttore che prende un altro Cerchio
 * - un metodo isDegenere per verificare se il Cerchio ha raggio 0
 * - un metodo setRaggio per impostare il valore del raggio (non negativo)
 * - un metodo getRaggio per ottenere il valore del raggio
 * - un metodo toString
 * - un metodo equals
 * - un metodo getCirconferenza che calcola e restituisce la circonferenza
 * - un metodo getArea che calcola e restituisce l'area del cerchio
 */

public class Cerchio {
    // attributi
    protected double raggio;

    // costruttore
    /**
    * Costruttore proprio che imposta il raggio uguale al valore ricevuto come parametro
    */
    public Cerchio(double r) {
        setRaggio(r);
    }
    /**
    * Costruttore vuoto che imposta il raggio a 0 invocando il costruttore proprio
    */
    public Cerchio() {
        this(0);
    }
    /**
    * Costruttore proprio che copia un altra istanza di cerchio
    */
    public Cerchio(Cerchio c) {
        this(c.getRaggio());
    }
    // metodi
    /**
    * Metodo che restituisce true se il raggio è uguale a 0
    */
    public boolean isDegenere() {
        return (getRaggio()==0);
    }
    /**
    * Metodo che imposta il raggio uguale al parametro ricevuto
    */
    public boolean setRaggio(double r) {
        if(r>=0){
            this.raggio = r;
            return true;
        }else {
            return false;
        }
    }
    /**
    * Metodo che restituisce il raggio
    */
    public double getRaggio() {
        return raggio;
    }
    /**
    * Metodo che calcola e restituisce la circonferenza
    */
    public double getCirconferenza() {
        return (2* getRaggio() * Math.PI);
    }
    /**
    * Metodo che calcola e restituisce l'area
    */
    public double getArea() {
        return (getRaggio() * getRaggio() * Math.PI);
    }
    /**
    * Metodo speciale che restituisce una rappresentazione dell'oggetto in formato "Cerchio di raggio: <raggio>"
    */
    public String toString(){
        return "Cerchio di raggio: " + getRaggio();
    }
    /**
    * Metodo che confronta due oggetti cerchio e restituisce true se sono uguali, altrimenti restituisce false
    */
    public boolean equals(Cerchio c) {
        return (c.getRaggio() == getRaggio());
    }
}
