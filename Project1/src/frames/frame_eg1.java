/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;
import java.awt.Frame;
import java.awt.HeadlessException;


public class frame_eg1 extends Frame
{

    public frame_eg1() throws HeadlessException {    
        setSize(500, 500);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        frame_eg1 frm=new frame_eg1();        
    }
    
}
