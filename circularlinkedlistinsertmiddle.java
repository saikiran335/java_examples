class circularlinkedlistinsertmiddle
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
}
size++;
}

public void insertnode(int data)
{
Node newnode = new Node(data); 
if(head==null)
{
head=newnode;
tail=newnode;
}

else
{
Node temp,current;

int count=(size % 2==0)?(size/2):((size+1)/2);

temp=head;
current=null;


for(int i=0;i<count;i++)
{
current=temp;
temp=temp.next;
}
current.next=newnode;
newnode.next=temp;
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
else{
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
circularlinkedlistinsertmiddle circular=new circularlinkedlistinsertmiddle();

circular.display();
circular.addnode(1);
circular.addnode(2);
circular.addnode(3);
circular.addnode(4);
circular.addnode(5);
circular.addnode(6);

circular.display();

circular.insertnode(8);
circular.display();

circular.insertnode(7);
circular.display();
}
}