package contribuente.utilita;
import contribuente.persone.PersonaFisica;
import contribuente.aziende.Azienda;
import contribuente.Contribuente;

/**
 *
 */
public class prova
{
    public static void main(){
       Contribuente[] lista = {new Azienda(1,1,"12345678901"),
                              new PersonaFisica(1,1,"ASDFGH12A12A123A","asdf","asdf"),
                              new Azienda(1,1,"12345678901"),
                              new PersonaFisica(1,1,"ASDFGH12A12A123A","asdf","asdf"),
                              new PersonaFisica(1,1,"ASDFGH12A12A123A","asdf","asdf"),
                              new Azienda(1,1,"12345678901"),
                              new PersonaFisica(1,1,"ASDFGH12A12A123A","asdf","asdf"),
                              new Azienda(1,1,"12345678901"),
                              new Azienda(1,1,"12345678901")};
        Contribuente[] aziende = Utilita.aziendeDebitrici(lista);
        System.out.println("1,3,6,8,9");
        for ( int i = 0; i < lista.length; i ++ ){
            System.out.println(lista[i]);
        }
        for ( int i = 0; i < aziende.length; i ++ ){
            System.out.println(aziende[i]);
        }
    }
}
