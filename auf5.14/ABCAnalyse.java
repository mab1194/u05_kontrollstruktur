// u05_kontrollstruktur
// auf5.14

// schlechter Code
public class ABCAnalyse
{
   public static void main (String[] args)
   {
      char prioritaet = 'A';
      
      if(prioritaet == 'A')
      {
         System.out.println("Prioritaet hoch");
      
         
         if(prioritaet == 'B')
         {
            System.out.println("Mittel");         
         }      
        
            if(prioritaet == 'C')
            {
               System.out.println("Niedrig");
            }
      }

      else
      {
         System.out.println("unzulaessiger Wert");
      }
   }
}