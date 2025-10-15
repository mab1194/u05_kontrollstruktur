import java.util.*;


public class Geldautomat
{
   public static void main(String[] args)
   {  
      Scanner scanner = new Scanner(System.in);
      System.out.printf("Wieviel wollen Sie abheben? ");
      int geldbetrag = scanner.nextInt();
      System.out.printf("\n");

   
      int fuenfzigEuro = 10;
      int zwanzigEuro = 10;
      int zehnEuro = 10;
    
      int ausgegebeneFuenfziger = 0;
      int ausgegebeneZwanziger = 0;
      int ausgegebeneZehner = 0;

      if(geldbetrag>(fuenfzigEuro * 50 + zwanzigEuro * 20 + zehnEuro * 10))
      {
         System.out.println("Auszahlung nicht moeglich");
      }
      
      if(geldbetrag >=50)
      {
         for(int i = 1; geldbetrag>=50 && ausgegebeneFuenfziger<10 ;i++)
         {
            ausgegebeneFuenfziger++;
            geldbetrag = geldbetrag - 50;
   
         } 
         
         if(geldbetrag>=20)
         {
            for(int i = 1; geldbetrag>=20 && ausgegebeneZwanziger<10 ;i++)
            {
               ausgegebeneZwanziger++;
               geldbetrag = geldbetrag - 20;
            }
            
         if(geldbetrag>= 10)
         {
            for(int i = 1; geldbetrag>=10 && ausgegebeneZehner<10;i++)
            {
               ausgegebeneZehner++;
               geldbetrag = geldbetrag - 10;
            }
          }
   
          if(geldbetrag>0)
          {
            System.out.println("Auszahlung nicht moeglich");
          }
          else
          { 
            System.out.println("Ausgabe:");
            System.out.println(ausgegebeneFuenfziger + " Fuenfzig-Euro-Scheine");
            System.out.println(ausgegebeneZwanziger + " Zwanzig-Euro-Scheine");
            System.out.println(ausgegebeneZehner + " Zehn-Euro-Scheine");   
          }
}
      }  
   }
}