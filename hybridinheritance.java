
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
public void run() 
    { 
        System.out.println("i will run when i see monkey"); 
    }
} 
class cat extends food
{ 
public void sleep() 
    { 
        System.out.println("i am sleep at mong"); 
    }
}
class homan extends dog,cat
{
}

public class hybridinheritance 
{ 
    public static void main(String[] args) 
    { 
        dog d = new dog();
        cat c= new cat();
        human h=new human(); 
        d.eat(); 
        c.drink(); 
        h.eat();
        h.drink();
        h.sleep();
        h.run();
    } 
} 
