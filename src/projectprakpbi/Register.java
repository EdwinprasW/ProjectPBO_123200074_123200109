/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectprakpbi;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author USER
 */
public class Register extends JFrame{
 JLabel User, Pass, Title;
    JButton BBtn, RegBtn; 
    final JTextField InRegU, InRegP;
    
    public Register() {
        Title = new JLabel("Register Admins");
        User = new JLabel("Username : ");
        Pass = new JLabel("Password : ");
        
        BBtn = new JButton("Back");
        RegBtn = new JButton("Register");
        
        InRegU = new JTextField();
        InRegP = new JTextField();
        
        setLayout(null);
        add(Title);
        add(User);
        add(InRegU);
        add(Pass);
        add(InRegP);
        add(BBtn);
        add(RegBtn);
            
       Title.setBounds(75, 5, 200, 20);
        User.setBounds(25, 50, 200, 20);
        InRegU.setBounds(25, 100, 200, 20);
        Pass.setBounds(25, 150, 200, 20);
        InRegP.setBounds(25, 200, 200, 20);
        
        RegBtn.setBounds(25, 275, 100, 20);
        BBtn.setBounds(150, 275, 80, 20);
        
        
        
        setSize(300, 350);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }    
    
     public String getInRegU() {
        return InRegU.getText();
    }

    public String getInRegP() {
        return InRegP.getText();
    }
    
    
}
