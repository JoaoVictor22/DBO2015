package CobaiaEx;
import javax.swing.JOptionPane;
public class Lancando {

	public static void main(String[] args) {
		
		System.out.println(formatoAutor("Thaylles", "Rosa"));
		System.out.println(formatoAutor("Jergori", "Almeida"));
	
		String nome = JOptionPane.showInputDialog("Digite o nome:");
		String sobrenome = JOptionPane.showInputDialog("Digite o sobrenome");
	
		try{
		System.out.println(formatoAutor(nome, sobrenome));
		}catch (RuntimeException e) {
			JOptionPane.showMessageDialog(null, e.getMessage(), "Erro!", JOptionPane.ERROR_MESSAGE);
		}
	}
		
	
		public static String formatoAutor(String nome, String sobrenome){
		
			if(nome.length() < 3) {
				throw new RuntimeException("O nome é muito curto, minimo 3 letras");
			}
		
			if(sobrenome.length() < 3) {
				throw new RuntimeException("O sobrenome é muito curto, minimo 3 letras");
			}
			
		return sobrenome.toUpperCase() + ", " + nome.toUpperCase().charAt(0) + ".";
		
		
		}		
}
