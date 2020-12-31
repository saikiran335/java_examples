
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
public class Singleinheritance 
{ 
    public static void main(String[] args) 
    { 
        two g = new two(); 
        g.eat(); 
        g.run(); 
        g.eat(); 
    } 
} 
