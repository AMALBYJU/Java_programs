//Adding 5 buttons to the frame
package frames;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.BoxLayout;

public class layout_eg {

    Button b1, b2, b3, b4, b5;
    Frame frm;

    public layout_eg() {
        //flow_layout();
       // box_layout();
       //border_layout();
       grid_layout();
    }

    public void flow_layout() {
        frm = new Frame("Buttons");
        frm.setSize(430, 150);
        frm.setVisible(true);
        //frm.setLayout(new FlowLayout(FlowLayout.LEFT));
        //frm.setLayout(new FlowLayout(FlowLayout.RIGHT));
        //frm.setLayout(new FlowLayout(FlowLayout.CENTER));
        //frm.setLayout(new FlowLayout(FlowLayout.TRAILING));
        frm.setLayout(new FlowLayout(FlowLayout.LEADING));

        frm.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        b1 = new Button("1");        // Creating buttons
        b2 = new Button("2");
        b3 = new Button("3");
        b4 = new Button("4");
        b5 = new Button("5");      

        frm.add(b1); //Adding buttons
        frm.add(b2);
        frm.add(b3);
        frm.add(b4);
        frm.add(b5);
    }

    public void box_layout()
    {
        frm = new Frame("Buttons");
        frm.setSize(430, 150);
        frm.setVisible(true);        

        frm.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        b1 = new Button("1");        // Creating buttons
        b2 = new Button("2");
        b3 = new Button("3");
        b4 = new Button("4");
        b5 = new Button("5");
       
        frm.add(b1); //Adding buttons
        frm.add(b2);
        frm.add(b3);
        frm.add(b4);
        frm.add(b5);
        
        //frm.setLayout(new BoxLayout(frm, BoxLayout.X_AXIS));
        //frm.setLayout(new BoxLayout(frm, BoxLayout.Y_AXIS));
        //frm.setLayout(new BoxLayout(frm, BoxLayout.LINE_AXIS));
        frm.setLayout(new BoxLayout(frm, BoxLayout.PAGE_AXIS));
    }
    
    public void border_layout()
    {
        frm = new Frame("Buttons");
        frm.setSize(500,500);
        frm.setVisible(true);        

        frm.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        b1 = new Button("1");        // Creating buttons
        b2 = new Button("2");
        b3 = new Button("3");
        b4 = new Button("4");
        b5 = new Button("5");
       
        frm.add(b1,BorderLayout.WEST); //Adding buttons
        frm.add(b2,BorderLayout.EAST);
        frm.add(b3,BorderLayout.EAST);        
        frm.add(b4,BorderLayout.NORTH);
        frm.add(b5,BorderLayout.SOUTH);
        
        frm.setLayout(new BorderLayout());
    }
    
    public void grid_layout()
    {
        frm = new Frame("Buttons");
        frm.setSize(500,500);
        frm.setVisible(true);        

        frm.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        b1 = new Button("1");        // Creating buttons
        b2 = new Button("2");
        b3 = new Button("3");
        b4 = new Button("4");
        b5 = new Button("5");
       
        frm.add(b1); //Adding buttons
        frm.add(b2);
        frm.add(b3);
        frm.add(b4);
        frm.add(b5);
        
        frm.setLayout(new GridLayout(3,3,10,10));
    }
    public static void main(String[] args) {
        layout_eg f = new layout_eg();
    }
}
