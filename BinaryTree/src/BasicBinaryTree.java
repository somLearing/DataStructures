public class BasicBinaryTree {
	Node root;
	static class Node{
		int data;
		Node left,right;
		
		Node(int x){
			data = x;
			left = null;
			right=null;
		}
	}
	public BasicBinaryTree() {
		root = null;
	}
	public BasicBinaryTree(int key) {
		root = new Node(key);
	}
	
	public static void main(String[] args) {
		BasicBinaryTree b = new BasicBinaryTree();
		b.root = new Node(10);
		b.root.left = new Node(20);
		b.root.right = new Node(30);
		
	}
}
