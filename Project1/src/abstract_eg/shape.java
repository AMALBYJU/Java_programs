/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstract_eg;

/**
 *
 * @author aptech
 */
public abstract class shape {
    
    void details()
    {
        System.out.println("A shape do have a length, width and height.");
    }
    abstract void perimeter();
    abstract void area();
    abstract void volume();
    
}
