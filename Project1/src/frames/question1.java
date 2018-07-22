package frames;

import java.awt.*;
import java.awt.event.*;

public class question1 {
    Frame f;
    Label l1,l2,l3,l4;
    Button add,sub,mult,div;
    TextField t1,t2;
    
    public question1()
    {
        f = new Frame("Calculator"); // Title
        f.setSize(500,500);
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent e) 
                {
                    System.exit(0);
                }
        }
        );
        l1 = new Label("Enter first number ");
        l2 = new Label("Enter second number ");
        l3 = new Label("Result is ");
        l4 = new Label("");  // To display the result
        add = new Button("+");
        sub = new Button("-");
        mult = new Button("*");
        div = new Button("/");
        t1 = new TextField();
        t2 = new TextField();
        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float first = Float.parseFloat(t1.getText());
                float second = Float.parseFloat(t2.getText());
                l4.setText(Float.toString(first + second)); // Addition
            }
        });
        sub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float first = Float.parseFloat(t1.getText());
                float second = Float.parseFloat(t2.getText());
                l4.setText(Float.toString(first - second)); // Subtraction
            }
        });
              
        mult.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float first = Float.parseFloat(t1.getText());
                float second = Float.parseFloat(t2.getText());
                l4.setText(Float.toString(first * second)); // Multiplication
            }
        });
        div.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float first = Float.parseFloat(t1.getText());
                float second = Float.parseFloat(t2.getText());
                l4.setText(Float.toString(first / second)); // Division
            }
        });
        
        l1.setBounds(100,50,100,50);
        l2.setBounds(100,100,100,50);
        l3.setBounds(100,300,100,50);
        l4.setBounds(200,300,100,50);
        add.setBounds(100,200,50,50);
        sub.setBounds(170,200,50,50);
        mult.setBounds(240,200,50,50);
        div.setBounds(310,200,50,50);
        t1.setBounds(200,50,100,50);
        t2.setBounds(200,100,100,50);
        
        f.add(l1);
        f.add(l2);
        f.add(l3);
        f.add(l4);
        f.add(t1);
        f.add(t2);
        f.add(add);
        f.add(sub);
        f.add(mult);
        f.add(div);
        
        
    }
    public static void main(String[] args) {
        question1 q = new question1();        
    }
    
}
