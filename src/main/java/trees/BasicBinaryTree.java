package trees;

public class BasicBinaryTree<T extends Comparable<T>> {

	
	Node root;
	private int size;
	
	public BasicBinaryTree() {
		root = null;
	}
	
	
	public int size() {
		return size;
	}
	
	public void add(T item) {
		Node node = new Node(item);
		
		if(this.root == null) {
			this.root = node;
			this.size++; 
		} else {
			insert(root, new Node(item));
		}
	}
	
	private void insert(Node parent, Node child) {
		
		if(child.getItem().compareTo(parent.getItem())<0) {
			
			if(parent.getLeft() == null) {
				parent.setLeft(child);
				child.setParent(parent);
				this.size++;
			} else {
				insert(parent.getLeft(), child);
			}
		} else {
			if(parent.getRight() == null) {
				parent.setRight(child);
				child.setParent(parent);
				this.size++;
			} else {
				insert(parent.getRight(), child);
			}
		}
	}
	
	public void printTreeInPreOrder() {
		if(root != null) {
			System.out.print("Tree in pre order ==> ");
			preOrderTraversal(this.root);
			System.out.println();
		}
	}
	
	private void preOrderTraversal(Node node) {
		
		System.out.print(node.getItem() + " ");
		
		if(node.getLeft() != null) {
			preOrderTraversal(node.getLeft());
		}
		
		if(node.getRight() != null) {
			preOrderTraversal(node.getRight());
		}
	}
	
	
	private class Node{
		private T item;
		
		private Node left;
		private Node right;
		private Node parent;
		
		public Node(T item){
			this.item = item;
			this.left = null;
			this.right = null;
			this.parent = null;
		}
		
		public T getItem() {
			return item;
		}
		public void setItem(T item) {
			this.item = item;
		}
		public Node getLeft() {
			return left;
		}
		public void setLeft(Node left) {
			this.left = left;
		}
		public Node getRight() {
			return right;
		}
		public void setRight(Node right) {
			this.right = right;
		}
		public Node getParent() {
			return parent;
		}
		public void setParent(Node parent) {
			this.parent = parent;
		}
	}
	
	
	
	
	
	
}
