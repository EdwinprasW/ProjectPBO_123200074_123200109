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

/**
 *
 * @author USER
 */
public class Login extends JFrame{
    
    JLabel User, Pass, Title;
    JButton LogBtn, BBtn; 
    final JTextField InUser, InPass;
    
     public Login() {
        Title = new JLabel("Login Admin");
        User = new JLabel("Username : ");
        Pass = new JLabel("Password : ");
        
        LogBtn = new JButton("Login");
        BBtn = new JButton("Back");
        
        InUser = new JTextField();
        InPass = new JTextField();
        
        setLayout(null);
        
        add(Title);
        add(User);
        add(InUser);
        add(Pass);
        add(InPass);
        add(LogBtn);
        add(BBtn);
            
        Title.setBounds(75, 5, 200, 20);
        User.setBounds(25, 50, 200, 20);
        InUser.setBounds(25, 100, 200, 20);
        Pass.setBounds(25, 150, 200, 20);
        InPass.setBounds(25, 200, 200, 20);
        
        LogBtn.setBounds(25, 275, 80, 20);
        BBtn.setBounds(125, 275, 100, 20);
        
        
        setSize(300, 350);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

     public String getInUser() {
        return InUser.getText();
    }

    public String getInPass() {
        return InPass.getText();
    }
    
    
     
}
