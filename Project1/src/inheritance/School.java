
package inheritance;

import java.util.Scanner;

public class School {
int roll;
    String sch_name;
    String sch_loc;

    School() {        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter school name");
        sch_name = sc.next();
        System.out.println("Enter school location");
        sch_loc = sc.next();
    }

    public School(String sch_name, String sch_loc) {
        this.sch_name = sch_name;
        this.sch_loc = sch_loc;
    }
    
    void show()
    {
        System.out.println("School Name="+sch_name);
        System.out.println("School Location="+sch_loc);
    }

}
