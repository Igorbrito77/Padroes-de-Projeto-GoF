package iterator;

public class ShowProducts {
	public static void main(String[] args) {
		
		Product [] list = new Product[4];
		list[0] = new Product("Playstation 4 Pro", 1000.00);
		list[1] = new Product ("Xbox One X", 900.00);
		list[2] = new Product("Red Dead Redemption PS4", 70.00);
		list[3] = new Product ("Spider Man PS4", 50.00);
		
		Iterator it = new ProductIterator(list);
		
		for(; !it.isDone(); it.next()) {
			System.out.println(it.currentItem().getName() + " . Price: " + it.currentItem().getValue());
		}
				
		
	}
}
