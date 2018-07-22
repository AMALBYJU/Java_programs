/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1;

/**
 *
 * @author aptech
 */
public class break_cont_while {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i = 1;
        int j = 1;
        System.out.println("Labeled break");
        lbl:
        while(i<10)             
        {
            j = 1;
            while(j<10)
            {
                System.out.print(j);
                if(j==5 && i == 3)
                {
                    break lbl;
                }
                j++; 
                System.out.println();
            }
            i++;
        }
        i = 1;
        j = 1;
        System.out.println("Labeled continue");
        
       lbl1:
        while(i<10)
        {
            j = 1;
            while(j<10)
            {
                
                if(j==5 && i== 3)
                { i++;
                    continue lbl1;
                }
                System.out.print(j);
                j++;
               
            } System.out.println();
            i++;
        }
    }
    
}
