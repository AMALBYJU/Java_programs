
package inheritance;

import java.util.Scanner;

public class Student extends School
{

    private final int roll;
    private String name;
    private float marks;

    public Student() {
                
        Scanner sc = new Scanner(System.in);        
        System.out.println("Enter roll");
        roll = sc.nextInt();
        System.out.println("Enter name");
        name = sc.next();
        System.out.println("Enter marks");
        marks = sc.nextFloat();
    }

    Student(int roll, String name, float marks) {        
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }

    public Student(int roll, String name, float marks, String sch_name, String sch_loc) {
        super(sch_name, sch_loc);
        this.roll = roll;
        this.name = name;
        this.marks = marks;
        super.roll=90;        
    }
    
    

    void display() {
        System.out.println("Roll =" + roll);
        System.out.println("Name=" + name);
        System.out.println("Marks=" + marks);        
        System.out.println("School Name="+sch_name);
        System.out.println("School Location="+sch_loc);

    }
}
