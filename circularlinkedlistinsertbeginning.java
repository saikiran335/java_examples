class circularlinkedlistinsertbeginning
{
class Node
{
int data;
Node next;

public Node(int data)
{
this.data=data;
}
}
int size;
public Node head=null;
public Node tail=null;

public void addnode(int data)
{
Node newnode=new Node(data);

if(head==null)
{
head=newnode;
tail=newnode;
tail.next=head;
}
else
{
Node temp=head;
newnode.next=temp;
head=newnode;
tail.next=head;
}
size++;
}




public void display()
{
Node current=head;
if(head==null)
{
System.out.println("empty list");
return;
}
else
{
do
{
System.out.print(current.data+ " ");
current=current.next;
}while(current!=head);

System.out.println();
}
}
public static void main(String[] args)
{
circularlinkedlistinsertbeginning circular=new circularlinkedlistinsertbeginning();
circular.display();
circular.addnode(9);
circular.addnode(8);
circular.addnode(7);
circular.addnode(6);
circular.addnode(5);
circular.addnode(4);
circular.addnode(3);
circular.addnode(2);
circular.addnode(1);
circular.display();


}
}