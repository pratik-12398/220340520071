class LinkedListReverse{
	static Node head;
static class Node{
	 int data;
	 Node next;
	 
	 Node(int data)
	 {
	 this.data=data;
	 this.next=null;
	 }
} 
Node reverse(Node node)
{
Node prev=null;
Node temp=node;
Node next=null;
 while(temp!=null)
 {
 next = temp.next;
 temp.next=prev;
 prev=temp;
 temp=next;
 }
 node=prev;
 return node;
 }
 void display(Node node)
 {
  while(node!=null)
  {
  System.out.print(node.data + "  ");
  node =node.next;
  }
  }

public static void main(String args[]){
LinkedListReverse msd =new LinkedListReverse();
msd.head=new Node(2);
msd.head.next=new Node(4);
msd.head.next.next=new Node(3);
msd.head.next.next.next=new Node(4);
msd.head.next.next.next.next=new Node(2);
msd.head.next.next.next.next.next=new Node(5);
 System.out.println("Given Linked List is");
 msd.display(head);
 head=msd.reverse(head);
  System.out.println();
 System.out.println("Reverse Linked List is");
 msd.display(head);





}
}