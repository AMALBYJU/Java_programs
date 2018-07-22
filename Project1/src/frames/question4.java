package frames;

import java.awt.*;
import java.awt.event.*;

public class question4 {
    Frame f;
    List l1,l2;
    Label lb1,lb2,lb3,lb4;
    
    public question4()
    {
        f = new Frame("Question 4"); // Title
        f.setSize(1500,500);
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent e) 
                {
                    System.exit(0);
                }
        }
        );
        f.setLayout(new FlowLayout());
        lb1 = new Label("Select name");
        lb2 = new Label("Select occupation");
        lb3 = new Label("");
        lb4 = new Label("");
        l1 = new List(4,false);
        l1.add("Amal");
        l1.add("Arun");
        l1.add("Maya");
        l1.add("Kevin");
        l1.add("Gauri");
        l1.add("Durvesh");
        l2 = new List(4,false);
        l2.add("Engineer");
        l2.add("Doctor");
        l2.add("Scientist");
        l2.add("Architect");
        l2.add("Military");
        l2.add("Artist");

        l1.addItemListener(new ItemListener() {
        public void itemStateChanged(ItemEvent e) {         
            lb3.setText("Name = " + l1.getSelectedItem());
         }
        });
        
        l2.addItemListener(new ItemListener() {
         public void itemStateChanged(ItemEvent e) {         
            lb4.setText("Occupation = " + l2.getSelectedItem());
         }
        });
        
        f.add(l1);
        f.add(l2);
        f.add(lb1);
        f.add(lb2);
        f.add(lb3);
        f.add(lb4);
    }
    public static void main(String[] args) {
        question4 q = new question4();
    }
    
}
