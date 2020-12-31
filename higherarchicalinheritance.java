
import java.lang.*; 
  
class food 
{ 
    public void eat() 
    { 
        System.out.println("i am eating"); 
    } 
    public void drink() 
    { 
        System.out.println("i am running"); 
    } 
} 
  
class dog extends food 
{ 
} 
class cat extends food
{ 
}

public class higherarchicalinheritance 
{ 
    public static void main(String[] args) 
    { 
        dog d = new dog();
        cat c= new cat(); 
        d.eat(); 
        c.drink(); 
        
    } 
} 
