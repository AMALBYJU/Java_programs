/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
package data_structures;

import java.util.*;

class Dlinklist extends LinkedList
{
    private static class node    {
        private int data;
        private node next;
        private node previous;
        public node(int data)
        {
            this.data = data;
            
        }
        public void displayNode()
        {
            System.out.println(data);
        }
        public String toString()
        {
            return Integer.toString(data);
        }
    }
    public node f = NULL;  // First pointer
    public node l = NULL;  // Last pointer
    public void addFirst(Dlinklist data)
    {
        if(this.isEmpty())
        {
        node n = new node(data);
        n.next = NULL;
        n.previous = NULL;
        
        f =n;
        l=n;
        }
        else
        {
            f.previous = n;
            n.next = f;
            n.previous = NULL;
            f = n;
            
        }

    }
    public void displayList()
    {
        node c = f;
        while(c != NULL)
        {
            c.displayNode();
            c = c.next;
        }

    }
}


public class double_list {


    public static void main(String[] args) {
        // TODO code application logic here
        Dlinklist d = new Dlinklist();
        d.addFirst
    }
    
}
*/
