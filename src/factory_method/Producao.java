package factory_method;

public class Producao {
	public static void main(String[] args) {
		FabricaDeCarro fabrica = new FabricaFerrari();
		Carro carro = fabrica.produzCarro();
		carro.exibirInformacoes();
		
		fabrica = new FabricaLamborghini();
		carro = fabrica.produzCarro();
		carro.exibirInformacoes();
	}
}
