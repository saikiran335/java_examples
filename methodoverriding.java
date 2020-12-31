class Vehicle
{  
void run()
{
System.out.println("Vehicle is running");
}  
}  
 
class methodoverriding extends Vehicle
{  
  void run()
{
System.out.println("Bike is running safely");
}  
 
public static void main(String args[])
{  
Bike2 b = new Bike2(); 
b.run(); 

}  
} 