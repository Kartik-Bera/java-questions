import java.util.Scanner;
public class Day 
{
    public static void main(String args[])
    {
        int a, year, m, day;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of days:");
        a = s.nextInt();
        year = a / 365;
        a = a % 365;
        m = a / 30;
        a = a % 30;
        day = a;
        System.out.println(year+" years/"+m+" month /"+day+"day");
    }
}