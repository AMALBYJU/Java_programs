/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;

import java.awt.*;
import java.awt.event.*;

public class card_layout {
   private Frame mainFrame;
   private Panel controlPanel;
   Panel panel;
   CardLayout layout ;
   
   public card_layout(){
      prepareGUI();
   }

   public static void main(String[] args){
      card_layout  awtLayoutDemo = new card_layout();  
      awtLayoutDemo.showCardLayoutDemo();       
   }
      
   private void prepareGUI(){
      mainFrame = new Frame("Java AWT Examples");
      mainFrame.setSize(400,400);
      mainFrame.setLayout(new GridLayout(3, 1));
      mainFrame.addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent windowEvent){
            System.exit(0);
         }        
      });         
     
      controlPanel = new Panel();
      controlPanel.setLayout(new FlowLayout());
      controlPanel.setBackground(Color.red);
      
      mainFrame.add(controlPanel);      
      mainFrame.setVisible(true);  
   }

   private void showCardLayoutDemo(){
      panel = new Panel();
      panel.setBackground(Color.CYAN);
      //panel.setSize(300,300);

      layout = new CardLayout();
      layout.setHgap(10);
      layout.setVgap(10);
      panel.setLayout(layout);           

      //button panel
      Panel buttonPanel = new Panel(new FlowLayout());      
      Button btn=new Button("OK");
      Button btn2=new Button("Cancel");    
      buttonPanel.setBackground(Color.BLUE);
      
//      buttonPanel.add(new Button("OK"));
//      buttonPanel.add(new Button("Cancel"));    
        
        buttonPanel.add(btn);
        buttonPanel.add(btn2);
        
      //textbox panel
      Panel textBoxPanel = new Panel(new FlowLayout());
      textBoxPanel.add(new Label("Name:"));
      textBoxPanel.add(new TextField(20));
      textBoxPanel.setBackground(Color.GREEN);

      panel.add("Button", buttonPanel);
      panel.add("Text", textBoxPanel);

      Choice choice = new Choice();
      choice.add("Button");
      choice.add("Text");

      choice.addItemListener(new ItemListener() {
         public void itemStateChanged(ItemEvent e) {         
            layout.show(panel, (String)e.getItem());
         }
      });
      controlPanel.add(choice);
      controlPanel.add(panel);
      mainFrame.setVisible(true);  
   }
}
