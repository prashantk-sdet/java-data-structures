package binarytree;

public class BinaryTree {
	
	Node root;
	int sum = 0;
	BinaryTree() {root = null;};
	
	void printTreeInPreOrder() {
		System.out.print("Tree In PreOrder ==> ");
		printTreeInPreOrder(root);
		System.out.println();
	}
	
	void printTreeInPreOrder(Node node){
		
		if(node == null) {
			return;
		}
		
		sum=sum + node.value;
		System.out.print(node.value + " ");
		
		printTreeInPreOrder(node.left);
		printTreeInPreOrder(node.right);
	}
	
	public int finSumOfNodes() {
		sum = 0;
		printTreeInPreOrder(root);
		return sum;
	}
	
	void printTreeInPostOrder() {
		System.out.print("Tree In PostOrder ==> ");
		printTreeInPostOrder(root);
		System.out.println();
	}
	
	void printTreeInPostOrder(Node node){
		
		if(node == null) {
			return;
		}
		
		sum=sum + node.value;
		printTreeInPostOrder(node.left);
		printTreeInPostOrder(node.right);

		System.out.print(node.value + " ");
	}

}
