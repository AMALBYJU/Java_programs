
package Applets;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class test1 extends Applet {
   
    public void init() {
   
    }   
    
    public void paint(Graphics g)
    {
        setSize(1000, 900);
        g.setColor(Color.red);
        g.drawRect(20, 10, 150, 100);
        g.fillRect(20, 10, 150, 100);
        
        g.drawLine(20, 150, 150, 150);
        g.drawOval(100, 200, 250, 250);
        g.setColor(Color.BLACK);
        g.drawArc(200, 500, 250, 250, 90, 45);
        
        g.setFont(new Font("Arial",3,32));
        g.drawString("Aptech Computer", 10  ,500);  
        
    }
            
}
