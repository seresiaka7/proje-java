public class Voiture {

    String marque;
    Double prix;

     public  Voiture( String marque,Double  prix ){
       // voiture1= new Mercedes()
       this.marque=marque;
       this.prix=prix;
       }
        public String  getMarque(  ){
        // voiture1= new Mercedes()
               return  marque;
        }
        
        public Double  getPrix( ){
            // voiture1= new Mercedes()
               return prix;
            }

         public void    setMarque( String marque ){
                // voiture1= new Mercedes()
                      this.marque=marque;
                }

         public void   setPrix( Double prix ){
                    // voiture1= new Mercedes()
                     this.prix=prix;
           }  

    


         
}

     class Example {

    public  static void main(String[] args ){

        Voiture voiture1 = new Voiture(" mercedes ",23799.22);
        Voiture voiture2 = new Voiture(" tesla ",2639.33);
        Voiture voiture3 = new Voiture("  toyota ",8222.00);

         System.out.println(" les marques sont : " +voiture1.getMarque() +":"+voiture2.getMarque()+":"+voiture3.getMarque()); 
         voiture3.setMarque("polar");
         System.out.println(" les marques sont : " +voiture1.getMarque() +":"+voiture2.getMarque()+":"+voiture3.getMarque()); 
     }

 }



