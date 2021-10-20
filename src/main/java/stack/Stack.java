package stack;

public interface Stack<T> {
	
	void push(T newItem);
	T pop();
	boolean contains(T item);
	T access(T data);
	int getSize();

}
