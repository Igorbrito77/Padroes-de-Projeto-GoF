package abstract_method;

public class FabricaBMW implements FabricaDeCarro{

	@Override
	public CarroEsportivo produzCarroEsportivo() {
		return new BMW428i();
	}

	@Override
	public CarroSedan produzCarroSedan() {
		return new BMW325i();
	}

}
