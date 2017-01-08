
/**
 *
 */
public class Car
{
    private String tipoCarburante;
    private String nome;
    private double kmL;
    private int km;
    private int kmDaUltimaSosta;
    private double serbatoioTotale;
    private double serbatoioAttuale;
    public Car(String nome, double kmL, String tipoCarburante, double serbatoioTotale){
        this.kmL = kmL;
        this.nome = nome;
        this.tipoCarburante = tipoCarburante;
        this.serbatoioTotale = serbatoioTotale;
    }
    public String getTipoCarburante(){
        return tipoCarburante;
    }
    public double getSerbatoioAttuale(){
        return serbatoioAttuale;
    }
    public double getSerbatoioTotale(){
        return serbatoioTotale;
    }
    public void setSerbatoioAttuale(double serbatoioAttuale){
        this.serbatoioAttuale = serbatoioAttuale;
    }
    public String rifornisci(double euro, DistributoreBenzina distributore){
        kmDaUltimaSosta = 0;
        String a = ("La macchina " + nome + " ha fatto rifornimento al distributore "
                + distributore.getNome() + " e ha speso " + distributore.getEuroPerRiempire(this)
                + " euro per fare " + (serbatoioTotale - serbatoioAttuale)
                + " L di " + tipoCarburante);
        distributore.vendi(euro, this);
        return a;
    }
    public String viaggia(int km, DistributoreBenzina distributore){
        if ( kmL * serbatoioAttuale >= km ){
            this.km += km;
            this.kmDaUltimaSosta += km;
            serbatoioAttuale -= km / kmL;
            return ("La macchina " + nome + " ha fatto " + km + " Km e ha ancora "
                    + serbatoioAttuale + " litri di " + tipoCarburante );
        } else {
            return rifornisci(distributore.getEuroPerRiempire(this), distributore);
        }
    }
    public void printStato(){
        System.out.printf("Nome: %s \n Serbatoio: %f \n Benzina Attuale: %f \n Km: %d \n Km Da Ultima Sosta: %d \n Km/L: %f \n Tipo Carburante: %s \n ----------------------- \n", nome, serbatoioTotale, serbatoioAttuale, km, kmDaUltimaSosta, kmL, tipoCarburante );
    }
}
