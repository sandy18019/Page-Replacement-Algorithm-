/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prs;

import java.util.Scanner;

/**
 *
 * @author Sandy
 */
public class PRS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Methods M1=new Methods (); 
          System.out.println("Page Replacement Simulator ");
          System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
System.out.println("Choose your needed algorithm");
System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    System.out.println("Enter 1 for FIFO\n"
                      +"Enter 2 for LRU  \n"+
                       "Enter 3 for Optimal\n");
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
  
           Scanner enter = new Scanner(System.in);
             int y=enter.nextInt();
    
        
             
             if(y==1)
       {
            FIFO obj = new FIFO();
             obj.fifo(M1);
             //LRU obj =new LRU();
             //obj.lru(M1);
       }  
             else if (y==2){
             LRU obj1 =new LRU();
             obj1.lru(M1);
       }  
             
             else if (y==3){
             
             Optimal obj2=new Optimal();
             obj2.optimal(M1);
             
             }
             
             
             
             
             }
       
    }
             

    

