/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data_structures;

import java.util.*;

public class queue1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        Queue q= new LinkedList();
        Queue q1= new LinkedList();
        q1.add("abc");
        boolean flag = q.offer(89);

        
        /* for(int i= 0 ;i<10;i++)
        {
            q.add(i);
        }*/
        System.out.println(flag);
        System.out.println(q.isEmpty());
        System.out.println(q.offer((int)90));
        q.addAll(q1);
        try
        {
            q.add(10);
            q.add(20);
            q.add(30);
            q.add(40);
            q.add(40);
            q.add(50);
            q.add(60);
            q.add(70);
            
        }
        catch(IllegalStateException e)
        {
            e.printStackTrace();
        }
         System.out.println(q);
         System.out.println("New head is  "+q.peek());

         System.out.println("Head = ");
          int head=0; 
         // Removal of elements
         try
         {
             head= (int)q.remove();
             System.out.println("Head = " + q.element());      
         }
         catch(NoSuchElementException e)
         {
             e.printStackTrace();
         }
         head=(int)q.poll();
         System.out.println((int)head);            
         System.out.println(q.peek());
         System.out.println("Dequeue"+q.contains(20)); 
                  
}}
