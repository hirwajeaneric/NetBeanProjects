/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springlayout;

/**
 *
 * @author HIRWA Jean Eric
 */
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Spring;
import javax.swing.SpringLayout;
import javax.swing.SpringLayout.Constraints;
import java.awt.Container;

public class Springlay {
    JFrame frame = new JFrame("Spring Constraints Examples");
    JButton button1 = new JButton("Button 1");
    JButton button2 = new JButton("Button 2");
    JButton button3 = new JButton("Button 3");
    JButton button4 = new JButton("Button 4");
    JButton button5 = new JButton("Button 5");
    SpringLayout spring = new SpringLayout();
    Container c = frame.getContentPane();
    
    //Constructor
    Springlay() {
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
        c.setLayout(spring);
        
        Spring yPadding1 = (Spring.constant(20));
        SpringLayout.Constraints springconstraints1 = new SpringLayout.Constraints();
        springconstraints1.setY(yPadding1);
        c.add(button1,springconstraints1);
        
        Spring yPadding2 =(Spring.constant(100));
        SpringLayout.Constraints springconstraints2 = new SpringLayout.Constraints();
        springconstraints2.setY(yPadding2);
        c.add(button2,springconstraints2);
        
        Spring yPadding3 =(Spring.constant(180));
        SpringLayout.Constraints springconstraints3 = new SpringLayout.Constraints();
        springconstraints3.setY(yPadding3);
        c.add(button3,springconstraints3);
        
        Spring yPadding4 =(Spring.constant(260));
        SpringLayout.Constraints springconstraints4 = new SpringLayout.Constraints();
        springconstraints4.setY(yPadding4);
        c.add(button4,springconstraints4);
        
        Spring yPadding5 =(Spring.constant(340));
        SpringLayout.Constraints springconstraints5 = new SpringLayout.Constraints();
        springconstraints5.setY(yPadding5);
        c.add(button5,springconstraints5);
                                      
    }
    public static void main (String args[]){
        new Springlay();
    }
}
