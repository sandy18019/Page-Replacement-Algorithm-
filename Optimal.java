/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prs;
import java.util.Scanner;
import java.io.IOException;
/**
 *
 * @author yasmi
 */
public class Optimal {
    
    
  public void optimal (Methods m){
    {
     

        System.out.println("Please enter the number of frames: ");
        Scanner inn=new Scanner(System.in);
        int frame;
        frame=inn.nextInt();
        m.setFrames(frame);

        System.out.println("Please enter the length of the reference string: ");
         Scanner in = new Scanner (System.in);
      int pagesx;
        pagesx = in.nextInt();
      m.setPage(pagesx);

        m.pages = new int[m.page];
        m.store = new int[m.page][m.frames];
        m.fram = new int[m.frames];
        m.hits = new boolean[m.page];
        m.fault = new int[m.page];
        for(int k = 0; k < m.frames; k++)
        {
            m.fram[k] = -1;
        }

        System.out.println("Please enter the reference string (hit Enter/Return after each number in the string): ");
       for(int u = 0; u < m.page;u++) {
            System.out.println("Enter number of  " +"page"+ (u+1)  );
          
           
                     m.pages[u]= in.nextInt();
        }
          System.out.println();
        for(int y = 0; y < m.page; y++)
        {
            int search = -1;
            for(int k = 0; k < m.frames; k++)
            {
                if(m.fram[k] == m.pages[y])
                {
                    search = k;
                    m.hits[y] = true;
                    m.fault[y] = m.miss;
                    break;
                }
            }

            if(search == -1)
            {
                if(m.isfull)
                {
                    int index[] = new int[m.frames];
                    boolean index_flag[] = new boolean[m.frames];
                    for(int k = y + 1; k < m.page; k++)
                    {
                        for(int s = 0; s < m.frames; s++)
                        {
                            if((m.pages[k] == m.fram[s]) && (index_flag[s] == false))
                            {
                                index[s] = k;
                                index_flag[s] = true;
                                break;
                            }
                        }
                    }
                    int max = index[0];
                    m.pin= 0;
                    if(max == 0)
                    {
                        max = 200;
                    }

                    for(int k = 0; k < m.frames; k++)
                    {
                        if(index[k] == 0)
                        {
                            index[k] = 200;
                        }

                        if(index[k] > max)
                        {
                            max = index[k];
                            m.pin = k;
                        }
                    }
                }
                m.fram[m.pin] = m.pages[y];
                m.miss++;
                m.fault[y] = m.miss;
                if(!m.isfull)
                {
                    m.pin++;
                    if(m.pin == m.frames)
                    {
                        m.pin = 0;
                        m.isfull= true;
                    }
                }
            }

            for(int k = 0; k < m.frames; k++)
            {
                m.store[y][k] = m.fram[k];
            }
        }

        for(int y = 0; y < m.page; y++)
        {
            System.out.print(m.pages[y] + ": Memory is: ");
            for(int k = 0; k < m.frames; k++)
            {
                if (m.store[y][k] == -1)
                {
                    System.out.printf("%3s ", "*");
                } else
                {
                    System.out.printf("%3d ", m.store[y][k]);
                }
            }
            System.out.print(": ");
            if (m.hits[y]) {
                System.out.print("Hit");
            } else
            {
                System.out.print("Page Fault");
            }
            System.out.print(": (Number of Page Faults: " + m.fault[y] + ")");
            System.out.println();
        }
        System.out.println("Total Number of Page Faults: " + m.miss);
         System.out.println("Total Number of Page hits: " + m.hit);
        
    }
  }}
