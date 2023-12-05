

public class  methodesstring {


    public static  void  main(String[] args) {

        // Conversion 
        String nom ="hELLO WORLD SERE SIAKA";
        

 //Utilisation de formatage  avec printf
    
        System.out.printf (" %n tout en minuscule :%n %s  ",nom.toLowerCase() );
        System.out.printf (" %n tout en masjucule  : %s %n ",nom.toUpperCase() );

            String rep=nom.replace("SERE","dali monsieur ");
            String[] dec= nom.split(" ");
            String sous=nom.substring(0,8);
            System.out.println( sous);
            System.out.println( rep);
             Boolean  bn= nom.equals("hELLO WORLD SERE SIAKA");
            if(bn){
                     System.out.println( "vrai");

            }
            else{
                System.out.println("faux");
            }
            
          for (String i: dec){
            System.out.println( i);
          }
         
          

       
        
         

    }

}