
import java.lang.*; 
  
class one 
{ 
    public void eat() 
    { 
        System.out.println("i am eating"); 
    } 
} 
  
class two extends one 
{ 
    public void run() 
    { 
        System.out.println("i am running"); 
    } 
} 
class three extends two
{ 
    public void walk() 
    { 
        System.out.println("i am walking"); 
    } 
} 
class four extends three
{ 
    public void sleep() 
    { 
        System.out.println("i am sleeping"); 
    } 
} 
public class multilevelinheritance 
{ 
    public static void main(String[] args) 
    { 
        four g = new four(); 
        g.eat(); 
        g.run(); 
        g.walk();
        g.sleep(); 
    } 
} 
