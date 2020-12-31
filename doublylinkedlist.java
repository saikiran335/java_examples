class doublylinkedlist
{
public class Node
{
int data;
Node next;
Node prev;
public Node(int data)
{
this.data=data;
}
}
public Node head=null;
public Node tail=null;

public void addnode(int data)
{
Node newnode=new Node(data);
if(head==null)
{
head=newnode;
tail=newnode;
head.prev=null;
tail.next=null;
}
else{
tail.next=newnode;
newnode.prev=tail;
tail=newnode;
tail.next=null;
}
}
public void display()
{
Node current=head;
if(head==null)
{
System.out.println("emptylist");
}
while(current!=null)
{
System.out.print(current.data + " ");
current=current.next;

}
System.out.println();



}
public static void main(String[] args)
{
doublylinkedlist double=new doublylinkedlist();

double.display();
double.addnode(0);
double.addnode(1);
double.addnode(2);
double.addnode(4);
double.addnode(5);
double.addnode(6);
double.addnode(7);
double.addnode(8);
double.addnode(9);


double.display();
}
}
