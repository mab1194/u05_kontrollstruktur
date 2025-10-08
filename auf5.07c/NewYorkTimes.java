public class NewYorkTimes
{
   public static void main(String[] args)
   {
      System.out.println("");
      System.out.println("Delivering The New York Times");
      System.out.println("");
      System.out.println("Reaching the 5th avenue");
      System.out.println("");
      
      for(int m = 5; m <= 7; m++)
      
      {
         System.out.println("Reaching the " + m + "th avenue");

         for(int i = 21; i <= 25; i = i + 2)
         {

            System.out.println("Enter No " + i);
         
            for(int n = 0; n <= 2; n++)
            {
              System.out.println("Delivered in No " + i + ", "+ "floor " + n);
            }

            System.out.println("");
         }

         System.out.println("-----------------------------------------------");
      }         
   }
}