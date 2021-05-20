/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicle;

/**
 *
 * @author tomsc
 */
public   class Vehicle {
   
   
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
        {
       Cars();
       Make();    
       Model();
       Year();
       Weight();
       Miles();
       NeedsMaintenance();
       Speed();
       Driving();
       
    }  
    public static void Make(){
    System.out. println("Make" );
    }
  
    public static void Model(){
     System.out.println("Model");
    }    
     public static void Year(){
     System.out.println("Year");
     }
     
    public static void Weight(){
        System.out.println("Weight");
    }   
     public static void Miles(){
        System.out.println("Miles");
     }
      public static void Speed(){
       System.out.println("Speed");
     }
     public static void Driving(){
         System.out.println("Driving");
     }
      private static void Cars() 
      {
         
      }         
     public static void NeedsMaintenance(){
        boolean NeedsMaintenance = false;
        if(NeedsMaintenance)
        {
            System.out.println("Miles ==>100");
        }    
        else
        {
            System.out.println("Miles <100, No maintenance need.");
            System.out.println("TripsSinceMaintenance reset to o.");
        }
     }
    
void print()
   {
      
   }
    
  

          
        
     
    
   
   
   
}     

            
         
        
                    
      

    







    
   

    

    