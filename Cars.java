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
public class Cars extends Vehicle {


  
    private String Make;
    private String Model;
    private int Year;
    private int Weight;
    private String Drive;
    private int Miles;
    
     public static void  main(String[] args, String Make , String Model , String Drive, int Miles ) {
      Cars vehicle = new Cars();   
      Model(); 
      Make();
      Year();
      Weight();
      Miles();
      Drive();
      
     } 
     
     
    public static void Drive() 
    {        
     boolean isDriving = true;
     if(isDriving)
     {
          System.out.println("Your speed is 50mph.");
     }   
         
    }
    
    
  
   
     
    
  
}      
   
    
           
      
          

          
      





