package CobaiaEx;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

public class Aluno {
	
	private int maticula;
	private String nome;
	private String sobrenome;
	private Date dataNascimento;
	
	private DateFormat dateFormat = DateFormat.getDateInstance();
	
	
	public int getMaticula() {
		return maticula;
	}
	public void setMaticula(int maticula) {
		this.maticula = maticula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + maticula;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		if (maticula != other.maticula)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Aluno [maticula=" + maticula + ", nome=" + nome
				+ ", sobrenome=" + sobrenome + ", dataNascimento="
				+ dataNascimento + "]";
	}
	public String toCSV() {
		StringBuilder builder = new StringBuilder();
		
		//11030226; Ana Flavia;Moraes;07/02/1999
		
		builder.append(maticula);
		builder.append(";");
		builder.append(nome);
		builder.append(" ");
		builder.append(sobrenome);
		builder.append(";");
		builder.append(dateFormat.format(dataNascimento));
		
		return builder.toString();
		
		
	}
	public void setDataNascimento(String data) {
		try {
			dataNascimento = dateFormat.parse(data);
		} catch (ParseException e) {
			System.err.println("A data " + data +"eh invalida");
		}
		
	}
	
}
