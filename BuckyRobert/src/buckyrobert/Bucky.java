/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buckyrobert;
import javax.swing.JOptionPane;
/**
 *
 * @author HIRWA Jean Eric
 */
public class Bucky {
    public static void main (String[] args){
    String fn = JOptionPane.showInputDialog("Enter first number");
    String sn = JOptionPane.showInputDialog("Enter second number");
    
    int num1 = Integer.parseInt(fn);
    int num2 = Integer.parseInt(sn);
    int sum = num1 + num2;
    
    JOptionPane.showMessageDialog(null, "The answer is "+sum, "Sum" , JOptionPane.PLAIN_MESSAGE);  
    }
}
