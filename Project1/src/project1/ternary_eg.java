/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1;

public class ternary_eg {  
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        int z = 30;
        int greatest = (x>y && x>z)?x:(y>z)?y:z;
        System.out.println(greatest);
    }    
}
