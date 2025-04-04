package assignmenttwo;
import javax.swing.*;
import java.awt.*;

public class AssignmentTwoQ1 {
     //Constructor
    AssignmentTwoQ1(){
    JTextField user,pass;
    JButton login , register;
    
    //Frame
    JFrame logFrame = new JFrame("Login Page");
    logFrame.setLayout(null);
    logFrame.setVisible(true);
    logFrame.setBounds(465, 210, 450, 300);
    logFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    //label - username
    JLabel usrname = new JLabel("Username:");
    usrname.setFont(new Font("Ariel", Font.BOLD, 14));
    usrname.setBounds(40, 48, 100, 30);
    logFrame.add(usrname);
    user = new JTextField();
    user.setFont(new Font("Raleway", Font.BOLD, 14));
    user.setBounds(130,50,250,30);
    logFrame.add(user);
    
    //label - password
    JLabel passw = new JLabel("Password:");
    passw.setFont(new Font("Ariel", Font.BOLD, 14));
    passw.setBounds(40, 100, 100, 30);
    logFrame.add(passw);
    pass = new JTextField();
    pass.setFont(new Font("Raleway", Font.BOLD, 14));
    pass.setBounds(130,100,250,30);
    logFrame.add(pass);
    
    //buttons
   login = new JButton("Login");
   login.setBounds(130, 160, 80, 30);
    login.setBackground(Color.white);
    login.setForeground(Color.black);
    logFrame.add(login);
    
    register = new JButton("Register");
   register.setBounds(260, 160, 100, 30);
    register.setBackground(Color.white);
    register.setForeground(Color.black);
    logFrame.add(register);  
    }
    public static void main(String[] args) {
       AssignmentTwoQ1 a = new AssignmentTwoQ1();
    } 
}
