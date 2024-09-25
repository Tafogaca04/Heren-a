package Herenca;

public class ObjetoVeiculo {

	public static void main(String[] args) {
		//criando uma pessoa
				Veiculo veiculo = new Veiculo ("Honda","Honda City","prata",2015);
				System.out.println("Veículo:");
				System.out.println("Marca:"+ veiculo.getMarca());
				System.out.println("Modelo:"+ veiculo.getModelo());
				System.out.println("Cor:"+ veiculo.getCor());
				System.out.println("Ano:"+ veiculo.getAno());
				System.out.println("------------------------------------------------");

				// criando automovel
				Automovel automovel = new Automovel("Honda","Honda CR-V",2017,"branco",4,"motor 2.0");
				System.out.println("Automovel:");
				System.out.println("Marca:"+ automovel.getMarca());
				System.out.println("Modelo:"+ automovel.getModelo());
				System.out.println("Cor:"+ automovel.getCor());
				System.out.println("NumeroPortas:"+ automovel.getNumeroPortas());
				System.out.println("Motor:"+ automovel.getMotor());

				System.out.println("------------------------------------------------");

				//criando pessoa jurídica
				Moto moto= new Moto("Honda","CG 160 Fan ","preto", 2013,162);

				System.out.println("Moto:");
				System.out.println("Marca:"+ moto.getMarca());
				System.out.println("Modelo:"+ moto.getModelo());
				System.out.println("Cor:"+ moto.getCor());
				System.out.println("Ano:"+ moto.getAno());
				System.out.println("cilindrada:"+ moto.getCilindrada());

				

		}

		}