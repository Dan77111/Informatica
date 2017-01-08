
/**
 * Progettare una classe di nome DistributoreBenzina, per rappresentare un
*distributore di carburante per automobili. Tale classe prevede due variabili
*d'istanza. La prima variabile d'istanza e' chiamata deposito, e' di tipo double,
*e contiene il quantitativo di benzina disponibile al distributore. La seconda
*variabile d'istanza e' chiamata euroPerLitro, e' di tipo double, e rappresenta
*il prezzo della benzina, espresso in euro per litro.
*La classe deve implementare un costruttore public DistributoreBenzina(double
*unPrezzoPerLitro), che prende come parametro esplicito il prezzo in euro per un
*litro di benzina. La quantita' iniziale di benzina disponibile e' zero. La
*classe deve inoltre implementare i seguenti metodi. Un metodo definito come
*public void rifornisci(double unaQuantita), che rifornisce il distributore di
*benzina. Un metodo definito come public void vendi(double euro), che vende una
*quantita' di benzina corrispondente all'ammontare di euro pagato, specificato
*dal parametro esplicito del metodo. Infine, un metodo definito come public void
*aggiorna(double unPrezzoPerLitro), che aggiorna il prezzo della benzina.
*
*Modificare la classe DistributoreBenzina, assegnata nell’esercizio precedente,
*in modo che il distributore abbia due pompe, una di benzina verde ed una di
*gasolio. Ciascun tipo di carburante ha il suo costo per litro. Conseguentemente,
*dovrete raddoppiare il metodo rifornisci: dovrete avere un metodo per rifornire
*la benzina verde ed un metodo per rifornire il gasolio. Il metodo vendi deve
*essere modificato nel seguente modo: public void vendi(double euro, Car
*unaAutomobile). Tale metodo rifornisce l'automobile specificata come parametro
*esplicito nel modo appropriato (verde oppure gasolio).
*Consigli:
*Nel Tester create varie automobili e distributori. Fate compiere alcuni "viaggi"
*alle automobili, e rifornitele di benzina in modo appropriato. Inoltre,
*rifornite le pompe di benzina in caso di necessita'.
 */
public class DistributoreBenzina
{
    public String nome;
    private double depositoBenzina = 0;
    private double depositoGasolio = 0;
    private double euroPerLitroBenzina;
    private double euroPerLitroGasolio;
    public DistributoreBenzina(double unPrezzoPerLitroBenzina, double unPrezzoPerLitroGasolio, String nome){
        euroPerLitroBenzina = unPrezzoPerLitroBenzina;
        euroPerLitroGasolio = unPrezzoPerLitroGasolio;
        this.nome = nome;
    }
    public void rifornisci(double unaQuantitaBenzina, double unaQuantitaGasolio){
        depositoBenzina += unaQuantitaBenzina;
        depositoGasolio += unaQuantitaGasolio;
        System.out.println("--------------");
        System.out.printf("Il distributore %s è stato rifornito di %f litri di benzina e di %f litri di gasolio \n", nome, unaQuantitaBenzina, unaQuantitaGasolio );
        System.out.println("--------------");
    }
    public void vendi(double euro, Car unaAutomobile){
        if ( unaAutomobile.getTipoCarburante().equals("benzina")){
            depositoBenzina -= euro / euroPerLitroBenzina;
            unaAutomobile.setSerbatoioAttuale(unaAutomobile.getSerbatoioAttuale() + euro / euroPerLitroBenzina);
        } else {
            depositoGasolio -= euro / euroPerLitroGasolio;
            unaAutomobile.setSerbatoioAttuale(unaAutomobile.getSerbatoioAttuale() + euro / euroPerLitroGasolio);
        }
    }
    public void aggiorna(double unPrezzoPerLitroBenzina, double unPrezzoPerLitroGasolio){
        euroPerLitroBenzina = unPrezzoPerLitroBenzina;
        euroPerLitroGasolio = unPrezzoPerLitroGasolio;
        System.out.println("--------------");
        System.out.printf("Adesso la benzina costa %f /L e il gasolio %f /L \n", unPrezzoPerLitroBenzina, unPrezzoPerLitroGasolio);
        System.out.println("--------------");
    }
    public double getEuroPerLitroBenzina(){
        return euroPerLitroBenzina;
    }
    public double getEuroPerLitroGasolio(){
        return euroPerLitroGasolio;
    }
    public double getEuroPerRiempire(Car unaAutomobile){
        if ( unaAutomobile.getTipoCarburante().equals("gasolio") )
            return ( ( unaAutomobile.getSerbatoioTotale() -
                       unaAutomobile.getSerbatoioAttuale() )
                       * euroPerLitroGasolio );
        else {
            return ( ( unaAutomobile.getSerbatoioTotale() -
                       unaAutomobile.getSerbatoioAttuale() )
                       * euroPerLitroBenzina );
        }
    }
    public double getDepositoGasolio(){
        return depositoGasolio;
    }
    public double getDepositoBenzina(){
        return depositoBenzina;
    }
    public String getNome(){
        return nome;
    }
}
