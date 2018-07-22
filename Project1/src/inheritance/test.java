/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author aptech
 */
public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Student stud1=new Student(12,"Ahmed",123.525F,"DPS","DXB");        
//        stud1.display();
        Address a=new Address("DXB","UAE");
        Person p = new Person("abc","male",15,a);
        p.display();
    }

}
