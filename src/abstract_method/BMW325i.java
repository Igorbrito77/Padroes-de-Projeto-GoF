package abstract_method;

public class BMW325i implements CarroSedan{

	@Override
	public void exibirInformacaoSedan() {
		System.out.println("Ano\n" + 
				"2008\n" + 
				"Quilômetros\n" + 
				"0 km\n" + 
				"Transmissão\n" + 
				"Automática\n" + 
				"Cor\n" + 
				"Prateado\n" + 
				"Tipo de combustível\n" + 
				"Gasolina\n" + 
				"Portas\n" + 
				"4");
	}

}
