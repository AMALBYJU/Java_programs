//add items to the choice from a textbox. Duplicate element are not allowed inot the choice. null values 
//are also not allowed
package frames;

import java.awt.*;
import java.awt.event.*;

public class question2 {
    Frame f;
    Choice c;
    TextField t1;    // Input textbox
    Button btn;
    
    public question2()
    {
        f = new Frame("Question 2"); // Title
        f.setSize(500,500);
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent e) 
                {
                    System.exit(0);
                }
        }
        );
        
        t1 = new TextField();
        btn = new Button("Add");
        c = new Choice();
        
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int flag = 0;
                for(int i = 0;i<c.getItemCount();i++)
                {
                    String str = c.getItem(i);
                    if(str.compareTo(t1.getText()) == 0 || t1.getText() == "")
                    {
                        flag = 1;
                        break;
                    }                    
                }
                if(flag == 0)
                {
                    c.add(t1.getText());
                }
                
            }
        });
        
        t1.setBounds(100,50,100,50);
        btn.setBounds(110,50,100,50);
        c.setBounds(100,110,100,100);
        
        f.add(c);
        f.add(t1);
        f.add(btn);
    }
    public static void main(String[] args) {
        question2 q = new question2();        
    }
    
}

