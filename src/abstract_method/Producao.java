package abstract_method;

public class Producao {
	
	public static void main(String[] args) {
		FabricaDeCarro fabrica = new FabricaBMW();
		CarroSedan carroSedan = fabrica.produzCarroSedan();
		carroSedan.exibirInformacaoSedan();
		
		CarroEsportivo carroEsportivo = fabrica.produzCarroEsportivo();
		carroEsportivo.exibirInformacaoEsportivo();
		
	}
}
