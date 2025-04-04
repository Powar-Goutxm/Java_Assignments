package assignmenttwo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AssignmentTwoQ3 {
    
    JTextField nameTF,passTF;
    JButton submitB;
    AssignmentTwoQ3(){
    JFrame tabf = new JFrame("User Input Tabs");
     tabf.setVisible(true);
    tabf.setLayout(null);
    tabf.setBounds(400, 100, 690, 450);
    tabf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    JPanel p1 = new JPanel();
    JLabel l1 = new JLabel("HELLO WELCOME TO MY PAGE");
    l1.setFont(new Font("Raleway",Font.BOLD,16));
    p1.add(l1);
    
    JPanel p2 = new JPanel();
    p2.setLayout(null);
    
    JLabel name = new JLabel("Username:");
    name.setBounds(30, 40, 80, 30);
    name.setFont(new Font("Raleway",Font.BOLD,14));
    p2.add(name);
    nameTF = new JTextField();
    nameTF.setBounds( 130, 40, 200, 30);
    p2.add(nameTF);
    
    JLabel pass = new JLabel("Password:");
    pass.setBounds(30, 90, 80, 30);
    pass.setFont(new Font("Raleway",Font.BOLD,14));
    p2.add(pass);
    passTF = new JTextField();
    passTF.setBounds(130, 90, 200, 30);
    p2.add(passTF);
    
    submitB = new JButton("Submit");
    submitB.setBackground(Color.white);
    submitB.setBounds(30, 300, 100, 40);
    p2.add(submitB);
    
    JLabel messg = new JLabel("fe");
    messg.setBounds(30, 350, 150, 30);
    p2.add(messg);
    
    
    
    
    
    JTabbedPane detailsTB = new JTabbedPane();
    detailsTB.setBounds(0, 0, 672, 408);
    detailsTB.add("ECOMP Engineering Info",p1);
    detailsTB.add("User Input Form",p2);
    tabf.add(detailsTB);
    }
    
    public static void main(String args[]){
        AssignmentTwoQ3 obj = new AssignmentTwoQ3();
    }
}
