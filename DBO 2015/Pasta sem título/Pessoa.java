package tuts;

public class Pessoa {
	
	private String nome;
	private Pessoa [] amigos = new Pessoa[1000];
	
	
	public Pessoa(String string) {
		nome =
				string;
	
	}

	public int getAmigoContagem() {
		int ct=0;
		for (int i = 0; i < amigos.length; i++) {
			if(amigos[i]== null){
				ct++;
			}
		} 
		return ct;
	}

	public void addAmigo(Pessoa pessoa) {
		for (int i = 0; i < amigos.length; i++) {
			if(amigos[i]==null){
				amigos[i]=pessoa;
			pessoa.addAmigo(this);
			break;
			}
		}
	}

	public Object getAmigos() {
		return null;
	}

	public Object getAmigo(int i) {
		return null;
	}

	public void removeAmigo(Pessoa ana) {
		
	}

	public void removeAmigo(int i) {

		
	}

}
