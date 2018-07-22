package Applets;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class test2 extends Applet {

    public void init() {
        // TODO start asynchronous download of heavy resources
    }
    public void paint(Graphics g)
    {
        setSize(1000, 900);
        //Drawing mickey mouse
        g.drawOval(100, 100,250,250); //Face of mickey mouse
        g.drawOval(160,160,40,40);    //Eye 1
        g.drawOval(240,160,40,40);    //Eye 2
        g.fillOval(170,170,20,20);    //Pupil 1
        g.fillOval(250,170,20,20);    //Pupil 2
        g.drawArc(130, 160, 180, 140, 180, 180); // Mouth
        //g.drawArc(130, 160, 180, 160, 180, 180); // Mouth
        g.drawArc(210, 210, 20, 20, 180, 180); //Nose
        g.drawArc(60, 60, 100,100,0, 270); //Ear 1 
        g.drawArc(280, 60, 100,100,270, 270); //Ear 2
    }
            
    // TODO overwrite start(), stop() and destroy() methods
}
