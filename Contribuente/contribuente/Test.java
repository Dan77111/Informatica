package contribuente;
import contribuente.persone.PersonaFisica;
import contribuente.aziende.Azienda;
public class Test
{
    public static void main(){
        PersonaFisica p1 = new PersonaFisica(10000,1000,"ABCDEFGHIJKMNOPQ","HSFhdbhdf","hbhfbvdf");
        PersonaFisica p2 = new PersonaFisica(100000,1000,"JKLMNOPQABCEFGHI","HSFhdbhdf","hbhfbvdf");
        PersonaFisica p3 = new PersonaFisica(1000,100,"FGHIJPQABCKLNODE","HSFhdbhdf","hbhfbvdf");
        PersonaFisica p4 = new PersonaFisica(100100,1000,"AIFGHNOJKLCDEMBQ","HSFhdbhdf","bhfbvdf");
        Azienda a1 = new Azienda(10000,1000,"12345678901");
        Azienda a2 = new Azienda(100000,1000,"67890112345");
        Azienda a3 = new Azienda(1000000,1000,"59123678401");
        Azienda a4 = new Azienda(1000,1000,"76348901251");

        System.out.printf("%s, %s, %s, %f \n", p1.getNome(), p1.getCognome(), p1.id(), p1.daPagare());
        System.out.printf("%s, %s, %s, %f \n", p2.getNome(), p2.getCognome(), p2.id(), p2.daPagare());
        System.out.printf("%s, %s, %s, %f \n", p3.getNome(), p3.getCognome(), p3.id(), p3.daPagare());
        System.out.printf("%s, %s, %s, %f \n", p4.getNome(), p4.getCognome(), p4.id(), p4.daPagare());
        System.out.printf("%s, %f \n", a1.id(), a1.daPagare());
        System.out.printf("%s, %f \n", a2.id(), a2.daPagare());
        System.out.printf("%s, %f \n", a3.id(), a3.daPagare());
        System.out.printf("%s, %f \n", a4.id(), a4.daPagare());
    }
}
