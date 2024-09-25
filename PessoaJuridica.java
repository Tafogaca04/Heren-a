package Herenca;

public class PessoaJuridica extends Pessoa {

	private  String cnpj;
	// TODO Auto-generated constructor stub

	public PessoaJuridica (String nome, String telefone, String cpf, String rg, String cnpj) {
		super(nome, telefone);
		this.cnpj= cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj=cnpj;
	}
}
