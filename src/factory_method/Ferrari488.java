package factory_method;

public class Ferrari488 implements Carro{

	@Override
	public void exibirInformacoes() {
		System.out.println("Motor: 3,9 l V8\n" + 
				"Velocidade máxima: 325 - 330 km/h\n" + 
				"Potência: 670 HP\n" + 
				"Aceleração de 0 a 100 km/h: 3 segundos\n" + 
				"Consumo: Combinado: 9 km/l (6 (cidade) / 12 (estrada))\n" + 
				"Peso: 1.475 - 1.525 kg\n");
	}
	
}
