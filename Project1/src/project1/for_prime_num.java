/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1;

import java.util.Scanner;
public class for_prime_num {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();        
        
        int flag = 0;
        for(int i=2;i<=num;i++)
        {
            flag = 0;
            for(int j=2;j<=i/2;j++)
            {
                if(i%j == 0)
                {
                flag = 1;
                break;
                }
            }
            if(flag == 0)
            {
                System.out.println(i + " ");
            }
        }
    }
    
}
