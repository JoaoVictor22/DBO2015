package CobaiaEx;

public class NomeCurtoException extends RuntimeException{

	public NomeCurtoException() {
		super("O nome e muito curto");
	}
}
