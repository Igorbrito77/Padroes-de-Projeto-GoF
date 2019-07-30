package iterator;

public class Product {
	
	private String name;
	private double value;
	
	public Product(String name , double value) {
		this.name = name;
		this.value = value;
	}
	
	public double getValue() {
		return value;
	}
	public String getName() {
		return name;
	}

}
