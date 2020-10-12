package factory_method;

public class FabricaFerrari implements FabricaDeCarro{

	@Override
	public Carro produzCarro() {
		return new Ferrari488();
	}

}
