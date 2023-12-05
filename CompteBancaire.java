public class CompteBancaire {
  String  numeroCompte;
  Double solde;
  String titulaire;

    public  CompteBancaire(String numeroCompte,Double solde  , String titulaire  ){
               this.numeroCompte=numeroCompte;
               this.solde=solde;
               this.titulaire=titulaire;
        }
      public String   getNumeroCompte( ){
        // voiture1= new Mercedes()
           return numeroCompte;
        }

      public void    setNumeroCompte( String numeroCompte ){
            // voiture1= new Mercedes()
                  this.numeroCompte=numeroCompte;
            }
            public Double   getSolde( ){
                // voiture1= new Mercedes()
                   return solde;
                }
        
              public void    setsolde( Double solde ){
                    // voiture1= new Mercedes()
                          this.solde=solde;
                    }
               public String   getTitulaire( ){
                        // voiture1= new Mercedes()
                           return titulaire;
                        }
                
              public void    setTitulaire( String titulaire ){
                            // voiture1= new Mercedes()
                                  this.titulaire=titulaire;
                         }

             public void    deposer( Double montant ){
                                // voiture1= new Mercedes()
                                    solde+=montant;  
                                }
              public void  retirer( Double montant ){
                                    // voiture1= new Mercedes()
                                        solde-=montant;  
                                    }

             public void  afficherDetails(  ){
                    // voiture1= new Mercedes()
                                System.out.println("le compte bancaire de Mr "+titulaire+" :"+"Numero de compte "+numeroCompte+" solde est : "+solde ); 
                                      
                                        }
    

    
}

class Main1 {

    public static void main(String[] args){
    

        CompteBancaire c1= new CompteBancaire("4321s",3.888,"sere");
        CompteBancaire c2= new CompteBancaire("1233s",0.00,"sali");
        c1.afficherDetails();
        c2.afficherDetails();




    }
}
