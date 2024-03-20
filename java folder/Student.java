class Student {
   private int rno;
   private float cgpa;
   private String name;

   public Student(int r,cgpa c, String n) {
      rno = r;
      cgpa = c;
      name = n;
   }
   public String toString() {
      return rno + " " + cgpa + " " + name;
   }
}
public class Demo {
   public static void main(String[] args) {
      Student s = new Student(101,8.9f, "Kartik bera");
      System.out.println("The student details are:");
      System.out.println(s);
   }
}