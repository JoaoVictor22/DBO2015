package CobaiaEx;

// RuntimeException n�o s�o checked 
// Exception e suas filhas S�O CHECKED

public class SobrenomeCurtoException extends Exception {

	public SobrenomeCurtoException() {
	super("O sobrenome � muito curto");
	}



}
