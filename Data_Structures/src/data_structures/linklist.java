/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data_structures;

import java.util.*;

public class linklist {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedList l = new LinkedList();
        l.add("a");
        l.add("b");
        l.add(2,5);
        l.addLast("Z");
        l.addFirst("A");
        System.out.println("Display " + l);
        //System.out.println("Removed element is "+l.removeAll(l));
        Object v = l.get(2);
        System.out.println("Index 2 object " + v);
        
        l.set(3, v);
        System.out.println(l);         
    }
    
}
