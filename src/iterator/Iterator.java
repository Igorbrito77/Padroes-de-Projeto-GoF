package iterator;

public interface Iterator {
	Product currentItem();
	boolean isDone();
	void next();
	void first();
}
