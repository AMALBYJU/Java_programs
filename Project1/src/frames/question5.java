//Bank Application - welcome page
package frames;

import java.awt.*;
import java.awt.event.*;
public class question5 {
    Frame f;
    Label l1,l2,l3,l4;
    TextField txt1,txt2;  // Textarea
    Panel p1,p2;
    List li1;
    Button b1,b2;
 
    public question5()
    {
        f = new Frame("Question 6"); // Title
       f.setSize(1000,1000);
       f.setVisible(true);
       f.addWindowListener(new WindowAdapter() {
               public void windowClosing(WindowEvent e) 
               {
                   System.exit(0);
                }
        }
        );
        p1 = new Panel();
        p2 = new Panel();
        p1.setLayout(null);
        p2.setLayout(null);
        f.setLayout(new GridLayout(2,1));  // Top side - Name and password, bottom - ok,cancel
        l1 = new Label("BANK MANAGEMENT");
        l2 = new Label("NAME");
        l3 = new Label("PASSWORD");
        txt1 = new TextField();
        txt2 = new TextField();
        b1 = new Button("OK");
        b2 = new Button("CANCEL");
        li1 = new List(2,false);
        li1.add("Amal");
        li1.add("Arun");
        li1.add("Maya");
        li1.add("Kevin");
        li1.add("Gauri");
        li1.add("Durvesh");
       /* li1 = new List(3,false);
        li1.setVisible(true);
        li1.add("Amal");
        li1.add("Arun");
        li1.add("Maya");
        li1.add("Kevin");
        li1.add("Gauri");
        li1.add("Durvesh");*/
        //li1.setVisible(true);
        // Display list only when textbox for name is selected
        li1.addItemListener(new ItemListener() {
        public void itemStateChanged(ItemEvent e) {         
            txt1.setText(li1.getSelectedItem());
         }
        });
       /* b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                li1.setVisible(true);
            }
        });*/
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               // li1.setVisible(true);
               li1.add(txt1.getText());               
               txt1.setText("s");
               txt2.setText("s");
               
               txt1.setText("");
               txt2.setText(""); 
            }
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               txt1.setText("s");
               txt2.setText("s");
               
               txt1.setText("");
               txt2.setText(""); 
            }
        });
        l1.setBounds(0,0,150,25);
        l2.setBounds(100,100,150,25);
        l3.setBounds(100,135,150,25);
        txt1.setBounds(270,100,150,25);
        txt2.setBounds(270,135,150,25);
        li1.setBounds(500,100,100,100);
        b1.setBounds(100,100,150,25);
        b2.setBounds(100, 135, 150, 25);
        p1.add(l1);
        p1.add(l2);
        p1.add(l3);
        p1.add(txt1);
        p1.add(txt2);
        p1.add(li1);
        p2.add(b1);
        p2.add(b2);
        //p2.add(li1);
        f.add(p1);
        f.add(p2);
    }
    public static void main(String[] args) {
         question5 q = new question5();        
    }
    
}
