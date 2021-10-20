package linkedlist;

public class MainLinkedList {

	public static void main(String[] args) {
		

		LinkedList ll = new LinkedList();
		
		ll.push(1);
		ll.push(2);
		ll.push(3);
		ll.push(4);
		ll.push(5);
		ll.push(6);
		
		ll.printLinkedList();
		
		System.out.println("3rd Node >> " + ll.getNthNode(3));
		System.out.println("10th Node >> " + ll.getNthNode(10));
		
		

	}

}
