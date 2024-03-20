public class Words 
{
   public static void main( String args[] ) 
   {
      String str = "Hello everyone, good afternoon";
      String [] words = str.split(" ",5);
      for(String word : words)
      {
      System.out.println(word);
      }
   }
}