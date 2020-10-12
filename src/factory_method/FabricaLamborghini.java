package factory_method;

public class FabricaLamborghini implements FabricaDeCarro{

	@Override
	public Carro produzCarro() {
		return new LamborghiniAventador(); 
	}
	
}
