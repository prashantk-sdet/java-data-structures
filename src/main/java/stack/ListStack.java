package stack;

import java.util.ArrayList;
import java.util.List;

public class ListStack<T> implements Stack<T> {
	
	private List<T> data;
	int stackPointer;
	
	public ListStack() {
		data = new ArrayList<>();
		stackPointer = 0;
	}

	@Override
	public void push(T newItem) {
		data.add(newItem);
		stackPointer++;
	}

	@Override
	public T pop() {
		if(stackPointer == 0) {
			throw new IllegalStateException("No more items in the stack");
		}
		return data.remove(--stackPointer);
	}

	@Override
	public boolean contains(T item) {
		
		for(int i=0; i<data.size();i++) {
			if(data.get(i).equals(item)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public T access(T item) {
		
		while(stackPointer>0) {
			T temp = pop();
			if(item.equals(temp)) {
				return temp;
			}
		}
		throw new IllegalArgumentException("Could not find the item in the stack");
	}

	@Override
	public int getSize() {
		return stackPointer;
	}

}
