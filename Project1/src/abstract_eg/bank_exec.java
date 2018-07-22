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
public class bank_exec {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        bank1 A = new bank1();
        bank2 B = new bank2();
        A.interest(12000,2);
        B.interest(12000,2);
    }
    
}
