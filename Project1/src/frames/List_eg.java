/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
/**
 *
 * @author aptech
 */
public class List_eg {
    Frame frm;
    List lst;
    Button btn;
    Label lbl;

    public List_eg() {
        frm=new Frame();
        frm.setSize(500, 500);
        frm.setVisible(true);
        frm.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
            System.exit(0);
            }
        });
        frm.setLayout(new FlowLayout(0));
        
        lst=new List(0, true);
        btn=new Button("Select items");
        lbl=new Label();
        
        lbl.setPreferredSize(new Dimension(150,50));
        
        lst.add("Apple");
        lst.add("Grapes");
        lst.add("Banana");
        lst.add("Kiwi");
        lst.add("Mango");
        
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {         
          // lbl.setText(lst.getSelectedItem());
           
           Object[] items=lst.getSelectedObjects();
           lbl.setText("");
           for(int i=0;i<items.length;i++)
           {
               lbl.setText(lbl.getText()+items[i].toString()+" ");
           }           
            }
        });
        
        frm.add(lst);
        frm.add(btn);
        frm.add(lbl);
    }

    
    
    public static void main(String[] args) {
        List_eg lst=new List_eg();
    }
    
}
