public class DegressiveAbschreibung2
{
   public static void main(String[] args)
   {
      int nutzungsdauer = 8;
      int neuwert = 100000;
      int abschreibungsprozentsatz = 30;

      int abschreibungsbetrag = 0;
      int buchwertJahresanfang = 0;
      int buchwertNachAbschreibung = 0;
      int linearerAbschreibungsbetrag = 0;
      int degressiverAbschreibungsbetrag = 0; 
      int anzahlJahre = 1;
      
      buchwertJahresanfang = neuwert;

      System.out.printf("Jahr    " + "Buchwert am     " + "Abschreibungs-" + "Buchwert nach   " + "\n");
      System.out.printf("        " + "Jahresanfang    " + "betrag        " + "der Abschreibung" + "\n");
      
    

      for(int i = anzahlJahre; anzahlJahre <= nutzungsdauer; anzahlJahre++)
      {
         linearerAbschreibungsbetrag    = buchwertJahresanfang/(nutzungsdauer - (anzahlJahre -1));
         degressiverAbschreibungsbetrag = (buchwertJahresanfang * abschreibungsprozentsatz)/100;

 
         if(linearerAbschreibungsbetrag > degressiverAbschreibungsbetrag)
         {  
            abschreibungsbetrag = linearerAbschreibungsbetrag;
            break;
         }
         else
         {
             abschreibungsbetrag  = degressiverAbschreibungsbetrag;       
         }
         
         buchwertNachAbschreibung = buchwertJahresanfang - abschreibungsbetrag; 
         
         System.out.printf("%2d     " + "%8d             " + "%8d           " + "%8d          " + "\n"  , anzahlJahre, buchwertJahresanfang, abschreibungsbetrag, buchwertNachAbschreibung);
         
         buchwertJahresanfang     = buchwertNachAbschreibung;           
      }
      for(int i = anzahlJahre; anzahlJahre <= nutzungsdauer; anzahlJahre++)
      {
         buchwertNachAbschreibung = buchwertJahresanfang - abschreibungsbetrag;
         
         System.out.printf("%2d     " + "%8d             " + "%8d           " + "%8d          " + "\n"  , anzahlJahre, buchwertJahresanfang, abschreibungsbetrag, buchwertNachAbschreibung);
         
         buchwertJahresanfang     = buchwertNachAbschreibung;
      }  
         
      System.out.println("");
   }
}