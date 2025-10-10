public class Zahlungsplan2
{
   public static void main(String[] args)
   {
      int kreditbetrag;
      kreditbetrag = 599;
      int ratenanzahl;
      int ratenbetrag;
      ratenbetrag  = 100;
      ratenanzahl  = (int) Math.ceil((double)kreditbetrag/ratenbetrag);

      System.out.println("");
      System.out.println("Zahlungsplan2");
      System.out.println("============");

      for(int i = 1; i <= ratenanzahl;i++)
      {
         if(kreditbetrag>=ratenbetrag)
         {
            kreditbetrag = kreditbetrag - ratenbetrag;
            System.out.println(i + ". Rate: " + ratenbetrag);
         }
         else
         { 
            System.out.println(i + ". Rate: " + kreditbetrag);
         }
      }
   }
}
