package linked_list;
import java.util.Scanner;

public class Stack {
    
    linkoperation l = new linkoperation();

    void push(int ele)
    {
        l.insertFirst(ele);
    }
    
    node pop()
    {
        return l.deleteFirst();
    }
    
    int peek()
    {
        return l.first.data;
    }
    
    void wordreversal(String str)
    {
        byte[] str_asc = str.getBytes();
        l = new linkoperation();
        for(byte i:str_asc)
        {
            push((int)i);
        }
        System.out.print("Reversed string : ");
        while(l.isEmpty() == false)
        {
            System.out.print((char)pop().data);
        }
        System.out.println("");  
        
    }
    
    public static void main(String[] args) {
        int choice;
        char ch;
        int ele;
        node n;
        String str;
        Stack s = new Stack();  // Creating a new stack
        Scanner sc = new Scanner(System.in);  
        System.out.println("MENU");
        System.out.println("1. Push\n2. Pop\n3. Display\n4. Peek\n5. Word reversal");
        do
        {
            System.out.print("Enter your choice ");
            choice = sc.nextInt();
            switch(choice)
            {
                case 1:System.out.println("Enter the element to be inserted ");
                       ele = sc.nextInt();
                       s.push(ele);
                       break;
                case 2:n = s.pop();      // This is the bnode that is deleted
                       System.out.println("Deleted element is = " + n.data);
                       break;
                case 3:s.l.displayList();
                       break; 
                case 4:if(s.l.first != null)
                        {
                            System.out.println("Topmost element of stack = " + s.l.first.data);
                        } 
                        break;
                case 5:System.out.println("Enter a string ");
                       str = sc.next();
                       s.wordreversal(str);
                       break;
            }
            System.out.println("Do you want to continue? (Y/N) ");
            ch = sc.next().charAt(0);
        }while(ch == 'y' || ch == 'Y');
    }
    
}
