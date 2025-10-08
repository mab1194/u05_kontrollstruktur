public class Wochenblatt
{
   public static void main(String[] args)
   {
      System.out.println("");
      System.out.println("Zustellung Wochenblatt");
      System.out.println("");

      for(int i = 5; i <= 7; i++)
      {
         System.out.println("Ich betrete Nr " + i);
         
         for(int n = 0; n <= 3; n++)
            {
              System.out.println("Zugestellt in Nr " + i + ", " + n + ".Stock");
            }
         System.out.println("");
      }         
   }
}
