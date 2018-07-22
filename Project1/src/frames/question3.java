//Transfer the selected data from checkbox to choice

package frames;

import java.awt.*;
import java.awt.event.*;

public class question3 {
    Frame f;
    Checkbox[] c;
    Label l1;    // Input textbox
    Button btn;
    
    public question3()
    {
        f = new Frame("Question 3"); // Title
        f.setSize(500,500);
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent e) 
                {
                    System.exit(0);
                }
        }
        );
        c = new Checkbox[3];
        c[0] = new Checkbox("1");
        c[1] = new Checkbox("2");
        c[2] = new Checkbox("3");
        l1 = new Label("");
        btn = new Button("Update");
        
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                l1.setText("");
                for(int i = 0;i<3;i++)
                {
                    if(c[i].getState())
                    {
                        l1.setText(l1.getText() + " " + c[i].getLabel() + " ");
                    }
                }
            }
        });
        
        c[0].setBounds(50,50,50,50);
        c[1].setBounds(100, 50, 50, 50);
        c[2].setBounds(150, 50, 50, 50);
        l1.setBounds(170, 200, 100, 50);
        btn.setBounds(50,200,100,50);
        
        f.add(c[0]);
        f.add(c[1]);
        f.add(c[2]);
        f.add(l1);
        f.add(btn);

    }
    public static void main(String[] args) {
        question3 q = new question3();        
    }
    
}