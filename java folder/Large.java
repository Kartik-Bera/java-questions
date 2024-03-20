import java.util.Scanner;
public class Large
{
    public static void main(String[] args) 
    {
        int n, x, m = 0, i,max;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the values:");
        for(i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
          max = a[0];  
        for (int j = 0; j < a.length; j++)
        {       
           if(a[j] > max)  
               max = a[j];  
        }  
        System.out.println("Largest element present in given array: " + max);  
    }
}