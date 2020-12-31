public class circularlinkedlistsearch
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
}

public void searchnode(int ele)
{
Node current=head;
int i=1;
boolean flag=false;
if(head==null)
{
System.out.println("empty list");
}

else
{
do
{
if(current.data==ele)
{
flag=true;

break;
}
i++;
current=current.next;
}while(current!=head);
if(flag)
{
System.out.println("is found at" + i);
}
else
{
System.out.println("element is not found");
}
}
}


public void display()
{
Node current=head;
if(head==null)
{
System.out.println("empty list");
}
else{
do
{
System.out.print(current.data +" " );
current=current.next;
}while(current!=head);

System.out.println();
}
}


public static void main(String[] args)
{

circularlinkedlistsearch circular=new circularlinkedlistsearch();
circular.display();
circular.addnode(1);    
circular.addnode(2);    
circular.addnode(3);    
circular.addnode(4);        
circular.display();
circular.searchnode(3);
circular.searchnode(6);
circular.searchnode(4);      
}    
}
