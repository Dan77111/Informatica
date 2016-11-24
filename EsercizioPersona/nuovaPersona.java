
/**
 *
 */
public class nuovaPersona
{
  public static void main(){
    Persona persona1 = new Persona(2005, 7, 29, "Trento");
    System.out.println(persona1.calcoloEtaInMesi());
    System.out.println(persona1.getLuogoNascita());
  }
}
