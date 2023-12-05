
public class  premier {


    public static  void  main(String[] args) {
        // les variables et leur type 
        String nom ="hELLO WORLD SERE SIAKA";
        int entier=33;
        Double double1=44.2;
        char ca='a';
        boolean estvrai=true;

 //Utilisation de formatage  avec printf
    
        System.out.printf (" la valeur est %d ",entier );
        System.out.printf (" le nom est %s",nom);
        System.out.printf (" la valeur est %f ",double1 );
        System.out.printf (" la valeur est %d ",entier );
        System.out.printf (" la valeur est  %b%n ",estvrai );

        //Utilisation de formatage  avec printf
        String  forma= String.format("  les valeurs sont %d : %s : %f :%d :%b%n  ",entier,nom,double1,entier,estvrai );

         System.out.println (forma );
      // Utilisation des opérateurs mathématiques 
         int a=44;
         int b=5;
           int add=a+b;
           int sos=a-b;
           int mul=a*b;
           int div=a/b;
           int eucl=a%b;
         System.out.printf(" l'addition  %d + %d est :%d ",a,b,add);
         System.out.printf(" la difference   %d - %d est :%d ",a,b,sos);
         System.out.printf(" la multiplication  %d  * %d est :%d ",a,b,mul);
         System.out.printf(" la division   %d / %d est :%d ",a,b,div);
         System.out.printf(" l'addition  %d  et  %d est : %d ",a,b,eucl);

         

    }

}