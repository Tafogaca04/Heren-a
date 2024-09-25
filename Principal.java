package Herenca;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//criando uma pessoa
		Pessoa pessoa = new Pessoa ("João da Silva","(11)9987654238");
		System.out.println("Pessoa:");
		System.out.println("Nome:"+ pessoa.getNome());
		System.out.println("Telefone:"+ pessoa.getTelefone());
		System.out.println("------------------------------------------------");

		// criando pessoa física
		PessoaFisica pessoafisica =new PessoaFisica("João","(11)9987654238","123425432","300.938.974");
		System.out.println("Pessoa Física:");
		System.out.println("Nome:"+ pessoafisica.getNome());
		System.out.println("Telefone:"+ pessoafisica.getTelefone());
		System.out.println("CPF:"+ pessoafisica.getCpf());
		System.out.println("RG:"+ pessoafisica.getRg());
		System.out.println("------------------------------------------------");

		//criando pessoa jurídica
		PessoaJuridica pessoajuridica=new PessoaJuridica("Empresa XYZ","(11)9987654238","123425432","300.938.974","329876");

		System.out.println("Pessoa Jurídica:");
		System.out.println("Nome:"+ pessoajuridica.getNome());
		System.out.println("Telefone:"+ pessoajuridica.getTelefone());
		System.out.println("CNPJ:"+ pessoajuridica.getCnpj());
		System.out.println("------------------------------------------------");

}

}
