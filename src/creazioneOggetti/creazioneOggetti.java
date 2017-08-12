package creazioneOggetti;

public class creazioneOggetti {

	public static void main(String[] args) 
	{	//crea un nuovo oggetto sring
		String s=new String("asdf");
		
		/** crea un nuovo oggetto char
		 * e lo converte a Stringa
		 */
		Character c=new Character('c');
		String C=c.toString();
		
		/**
		 * visualizza i risultati 
		 */
		System.out.println(s);
		System.out.println(C);
	}

}
