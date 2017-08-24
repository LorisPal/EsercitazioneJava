package Classi;

public class passaggioValori 
{
	
	/**
	 * passo al metodo un parametro denominato "carattere"
	 * che converte un campo di tipo carattere in una stringa
	 * e lo ritorno. Il metodo deve ritornare una stringa
	 * quindi sarà di tipo String.
	 * @param carattere
	 * @return
	 */
	public String toString(char carattere)
	{
		
		String stringa=""+carattere+"";
		return stringa;		
	}
	
	public int Length(String s)
	{
		return s.length();
	}
}
