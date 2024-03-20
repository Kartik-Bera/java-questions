import java.util.Scanner;
class PrimeNumbers
{
   public static void main (String[] args)
   {        
       int j =0;
       int n =0;
       String  primeNumbers = "";

    int temp;
    boolean isPrime=true;
    Scanner scan= new Scanner(System.in);
    System.out.println("Enter any number:");
    //capture the input in an integer
    int num=scan.nextInt();
        scan.close();
    for(int i=2;i<=num/2;i++)
    {
           temp=num%i;
       if(temp==0)
       {
          isPrime=false;
          break;
       }
    }
    if(isPrime)
       System.out.println(num + " is a Prime Number");
    else
       System.out.println(num + " is not a Prime Number");
   

       for (j = 1; j <= 100; j++)         
       {              
          int c=0;      
          for(n =j; n>=1; n--)
      {
             if(j%n==0)
         {
        c = c + 1;
         }
      }
      if (c ==2)
      {
         primeNumbers = primeNumbers + j + " ";
      } 
       }    
       System.out.println("Prime numbers from 1 to 100 are :");
       System.out.println(primeNumbers);
   }
}