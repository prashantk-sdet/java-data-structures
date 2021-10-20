package stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack<Integer> listStack = new ListStack<>();
		
		listStack.push(1);
		listStack.push(2);
		listStack.push(3);
		listStack.push(4);
		listStack.push(5);
		
		
		while(listStack.getSize()>0) {
			System.out.println(listStack.pop());
		}
		
		listStack.access(10);
		

	}

}
