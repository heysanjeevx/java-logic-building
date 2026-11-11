// Section 1.4 | Q116
public class Question116 {
   public static void main(String[] args) {
       int x = 4, y = 5;
       int z = ++x + y-- - x++ + --y;
       System.out.println(z); // Output: 8
   }
}
