package abstract_method;

public class BMW428i implements CarroEsportivo{

	@Override
	public void exibirInformacaoEsportivo() {
		System.out.println("Ano\n" + 
				"2016\n" + 
				"Quilômetros\n" + 
				"31.688 km\n" + 
				"Tipo\n" + 
				"Conversível\n" + 
				"Motor\n" + 
				"2.0\n" + 
				"Potência\n" + 
				"245 hp\n" + 
				"Transmissão\n" + 
				"Automática\n" + 
				"Tipo de combustível\n" + 
				"Gasolina\n" + 
				"Portas\n" + 
				"2");
	}
	
}
