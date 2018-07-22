/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strings;

/**
 *
 * @author aptech
 */
public class Invertcase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String str = "abcdEFGH";
        char[] ch = str.toCharArray();
        
        for(int i = 0;i<str.length();i++)
        {
            if(Character.isUpperCase(ch[i]))
                ch[i] = Character.toLowerCase(ch[i]);
            else if(Character.isLowerCase(ch[i]))
                ch[i] = Character.toUpperCase(ch[i]);
        }

        str = new String(ch);
        System.out.println(str);
    }
    
}
