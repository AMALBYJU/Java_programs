package project1;

import java.util.Scanner;

public class Project1 {
   
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Maths, Science and English marks\n");
        int math = sc.nextInt();
        int sci = sc.nextInt();
        int eng = sc.nextInt();
        int tot = (math+sci+eng);
        int avg = tot/3;
        int per =(int)((float)tot/150*100);
        
        System.out.println("Maths = "+math);
        System.out.println("Science = "+sci);
        System.out.println("English = "+eng);
        System.out.println("Total = "+tot);
        System.out.println("Average = "+avg);
        System.out.println("Percentage="+per);
    }
    
}
