package Herenca;

public class Pessoa {
	private  String Nome;
	private  String telefone;

	public Pessoa(String nome, String telefone) {
		this.Nome= nome;
		this.telefone= telefone;
	}

	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		this.Nome=nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone){
		this.telefone=telefone;
	}
}
