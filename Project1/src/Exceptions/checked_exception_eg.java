/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exceptions;
import java.io.*;
/**
 *
 * @author aptech
 */
public class checked_exception_eg {

    public static void main(String[] args)// throws FileNotFoundException
    {        
        try
        {
        File f=new File("");        
        FileReader fr=new FileReader(f);       
        }catch(Exception e)
        {
            System.out.println(e.getCause());
        }
    }
    
}
