import java.util.Scanner;

public class Calculator {

    
    public static int add(int x,int y)
    {
       int z;
       z=x+y;
       return z;
    }

    public static int sub(int x,int y)
    {
       int z;
       z=x-y;
       return z;
    }
    public static int mul(int x,int y)
    {
       int z;
       z=x*y;
       return z;
    }
    public static int div(int x,int y)
    {
       int z;
       z=x/y;
       return z;
    }
    public static int mod(int x,int y)
    {
       int z;
       z=x%y;
       return z;
    }    
    
    
    public static void main(String[] args) {
        int a,b,c,option;
        boolean d;
        Scanner s=new Scanner(System.in);
        System.out.println("enter two numbers:");
        a=s.nextInt();
        b=s.nextInt();
        System.out.println("enter true or false");
        d=s.nextBoolean();

        System.out.println("--------CALCULATOR---------");
        do{
        System.out.println(" 1.ADDITION \n 2.SUBTRACTION \n 3.MULTIPLICATION \n 4.DIVISION \n 5.MODULO");
        System.out.println("###################ENTER THE OPTION TO PERFORM THE OPERATION##################");
        
        option=s.nextInt();
        
            switch(option)
            {
             
                case 1:
                    c = add(a,b);
                    System.out.println("result is: "+ c);
                    break;

                case 2:
                    c = sub(a,b);
                    System.out.println("result is: "+ c);
                    break;

                case 3:
                    c = mul(a,b);
                    System.out.println("result is: "+ c);
                    break;

                case 4:
                    c = div(a,b);
                    System.out.println("result is: "+ c);
                    break;

                case 5:
                    c = mod(a,b);
                    System.out.println("result is: "+ c);
                    break;
                default:
                    System.out.println("choose the right option");
                    break;
                    
            


            }
                    

        }while(d==true);



        System.out.println("THANK YOU");
            // TODO code application logic here
    }
    
}