public class NewYorkTimes
{
   public static void main(String[] args)
   {
      System.out.println("");
      System.out.println("Delivering The New York Times");
      System.out.println("");
      System.out.println("Reaching the 5th avenue");
      System.out.println("");
      
      for(int m = 8; m <= 11; m++)
      {
         System.out.println("Reaching the " + m + "th avenue");

         for(int i = 14; i <= 20; i = i + 2)
         {
            System.out.println("");
            System.out.println("Enter No " + i);
         
            for(int n = 2; n <= 5; n++)
            {
              System.out.println("Delivered in No " + i + ", "+ "floor " + n);
            }

            System.out.println("");
         }

         System.out.println("-----------------------------------------------");
      }         
   }
}
