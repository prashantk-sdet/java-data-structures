package trees;

public class MainBT {

	public static void main(String[] args) {
		
		BasicBinaryTree<Integer> tree = new BasicBinaryTree<>();
		
		tree.add(5);
		tree.add(3);
		tree.add(2);
		tree.add(1);
		tree.add(6);
		tree.add(7);
		tree.add(8);
		
		tree.printTreeInPreOrder();

	}

}
