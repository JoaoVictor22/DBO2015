package CobaiaEx;
import javax.swing.JOptionPane;
public class Obrigatorio {

	public static void main(String[] args) {
		
		try {
			System.out.println(formatoAutor("Thaylles", "Rosa"));
			System.out.println(formatoAutor("Jergori", "Almeida"));
		} catch (SobrenomeCurtoException e) {
			e.printStackTrace();
		}
		
	
		String nome = JOptionPane.showInputDialog("Digite o nome:");
		String sobrenome = JOptionPane.showInputDialog("Digite o sobrenome");
	
		try {
			System.out.println(formatoAutor(nome, sobrenome));
		} catch (SobrenomeCurtoException e) {
			e.printStackTrace();
		}
		
	}
		
	
		public static String formatoAutor(String nome, String sobrenome) throws SobrenomeCurtoException{
		
			if(nome.length() < 3) {
				throw new NomeCurtoException();
			}
		
			if(sobrenome.length() < 3) {
				throw new SobrenomeCurtoException();
			}
			
		return sobrenome.toUpperCase() + ", " + nome.toUpperCase().charAt(0) + ".";
		
		
		}		
}
