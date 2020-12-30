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
public class LRU {
    
    public void lru (Methods m){
    
        
        
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

    
        m.store=new int [pagesx][m.frames];
        m.fram=new int[m.frames];
        for(int j = 0; j < m.frames; j++)
                m.fram[j] = -1;
        
        for(int u = 0; u < m.page;u++) {
            System.out.println("Enter number of  " +"page"+ (u+1)  );
          
           
                     m.pages[u]= in.nextInt();
        }
          System.out.println();
        
         for(int i = 0; i < m.page; i++)
        {
            if(m.list.contains(m.pages[i]))
            {
             m.list.remove(m.list.indexOf(m.pages[i]));
            }
            m.list.add(m.pages[i]);
            int search = -1;
            for(int j = 0; j < m.frames; j++)
            {
                if(m.fram[j] == m.pages[i])
                {
                    search = j;
                    m.hit++;
                    break;
                }
            }
         if(search == -1)
            {
             if(m.isfull)
             {
              int min_loc = m.page;
                    for(int j = 0; j < m.frames; j++)
                    {
                     if(m.list.contains(m.fram[j]))
                        {
                            int tmp = m.list.indexOf(m.fram[j]);
                            if(tmp < min_loc)
                            {
                                min_loc = tmp;
                                m.pin = j;
                            }
                        }
                    }
             }
             
             
             m.fram[m.pin] = m.pages[i];
                m.faults++;
                m.pin++;
                if(m.pin == m.frames)
                {
                 m.pin = 0;
                 m.isfull = true;
                }
            }
            for(int j = 0; j < m.frames; j++)
                m.store[i][j] = m.fram[j];
        }
         for(int i = 0; i < m.frames; i++)
        {
            for(int j = 0; j < m.page; j++)
                System.out.printf("%3d ",m.store[j][i]);
            System.out.println();
        }
        System.out.println("The n of Page Fault is: " + m.faults);
        System.out.println("The n of Page Hit is: " + m.hit);
             
}
}
