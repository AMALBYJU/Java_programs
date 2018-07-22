/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.ImageObserver;
import java.text.AttributedCharacterIterator;

public class controls {
Frame frm;
Panel p;
Panel p1,p2;
Label lbl,l;
Checkbox[] chk;
Button btn;
Label res;
Scrollbar s;
    public static void main(String[] args) {
       controls c=new controls();
    }
    public controls()
    {
    
      frm=new Frame("Components");
        frm.setSize(500, 500);
        frm.setLayout(null);
        
        frm.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e)
            {
               System.exit(0);
            }
        } );
       //checkbox();
       //checkboxgroup();
       //canvas();
       scrollbar();
        frm.setVisible(true);
    }
    
    void checkbox()
    {
        p=new Panel();
        lbl=new Label("Select any two language");
        p.add(lbl);
        chk=new Checkbox[3];
        String[] a={"English","Maths","Science"};
        for(int i=0;i<a.length;i++)
        {
            chk[i]=new Checkbox(a[i]);
            p.add(chk[i]);
        }
        
        
        btn=new Button("Click Me");
        res=new Label();
        btn.setSize(460, 50);
        p.setLayout(new FlowLayout());
        p2=new Panel(new FlowLayout());
        p2.add(btn);
        p2.add(res);
        frm.add(p);
        frm.add(p2);        
        frm.setLayout(new GridLayout(2,1));
        btn.addActionListener(new ActionListener() {
           
            @Override
            public void actionPerformed(ActionEvent e) {
                res.setText("");
                
                for(int i=0;i<chk.length;i++)
                {
                    if(chk[i].getState())
                    {
                    res.setText(res.getText()+chk[i].getLabel()+",");
                    }
                }
                res.setSize(res.getPreferredSize());
            }
        });
    }
    
    void checkboxgroup()
    {
    p1=new Panel(new FlowLayout());
    p2=new Panel(new FlowLayout());
    p2.setBackground(Color.red);
    p2.setSize(300,300);
    
    lbl=new Label("Select any option");
    String[] str={"English","Maths","Science"};
    CheckboxGroup sub=new CheckboxGroup();
    chk=new Checkbox[str.length];
    p1.add(lbl);
    for(int i=0;i<str.length;i++)
    {
        chk[i]=new Checkbox(str[i], sub, false);
        p1.add(chk[i]);
    }
    p2.setSize(p2.getPreferredSize());
    Button btn =new Button("Click Me");
    btn.setSize(btn.getMaximumSize());
    res=new Label();
    
    p2.add(btn);
    p2.add(res);
    
    frm.add(p1);
    frm.add(p2);
    frm.setLayout(new GridLayout(3, 1,0,0));
    
    btn.addActionListener(new ActionListener() {
        
        public void actionPerformed(ActionEvent e) {
          res.setText("");
                
                for(int i=0;i<chk.length;i++)
                {
                    if(chk[i].getState())
                    {
                    res.setText("Your preferred language is "+chk[i].getLabel());
                    }
                }
                res.setSize(res.getPreferredSize());
        }
    });
    }
    void canvas()
    {
       frm.add(new MyCanvas());
            
        Canvas c=new Canvas();
    }
   
    class MyCanvas extends Canvas {

        public MyCanvas() {
            setBackground(Color.GRAY);
            setSize(300, 200);
        }

        public void paint(Graphics g) {
            g.setColor(Color.red);
            g.fillOval(75, 75, 150, 75);
        }
    }
    
    void scrollbar()
    {
    s=new Scrollbar(Scrollbar.HORIZONTAL, 15, 10, 0, 300);   
   s.setBackground(Color.red);
   l=new Label("value   ");   
   frm.setLayout(new FlowLayout(FlowLayout.LEFT));  
    frm.add(s);
    frm.add(l);
    s.addAdjustmentListener(new AdjustmentListener() {
        
        public void adjustmentValueChanged(AdjustmentEvent e) {
        l.setText("value="+s.getValue());
        }
    });
    }
}
