/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prs;

import java.util.Scanner;
import static sun.net.ftp.FtpReplyCode.find;

/**
 *
 * @author Sandy
 */
public class FIFO {
    public void fifo(Methods m ){
      System.out.println("  Enter the number of page refrences");
      Scanner in = new Scanner (System.in);
      int pagesx;
        pagesx = in.nextInt();
      m.setPage(pagesx);
        System.out.println(" Enter the number of Frames");
        Scanner inn=new Scanner(System.in);
        int frame;
        frame=inn.nextInt();
        m.setFrames(frame);

        for(int u = 0; u < m.page;u++) {
            System.out.println("Enter number of  " +"page"+ (u+1)  );
          
           
                     m.pages[u]= in.nextInt();
        }
          System.out.println();
        
        //lama tkon already fadya w7na 3yzen nd5l fiha
        
          for (int y=0;y<m.page;y++){
          if(m.check.size()<m.frames){
          if (m.check.contains(m.pages[y]))
          {m.hit++; System.out.println(m.getMemory()+" hit");}
          //if not found     
          if(!m.check.contains(m.pages[y])){
          
          m.check.add(m.pages[y]);
          m.faults ++;
           m.miss++;
          m.memory.add(m.pages[y]);
           System.out.println(m.getMemory()+" miss");
          }
          

          }
          
          
          
           
           
           
         
          
          // lma tkon mlyana fa bnms7 awl value galna w nd5l el gdid
          else 
              
          {
          if(!m.check.contains(m.pages[y])){
          //btgeb awl rakm t7oto f first page 
          m.firstpage=m.memory.peek();
          m.memory.poll();  //bn delete mn queue
          m.check.remove(m.firstpage); // bn delete mn hashset 
          m.check.add(m.pages[y]);     // bn add fl hashset
          m.memory.add(m.pages[y]);     //bn add fl queue 
          m.faults++;        
          m.miss ++; System.out.println(m.getMemory()+" miss");
          }
           }
          
        
              m.setFaults(m.faults);
          
            
  
                  
                  }
          
  
  
    
  
 System.out.println("Page faults numbers are : "+m.faults);
 
 System.out.println("number of page hit = " + m.hit);


    }
}
    
        
   