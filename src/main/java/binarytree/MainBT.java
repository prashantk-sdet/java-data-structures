package binarytree;

public class MainBT {
	
	public static void main(String[] args) {
		
		BinaryTree tree = new BinaryTree();
		
		tree.root = new Node(0);
		tree.root.left = new Node(1);
		tree.root.right = new Node(2);
		
		tree.root.left.left = new Node(11);
		tree.root.left.right = new Node(12);
		
		tree.root.right.left = new Node(21);
		tree.root.right.right = new Node(22);
		
		tree.printTreeInPreOrder();
		tree.printTreeInPostOrder();
		System.out.println("Sum =" + tree.finSumOfNodes());
		
	}

}
