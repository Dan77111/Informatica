/**
 * Aggiungi qui una descrizione della classe agendaTelefonica
 *
 * @author Daniele Dalla Rosa
 * @version 24/11/2016
 */

import java.util.*;

public class contattoTelefonicoStudenti {
    //variabili di istanza
    private String name;
    private String surname;
    private String number;
    //costruttore
    public contattoTelefonicoStudenti(String name, String surname, String number) {
       this.name = name;
       this.surname = surname;
       this.number = number;
    }

    //modifica del numero di telefono
    public void setNumber(String number) {
      this.number = number;
    }

    //modifica del cognome
    public void setSurname(String surname) {
      this.surname = surname;
    }

    //modifica del nome
    public void setName(String name) {
      this.name = name;
    }

    public String getName(){
      return nome;
    }

    public String getSurname(){
      return cognome;
    }

    public String getNumber(){
      return numero;
    }

    //stampa a video del contatto
    public void print() {
      System.out.println("Name: " + name);
      System.out.println("Surname: " + surname);
      System.out.println("Number: " + number);
    }
}
