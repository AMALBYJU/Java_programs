/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1;

import java.util.Scanner;
public class while_even_num {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int i = 1;
        while(i <= n)
        {
            if(i%2 == 0)
            {
                System.out.println(i+" ");
            }
            i++;
        }
    }
    
}
