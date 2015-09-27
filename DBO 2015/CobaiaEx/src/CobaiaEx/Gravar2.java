package CobaiaEx;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Gravar2 {

	public static void main(String[] args) throws FileNotFoundException {
		
		File arquivo = new File("arquivo.txt");
		
		PrintStream out  = new PrintStream(arquivo);
		
		out.println("Ola Marilene");
		
		out.flush();
		out.close();
		
		System.out.println("OK");
		

	}

}
