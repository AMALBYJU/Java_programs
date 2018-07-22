package oops;

class sample
{
    static final int i=20;
    final void input()
    {
        System.out.println("HAi");
    }
}

class tests extends sample
{
    void input1()
    {
        System.out.println("Hello");
    }
}
public class final_method 
{    
    public static void main(String[] args) {
        tests t=new tests();
        tests t2 = new tests();
        tests t3 = new tests();
        System.out.println(t.i);
        System.out.println(t2.i);
        System.out.println(t3.i);    
        t.input();                
    }
    
}
