import java.util.Scanner; 
class Bill 
{ 
        public static void main(String args[]) 
        {   
       long units;
 
       Scanner sc=new Scanner(System.in);
 
       System.out.println("Enter number of units");
       
           units=sc.nextLong();
 
           double billpay=0;
 
           if(units<=100)
        {
            billpay=units*2;
        }
            else if(101<=units && units<=150)
        {
            billpay=100*2+(units-100)*3;
        }
        else if(units>150)
        {
            billpay=100*2+50 *3+(units-150)*7;
        }
        billpay=billpay+200;
              System.out.println("Bill to pay : " + billpay); 
   } 
}