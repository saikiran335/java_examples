class circularlinkedlistremoveduplicates
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
tail.next=newnode;
tail=newnode;
tail.next=head;
}
size++;
}

public void removeduplicate()
{
Node current =head,index=null,temp=null;
if(head==null)
{
return;
}

else
{
do
{
temp=current;
index=current.next;
while(index!=head)
{
if(current.data==index.data)
{
temp.next=index.next;
}
else
{
temp=index;
}
index=index.next;
}
current=current.next;
}while(current.next!=head);
}
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
circularlinkedlistremoveduplicates circular=new circularlinkedlistremoveduplicates();
circular.display();
circular.addnode(1);
circular.addnode(4);
circular.addnode(3);
circular.addnode(1);
circular.addnode(6);
circular.addnode(9);
circular.addnode(4);
circular.addnode(1);
circular.addnode(2);
circular.addnode(3);

circular.display();

circular.removeduplicate();
circular.display();


}
}