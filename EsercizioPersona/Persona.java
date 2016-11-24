import java.util.*;
import java.time.*;
/**
 *
 */
public class Persona
{
  private int anno;
  private int mese;
  private int giorno;
  private String luogoNascita;
  private int annoNascita;
  private int meseNascita;
  private int giornoNascita;
  private int eta;
  private int etaInMesi;
  private void getDate(){
    Date date = new Date();
    LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    anno  = localDate.getYear();
    mese = localDate.getMonthValue();
    giorno   = localDate.getDayOfMonth();
  }
  public Persona(int annoNascita, int meseNascita, int giornoNascita, String luogoNascita){
    this.annoNascita = annoNascita;
    this.meseNascita = meseNascita;
    this.giornoNascita = giornoNascita;
    this.luogoNascita = luogoNascita;
  }
  public Persona(int annoNascita, String luogoNascita){
    this(annoNascita, 1, 1, luogoNascita);
  }
  public int calcoloEta(){
    getDate();
    eta = anno - 1 - annoNascita;
    if ( mese > meseNascita ){
      eta ++;
    } else if ( mese == meseNascita ){
      if ( giorno >= giornoNascita ){
        eta ++;
      }
    }
    return eta;
  }
  public int calcoloEtaInMesi(){
    getDate();
    etaInMesi = (anno - 1 - annoNascita)*12;
    etaInMesi += mese + ( 12 - meseNascita - 1);
    if ( ( giorno + ( 30 - giornoNascita ) ) >= 30 ){
      etaInMesi ++;
    }
    return etaInMesi;
  }
  public int getGiornoNascita(){
    return giornoNascita;
  }
  public int getMeseNascita(){
    return meseNascita;
  }
  public int getAnnoNascita(){
    return annoNascita;
  }
  public String getLuogoNascita(){
    return luogoNascita;
  }
}
