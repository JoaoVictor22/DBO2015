package CobaiaEx;

// RuntimeException não são checked 
// Exception e suas filhas SÃO CHECKED

public class SobrenomeCurtoException extends Exception {

	public SobrenomeCurtoException() {
	super("O sobrenome é muito curto");
	}



}
