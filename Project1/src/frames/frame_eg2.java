/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
/**
 *
 * @author aptech
 */
public class frame_eg2 {
Frame frm;
Label lbl,res;
TextField txt;
Button btn;

    public frame_eg2() {
        frm=new Frame("efwe");
        frm.setSize(1000, 500);
        frm.setVisible(true);
        frm.setLayout(null);
        frm.addWindowListener(new WindowAdapter() { // Changing the code of inbuilt function in constructor
            public void windowClosing(WindowEvent e) {
            System.exit(0);
            }
        });
        
        
        lbl=new Label("Enter a name");
        txt=new TextField();
        btn=new Button("Click Here");
        res=new Label();
        
        lbl.setBounds(50, 50, 150, 50);
        txt.setBounds(250, 50, 150, 50);
        btn.setBounds(50,200,150,50);        
      res.setBounds(350, 200, 150, 50);
      
      btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                res.setText(txt.getText());
            }
        });
       
        frm.add(lbl);
        frm.add(txt);
        frm.add(btn);
        frm.add(res);
    }

    public static void main(String[] args) {
     frame_eg2 f=new frame_eg2();
    }
    
}
