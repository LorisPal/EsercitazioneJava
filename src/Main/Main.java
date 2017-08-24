package Main;


import java.util.Date;

import Classi.Pezzo;
import Classi.passaggioValori;
import Database.MySqlAcces;

public class Main {

	public static void main(String[] args) throws Exception 
	{
		/*
		 * Creo un nuovo oggetto per memorizzare delle Values in un Database
		 * e ne lancio il metodo
		 */
		MySqlAcces dao = new MySqlAcces();
        dao.readDataBase();
		
        /*
         * Esercitazione sulle stringhe e passaggi di valori
         */
		char lettera='b';
		String stringa="ciao, sto misurando la lunghezza di questa stringa!";
		
		Pezzo pezzi=new Pezzo();
		/**
		 * istanzio un nuovo oggetto di tipo passaggioValori
		 * e tramite il comando System.out visualizzo su console
		 * il risultato. Il parametro di System non è altri che l'invocazione
		 * del metodo toString di passaggioValori che a sua volta ha come
		 * parametro un campo di tipo char che verrà passata al metodo per la
		 * conversione.
		 */
		passaggioValori valore=new passaggioValori();
		System.out.println(valore.toString(lettera));
		
		/**
		 * il principio di funzionamento è lo stesso di sopra ma con un metodo diverso
		 * ed il parametro da passare questa volta è un int, infatti il metodo
		 * accoglie uno String come parametro e restituisce un int
		 */
		System.out.println("Questa stringa, in data, "+new Date()+": "+"<"+stringa+">"+" è lunga: "+valore.Length(stringa));
	}

}
