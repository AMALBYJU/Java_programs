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
public class Person {        
    String name;
    String gender;
    int age;
    Address addr;

    public Person() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name");        
        name=sc.next();
        System.out.println("Enter gender");
        gender=sc.next();        
        System.out.println("Enter age");
        age=sc.nextInt();
        addr=new Address();
    }

    public Person(String name, String gender, int age,String city,String country) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.addr=new Address(city,country);
    }

    public Person(String name, String gender, int age, Address addr) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.addr = addr;
    }
    
    
    void display()
    {
        System.out.println("Name="+name);
        System.out.println("Gender="+gender);
        System.out.println("Age="+age);
        System.out.println("City="+addr.city);
        System.out.println("Country="+addr.country);
    }
    
}
