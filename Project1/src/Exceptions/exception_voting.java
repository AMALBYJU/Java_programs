package Exceptions;
import java.util.Scanner;
import java.io.*;

class InvalidAgeException extends Exception
{

    public InvalidAgeException() {
        System.out.println(this);
    }
    
}

class Voting
{
    
    public void check_Age(int a) throws InvalidAgeException
    {
        if(a<18)
        {
            throw new InvalidAgeException();
        }
        else
        {
            System.out.println("You are eligible");
        }
    }
}


public class exception_voting {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age ");
        int age = sc.nextInt();
        try
        {
        Voting v=new Voting();
        v.check_Age(age);
        }catch(InvalidAgeException e)
        {
            e.printStackTrace();
        }
    }
    
}
