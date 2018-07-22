/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Calendar;
import java.util.GregorianCalendar;

public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Calendar d=new GregorianCalendar(2016, 2, 25);               
        System.out.println(d.get(Calendar.DAY_OF_MONTH));
        System.out.println(d.get(Calendar.MONTH));
        System.out.println(d.get(Calendar.YEAR));
    }
    
}
