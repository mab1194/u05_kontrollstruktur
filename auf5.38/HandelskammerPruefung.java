import java.util.*;


public class HandelskammerPruefung
{
   public static void main(String[]args)
   {
      Scanner scanner = new Scanner(System.in);
   
      System.out.println("");
      System.out.printf("Punkte AP1:                          ");
      int ap1PunkteSchriftlich = scanner.nextInt();
      System.out.printf("\n");

      System.out.printf("Punkte AP2 schriftliche Pruefung 1:  ");
      int ap2PunkteSchriftlich1 = scanner.nextInt();
      System.out.printf("\n");


      System.out.printf("Punkte AP2 schriftliche Pruefung 2:  ");
      int ap2PunkteSchriftlich2 = scanner.nextInt();
      System.out.printf("\n");


      System.out.printf("Punkte AP2 schriftliche Pruefung 3:  ");
      int ap2PunkteSchriftlich3 = scanner.nextInt();
      System.out.printf("\n");


      System.out.printf("Punkte AP2 Projekt-Doku:             ");
      int ap2PunkteDoku = scanner.nextInt();
      System.out.printf("\n");


      System.out.printf("Punkte AP2 Muendliche Pruefung:      ");
      int ap2PunkteMuendlich = scanner.nextInt();
      System.out.printf("\n");


      int gesamtpunktzahl = Math.round((ap1PunkteSchriftlich + ap2PunkteSchriftlich1 + ap2PunkteSchriftlich2 + ap2PunkteSchriftlich3 + ap2PunkteDoku + ap2PunkteMuendlich) / 6);
      
      int fehlversuche = 0;
      int durchgefallen = 0;
      
      int [] werte ={ap2PunkteSchriftlich1, ap2PunkteSchriftlich2, ap2PunkteSchriftlich3, ap2PunkteDoku, ap2PunkteMuendlich};
      
      for(int punkte : werte)
      {  
            if(fehlversuche >=2)
            {
               System.out.println("");
               System.out.println("Gesamtpunkte: " + gesamtpunktzahl);
               System.out.println("Pruefung ist nicht bestanden, weil 2 oder mehr Punktzahlen unter 50 liegen.");

               break;
            }
            else if(punkte < 30)
            {
               System.out.println("");
               System.out.println("Gesamtpunkte: " + gesamtpunktzahl);
               System.out.println("Pruefung ist nicht bestanden, weil eine Punktzahl unter 30 liegt.");

               durchgefallen ++;

               break;
            }
      
            else if(punkte < 50)
            {
            
            fehlversuche++;
            
            }
      }  
      
      if ( fehlversuche<2 && durchgefallen<1)
      {
            System.out.println("Gesamtpunkte: " + gesamtpunktzahl);
            System.out.println("Pruefung bestanden");
      } 
   }
}