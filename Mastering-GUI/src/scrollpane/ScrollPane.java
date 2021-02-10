/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scrollpane;

import javax.swing.*;
import javax.swing.ImageIcon;

/**
 *
 * @author HIRWA Jean Eric
 */
public class ScrollPane extends JFrame {
    public ScrollPane(){
        super("ScrollPane layout");
       ImageIcon img = new ImageIcon("C:\\STUFFS\\Wallpapers\\Backgrounds\\aad247455e14af2e4a3171fc3edd808a.jpg");
       JScrollPane scrl = new JScrollPane(new JLabel(img));
       getContentPane().add(scrl);
       setSize(400,400);
        setVisible(true);
    }
    public static void main(String[] args){
        new ScrollPane();
    
    }
}
