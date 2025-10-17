import java.io.*;

public class RoemischeZahlen
{
      public static void main(String[] args) throws Exception
      {
         String roemischeZahl;
         int    arabischeZahl = 0;

         InputStreamReader eingabeLeser      = new InputStreamReader(System.in);
         BufferedReader    gepufferterLeser  = new BufferedReader(eingabeLeser);

         System.out.print("Roemische Zahl: ");
         roemischeZahl = gepufferterLeser.readLine();
         
         for(int i = 0; i < roemischeZahl.length(); i++)
         {
            char roemischChar = roemischeZahl.charAt(i);
            char roemischCharNext = '0';
            
            if(roemischeZahl.length() - 1 > i)
            {
               roemischCharNext = roemischeZahl.charAt(i+1);
            }

            if(roemischChar == 'I')
            {
               if(roemischCharNext == 'V' || roemischCharNext == 'X')
               {
                  arabischeZahl = arabischeZahl - 1;
               } 
               else
               {
                  arabischeZahl = arabischeZahl + 1;
               }
            }
            else if (roemischChar == 'V')
            {
                  arabischeZahl = arabischeZahl + 5;      
            }
            else if (roemischChar == 'X')
            {
               if(roemischCharNext == 'L' || roemischCharNext == 'C')
               {
                  arabischeZahl = arabischeZahl - 10;
               } 
               else
               {
                  arabischeZahl = arabischeZahl + 10;
               }       
            }
            else if (roemischChar == 'L')
            {
               arabischeZahl = arabischeZahl + 50;         
            }
            else if (roemischChar == 'C')
            {
               if(roemischCharNext == 'D' || roemischCharNext == 'M')
               {
                  arabischeZahl = arabischeZahl - 100;
               } 
               else
               {
                  arabischeZahl = arabischeZahl + 100;
               }        
            }
            else if (roemischChar == 'D')
            {
               arabischeZahl = arabischeZahl + 500;         
            }
            else if (roemischChar == 'M')
            {
               arabischeZahl = arabischeZahl + 1000;         
            }
            
            
         }
         
         System.out.println("Arabische Zahl: " + arabischeZahl);
         System.out.println("");
          
      }
}