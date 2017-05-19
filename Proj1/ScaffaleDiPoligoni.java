/**
*
*/

public class ScaffaleDiPoligoni
{
  private Poligono[] scaffale = new Poligono[10];
  private int porzioneOccupata;
  private int totPoligoni = 0;

  public int getPorzioneOccupata(){
    return porzioneOccupata;
  }

  public int getTotPoligoni(){
    return totPoligoni;
  }

  public Poligono getPoligono(int i){
    return scaffale[i];
  }

  public void sistemaPoligono(Poligono p){
    if ( totPoligoni < 10 ){
      if ( p instanceof Cerchio ){
        porzioneOccupata += ((Cerchio) p).getRaggio()*2;
      } else if ( p instanceof Triangolo ){
        porzioneOccupata += ((Triangolo) p).getLatoCorto();
      } else {
        porzioneOccupata += ((Rettangolo) p).getLatoCorto();
      }
      scaffale[totPoligoni] = p;
      totPoligoni ++;
    }
  }

  public String toString(){
    String toBeReturned = "";
    for ( int i = 0; i < totPoligoni; i ++ ){
      Poligono p = scaffale[i];
      toBeReturned += String.format("%s:\n\t%s\n", ( p instanceof Cerchio ) ? "Cerchio" : ( ( p instanceof Triangolo ) ? "Triangolo" : "Rettangolo"), p.toString() );
    }
    return toBeReturned;
  }

}
