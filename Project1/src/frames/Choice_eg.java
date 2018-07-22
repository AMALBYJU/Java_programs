/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author aptech
 */
public class Choice_eg {
    Frame frm;
    Choice ch;
    Button btn;
    Label res;

    public Choice_eg() {
        frm=new Frame();
        frm.setSize(500, 500);
        frm.setVisible(true);
        frm.setLayout(new FlowLayout(FlowLayout.CENTER));
        
        frm.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
            System.exit(0);
            }
        });
        
        btn=new Button("Select an item");
        ch=new Choice();
        res=new Label();
        Dimension d=new Dimension(150, 50);
        res.setPreferredSize(d);
                
        ch.add("Arabic");        
        ch.add("English");
        ch.add("Other");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
         res.setText(ch.getSelectedItem());         
            }
        });

        
        ch.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
         res.setText(ch.getSelectedItem());
            }
        });
        
        frm.add(ch);
        frm.add(btn);
        frm.add(res);
        
    }
    
    
    public static void main(String[] args) {
        Choice_eg e=new Choice_eg();
        
    }
    
}
