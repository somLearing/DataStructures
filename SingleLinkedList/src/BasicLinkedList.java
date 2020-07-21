public class BasicLinkedList {
	Node head;
	static class Node{
		int data;
		Node next;
		Node(int x){
			data=x;
			next =null;
		}
	}
	
	public static void main(String[] args) {
		BasicLinkedList b = new BasicLinkedList();
		b.head = new Node(10);
		Node second = new Node(20);
		Node three = new Node(30);
		b.head.next = second;
		second.next = three;
		b.printLinkedList();
		}
	
		private void printLinkedList() {
		Node n =head;
		while(n!=null) {
			System.out.println(n.data);
			n = n.next;
		}
		
	}
	
	
}
