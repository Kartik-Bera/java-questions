import java.util.Scanner; 
class Salary 
{ 
        public static void main(String args[]) 
        {   
       float bs,hra,gs,da;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter basic salary");
        bs=sc.nextFloat();
        
        if (bs<5000)
    {
        hra=bs*20/100;
        da=bs*50/100;
    }

    else
    {
        hra=2000;
        da=bs*75/100;
    }
    
    gs=bs+hra+da;
              System.out.println("Gross salary is : " + gs); 
   } 
}