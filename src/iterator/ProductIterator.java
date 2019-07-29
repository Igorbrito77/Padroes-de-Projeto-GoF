package iterator;

public class ProductIterator implements Iterator{
	
	protected Product[] list;
	protected int counter;
	
	public ProductIterator(Product [] products) {
		this.list = products;
	}
	
	@Override
	public boolean isDone() {
		return counter == list.length;
	}

	@Override
	public void next() {
		counter++;
	}

	@Override
	public void first() {
		counter = 0;
	}
	

	@Override
	public Product currentItem() {
		 	if (isDone()) {
	            counter = list.length - 1;
	        } else if (counter < 0) {
	            counter = 0;
	        }
	        return list[counter];
	}

}
