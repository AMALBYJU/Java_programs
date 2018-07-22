/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data_structures;

import java.util.*;

class Book
{
    int book_no;
    String book_name;
    float price;
    String author;
    public Book(int bn,float p,String bname,String auth )
    {
        book_no = bn;
        price = p;
        book_name = bname;
        author = auth;
    }    
}

public class list {

    public static void main(String[] args) {
        List l1 = new LinkedList();
        List l2=new LinkedList();
        Book b1 = new Book(1,23.54f,"ABCD","Author1");
        Book b2 = new Book(2,26.01f,"EFGH","Author2");
        //Book b3 = new Book(3,35.45f,"GHIJ","Author3");
        l1.add(b1);
        l2.add(b2);
        //l.add(b3);
        //System.out.println("List is  = " + l1);
        System.out.println("");
        for(int i = 0;;i++)
        {
            System.out.println(b1.book_no+" "+b1.book_name+ " "+ b1.author);
        }
    }
    
}
