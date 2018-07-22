/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;
import java.util.Scanner;

/**
 *
 * @author aptech
 */
public class Address {
    String city;
    String country;

    public Address() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enetr City");
        city=sc.next();
        System.out.println("Enter Country");
        country=sc.next();
    }

    public Address(String city, String country) {
        this.city = city;
        this.country = country;
    }
    
    
}
