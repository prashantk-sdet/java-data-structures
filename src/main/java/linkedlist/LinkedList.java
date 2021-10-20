package linkedlist;

public class LinkedList {
	
	Node head;
	
	void push(int new_data) {
		
		Node new_node =  new Node(new_data);
		new_node.next = head;
		head = new_node;
	}
	
	void printLinkedList() {
		Node currentNode = head;
		
		while(currentNode != null) {
			System.out.print(currentNode.data + " ");
			currentNode =  currentNode.next;
		}
		System.out.println();
	}
	
	public int getNthNode(int index) {
		int i = 0;
		Node currentNode = head;
		
		while(currentNode != null) {
			i = i + 1;
			if(i == index) {
				return  currentNode.data;
			}
			currentNode =  currentNode.next;
		}
		return 0;
		
	}

}
