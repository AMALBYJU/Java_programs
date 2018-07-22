package linked_list;
import java.util.Scanner;

class stack_op    // Stack used for operation
{
    private char[] stack;
    private int top;
    private static final int max = 20;
    
    public stack_op()
    {
        stack = new char[max];
        top = -1;
    }
    
    public void push(char ch)
    {
        stack[++top] = ch;
    }
    
    public char pop()
    {
        return stack[top--];
    }
    
    public char peek()
    {
        return stack[top];
    }
    
    public boolean isEmpty()
    {
        return (top == -1);
    }    
}

class infixtopostfix
{
    String input;  // Input infix expression
    String output; // Output postfix expression
    stack_op s = new stack_op();
    
    public infixtopostfix(String in)  // Constructor  
    {
        input = in;
        output = "";
    }
    
    // Check precedence of operators
    public int prec(char op)
    {
        switch(op)
        {
            case '+':
            case '-':return 1;
            case '*':
            case '/':return 2;
        }
        return -1;
    }
    
    public void convert()
    {
        char ch;
        for(int i=0;i<input.length();i++)
        {
            ch = input.charAt(i);
            if(ch == '+' || ch == '-' || ch == '*' || ch =='/')
            {
                while(!s.isEmpty() && prec(s.peek()) >= prec(ch))
                {
                    output = output + Character.toString(s.peek());
                    s.pop();
                }
                s.push(ch);
            }
            else if(ch == '(')
            {
                s.push(ch);
            }
            else if(ch == ')')  // Remove all operators from stack till '('
            {
                while(!s.isEmpty() && s.peek() != '(')
                {
                    output = output + Character.toString(s.peek());
                    s.pop();
                }
                s.pop();
            }
            else   // alphabetical and other character entries
            {
                output = output + Character.toString(ch);
            }    
        }
        output = output + s.pop();
    }
}

// Building expression tree

class Node
{
    char data;
    Node left;
    Node right;
    
    public Node(char d)
    {
        data = d;
    }
}

class stack_node
{
    Node[] s;
    int top;
    
    public stack_node(int max)
    {
        s = new Node[max];
        top = -1;
    }
    
    public void push(Node n)
    {
        s[++top] = n;
    }
    
    public Node pop()
    {
        Node temp = s[top--];
        return temp;
    }
    
    public Node peek()
    {
        return s[top];
    }
}

class expressionTree
{
    Node root;             // Stores root of tree  
    String postfixStr;     // Postfix input string
    stack_node st;           // Stack used to build expression tree
    public expressionTree(String postStr)
    {
        root = null;
        postfixStr = postStr;
        st = new stack_node(30);   // 30 is the maximum stack length
    }
    
    public void generateTree()
    {
        char c;
        for(int i = 0;i<postfixStr.length();i++)
        {
            c = postfixStr.charAt(i);
            if(c == '+' || c == '-' || c == '*' || c =='/')
            {    
                Node first = st.pop();
                Node second = st.pop();
                Node operator = new Node(c);
                operator.left = second;
                operator.right = first;
                st.push(operator);
            }
            else
            {
                Node variable = new Node(c);
                st.push(variable);
            }
        }
        root = st.pop();       // The last address remaining in  the stack is the root node
    }
    
    public void preOrder(Node tempRoot)
    {
        if(tempRoot != null)
        {
            System.out.print(tempRoot.data + " "); //Displayig the current element
            preOrder(tempRoot.left);
            preOrder(tempRoot.right);
        }
    }
    
        
    public void postOrder(Node tempRoot)
    {
        if(tempRoot != null)
        {
            postOrder(tempRoot.left);
            postOrder(tempRoot.right);
            System.out.print(tempRoot.data + " "); //Displaying the current element
        }
    }
    
        
    public void inOrder(Node tempRoot)
    {
        if(tempRoot != null)
        {
            System.out.print("(");
            inOrder(tempRoot.left);
            System.out.print(tempRoot.data + " "); //Displayig the current element            
            inOrder(tempRoot.right);
            System.out.print(")"); 
        }
    }
    
}
public class infix_to_postfix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String postfix = new String();   // String containing the postfix expression
        System.out.println("Enter the infix expression ");  // Enter the infix expression
        infixtopostfix T = new infixtopostfix(sc.next());   
        // Convert to postfix
        T.convert();
        System.out.println("Postfix expression = " + T.output);
        // T.output contasins the postfix expression
        // Creating the expression tree
        expressionTree E = new expressionTree(T.output);
        E.generateTree();    // Expression tree is generated
        // Traverasal of tree 
        E.preOrder(E.root);
        System.out.println();  
        E.postOrder(E.root);
        System.out.println(); 
        E.inOrder(E.root);
        // Different ways of traversal of tree
    }
    
}
