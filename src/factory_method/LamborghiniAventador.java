package factory_method;

public class LamborghiniAventador implements Carro{

	@Override
	public void exibirInformacoes() {
		System.out.println("Preço sugerido: A partir de R$ 4,7 milhões\n" + 
				"Velocidade máxima: 350 km/h\n" + 
				"Potência: 700 - 740 HP\n" + 
				"Aceleração de 0 a 100 km/h: 2,9 - 3 segundos\n" + 
				"Consumo: Combinado: 6 km/l (4 (cidade) / 9 (estrada))");
	}

}
