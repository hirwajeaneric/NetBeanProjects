
package mastering.gui;

import java.awt.Color;
import javax.swing.*;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JTextField;

public class MasteringGUI extends JFrame {
    
    public JTextField text;
    public JButton regular;
    public JButton custom;
    
    public MasteringGUI(){
        super("My personal work");
        setLayout(new FlowLayout());
        text = new JTextField("Text Here");
        text.setEditable(rootPaneCheckingEnabled);
        text.setText("Enter text here.");
        add(text);
        regular = new JButton("Regular");
        regular.setBackground(Color.red);
        regular.setForeground(Color.white);
        add(regular);
        Icon b = new ImageIcon(getClass().getResource("Corrected Icon.png"));
        Icon x = new ImageIcon(getClass().getResource("close.jpg"));
        custom = new JButton("Custom",b);
        custom.setRolloverIcon(x);
        add(custom);
    }
    public static void main(String[] args){
        MasteringGUI ma = new MasteringGUI();
        ma.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ma.setVisible(true);
        ma.setSize(400,400);
    }
}


