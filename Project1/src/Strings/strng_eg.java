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
public class strng_eg {

    public static void main(String[] args) {
        String str="aptech";
        String s=new String("Computer");
        
        String s2=new String(new char[]{'a','f','n','a','n'});
        System.out.println(str.charAt(0));
        System.out.println(str.codePointAt(0));
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.compareTo("Aptech"));
        System.out.println(str.compareToIgnoreCase("ApTeCh"));
        System.out.println(str.concat(" Computer"));
        System.out.println(str.contains("a"));
        System.out.println(str.endsWith("ch"));
        System.out.println(str.startsWith("Ap"));
        System.out.println(str.equals("aptech"));
        byte[] arr=str.getBytes();
        for(byte i :arr)
        {
            System.out.print(i+" ");
        }
        System.out.println("");
        
        char[] ch={'a','e','i','e','o'};
        str.getChars(1, 3, ch, 2);
        for(char i :ch)
        {
            System.out.print(i+" ");
        }
        System.out.println("");
        System.out.println(str.indexOf("a"));
        System.out.println(str.indexOf(97, 0));
        System.out.println(str.length());
        System.out.println(str.intern());
        str="Apple,orange,Mango";
        String[] item=str.split(",");
        for(String i:item)
        {
            System.out.print(i+" ");
        }
        System.out.println("");
        
        
    }
    
}
