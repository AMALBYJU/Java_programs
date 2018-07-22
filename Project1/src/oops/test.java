/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oops;

/**
 *
 * @author aptech
 */
public class test {

    static
    {
        System.out.println("Hello World");
    }
    
    
    public static void main(String[] args) {
        Student stud1 = new Student(1, "Ahmed", 123.33F);
        Student stud2 = new Student(1, "Anoop", 121.23F);
        //Student.sch_name="Habitat";
        Student.set_school();
        stud1.display();
        stud2.display();   
        tester t1 = new tester();        
    }

}
