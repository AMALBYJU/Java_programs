
package frames;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class frame_sum {
Frame frm;
Label l1,l2,l3,l4;          //Label 
TextField txt1,txt2;  // Textarea
Button calsum;

public frame_sum()
{
    frm = new Frame("Calculate sum");
    frm.setSize(500 , 500);
    frm.setVisible(true);
    frm.setLayout(null);
    frm.addWindowListener(new WindowAdapter() {
        public void windowClosing(WindowEvent e) {
        System.exit(0);
        }
});
    
    l1 = new Label("Enter number 1 ");
    l2 = new Label("Enter number 2 ");
    l3 = new Label("Sum is ");
    l4 = new Label("");
    calsum = new Button("Calculate sum");
    txt1 = new TextField();
    txt2 = new TextField();
    
    l1.setBounds(100,100,100,50);
    l2.setBounds(100,150,100,50);
    l3.setBounds(100,200,100,50);
    txt1.setBounds(200,100,100,25);
    txt2.setBounds(200,150,100,25);
    l4.setBounds(200,200,100,25);
    calsum.setBounds(100, 300, 100, 50);
    
    
    calsum.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
    int a=Integer.parseInt(txt1.getText());
    int b=Integer.parseInt(txt2.getText());
    l4.setText(String.valueOf(a+b));
        }
    });
    
    frm.add(l1);
    frm.add(l2);
    frm.add(l3);
    frm.add(l4);
    frm.add(calsum);
    frm.add(txt1);
    frm.add(txt2);
    
}
    public static void main(String[] args) {
        frame_sum frm=new frame_sum();
    }
    
}
