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
public class rectangle extends shape{
    int len;
    int brd;
    int hgt;          

    public rectangle(int len, int brd, int hgt) {
        this.len = len;
        this.brd = brd;
        this.hgt = hgt;
    }  

    void area()
    {
        System.out.println("Area="+(len*brd));        
    }
    
    void perimeter()
    {
        System.out.println("Perimeter="+(2*(len+brd)));
    }
    void volume()
    {
        System.out.println("Volune="+(len*hgt*brd));
    }
}
