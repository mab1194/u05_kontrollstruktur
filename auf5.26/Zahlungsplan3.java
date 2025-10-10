import java.util.Scanner;

public class Zahlungsplan3
{
   public static void main(String[] args)
   {
      Scanner scanner = new Scanner(System.in);

      System.out.println("Bitte einen ganzahligen Kreditbetrag eingeben");

      int kreditbetrag = scanner.nextInt();
      
      scanner.close();

      System.out.println("Bitte einen ganzahligen Ratenbetrag eingeben");

      int ratenbetrag = scanner.nextInt();
      
      scanner.close();

      int ratenanzahl;

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
