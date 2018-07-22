/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oops;
import java.util.Scanner;
/**
 *
 * @author aptech
 */
final class Student {
    private final int roll;
    private String name;
    private float marks;
    static String sch_name="DPS";
    
    public Student()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter roll");
        roll=sc.nextInt();
        System.out.println("Enter name");
        name=sc.next();
        System.out.println("Enter marks");
        marks=sc.nextFloat();
    }
    static void set_school()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a school name");
        sch_name=sc.next();
    }
    Student(int roll,String name,float marks)
    {
       // this();
        this.roll=roll;
        this.name=name;
        this.marks=marks;
    }
    void display()
    {        
        System.out.println("Roll ="+roll);
        System.out.println("Name="+name);
        System.out.println("Marks="+marks);
        System.out.println("School="+sch_name);
    }
}

class tester
{
     Scanner sc = new Scanner(System.in);
     public int x;
     static
     {
         System.out.println("Hello");
     }
     public void scan()
     {
         x = sc.nextInt();
     }     
}
