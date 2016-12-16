
/**
 * Aggiungi qui una descrizione della classe nuovaAgenda
 * implementazione della classe agenda telefonica
 * @author  Daniele Dalla Rosa
 * @version 24-11-2016
 */

import java.util.*;
public class nuovoContattoStudenti{
   public static void main (){
      //Istanza della classe
      contattoTelefonicoStudenti contatto;
      System.out.print("Inserire il nome: ");
      String nome = Tastiera.leggiUnaStringa();
      System.out.print("Inserire il cognome: ");
      String cognome = Tastiera.leggiUnaStringa();
      System.out.print("Inserire il numero: ");
      String numero = Tastiera.leggiUnaStringa();
      contatto = new contattoTelefonicoStudenti(nome, cognome, numero);
      //dichiarazione dei dati
      boolean exit = false;
      //richiamo dei metodi con gestione delle eccezioni e scelta del metodo da richiamare
      while (exit == false){
        System.out.println("Che operazione vuoi eseguire?");
        System.out.println("modificaNome, modificaCognome, modificaNumero, stampa o exit?");
        String op = Tastiera.leggiUnaStringa();
        switch (op){
          case "modificaNome":
            System.out.print("Inserire il nome: ");
            contatto.setName(Tastiera.leggiUnaStringa());
            break;
          case "modificaCognome":
            System.out.print("Inserire il cognome: ");
            contatto.setSurname(Tastiera.leggiUnaStringa());
            break;
          case "modificaNumero":
            System.out.print("Inserire il numero: ");
            contatto.setNumber(Tastiera.leggiUnaStringa());
            break;
          case "stampa":
            contatto.print();
            break;
          case "exit":
            exit = true;
            break;
          default:
            System.out.println("Cosa hai scritto?!?");
      }
    }
  }
}
