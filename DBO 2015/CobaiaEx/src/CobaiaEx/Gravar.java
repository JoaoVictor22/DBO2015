package CobaiaEx;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URI;
import java.net.URISyntaxException;
import java.io.*;

public class Gravar {

	public static void main(String[] args) throws FileNotFoundException {
		
		//caminho absoluto (fixo)
		//caminho relativo(conta  apartir do local do programa)
		
		
		
		//	URI uri = Gravar.class.getResource(".").toURI();
		//	System.out.println(uri);
			
			File f = new File("D:/JoaoDBO/meuarquivo");
			// System.out == imprime no Console
			System.out.println("alguma coisa");
			
			PrintStream fileOut = new PrintStream(f);
			
			fileOut.println("Teste");
			fileOut.println();
			fileOut.println();
			fileOut.println();
			fileOut.flush();
			fileOut.println("Ola Marilene");
			fileOut.close();
			
		
		
		
	}

}
