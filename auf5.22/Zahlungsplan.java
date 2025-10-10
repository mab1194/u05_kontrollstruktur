public class Zahlungsplan
{
   public static void main(String[] args)
   {
      int kreditbetrag;
      kreditbetrag = 620;
      int ratenanzahl;
      ratenanzahl  = 6;

      System.out.println("");
      System.out.println("Zahlungsplan");
      System.out.println("============");

      for(int i = 1; i <= ratenanzahl;i++)
      {
         System.out.println(i + ". Rate: " + kreditbetrag/ratenanzahl);
      }
   }
}