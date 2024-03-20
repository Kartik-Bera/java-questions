public class SubString 
{
   public static void main( String args[] ) 
   {
      String str = "This is lunch time.";
      int startIndex = str.indexOf("lunch");
      String s = str.substring(startIndex,startIndex + 5);

      System.out.println(s);
   }

}