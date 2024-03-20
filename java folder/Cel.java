import java.util.Scanner;
public class Cel 
{
    public static void main(String[] args) 
    {
        float celsius, fahrenheit;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit:");
        fahrenheit = s.nextFloat();
        celsius = (fahrenheit-32)*(5.0f/9.0f);
        System.out.println("Temperature in Celsius:"+celsius);        
    }
}