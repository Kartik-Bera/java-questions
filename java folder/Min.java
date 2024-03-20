import java.util.Scanner;
public class Min
{
    public static void main(String[] args) 
    {
        int n ,i ,min;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the values:");
        for(i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
          min = a[0];  
        for (int j = 0; j < a.length; j++)
        {       
           if(a[j] < min)  
               min = a[j];  
        }  
        System.out.println("Smallest element present in given array is : " + min);  
    }
}