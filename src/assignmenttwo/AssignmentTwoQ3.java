package assignmenttwo;
/*
Name: Goutam Powar
Roll No: 23EC26
Dept: Se ECOMP
*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AssignmentTwoQ3 implements ActionListener {
    //Global Declaration
    JTextField nameTF;
    JPasswordField passTF;
    JButton submitB;
    JLabel messg;
    
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
    nameTF.setBounds( 145, 40, 200, 30);
    p2.add(nameTF);
    
    JLabel pass = new JLabel("Password:");
    pass.setBounds(30, 100, 80, 30);
    pass.setFont(new Font("Raleway",Font.BOLD,14));
    p2.add(pass);
    passTF = new JPasswordField();
    passTF.setBounds(145, 100, 200, 30);
    p2.add(passTF);
    
    JLabel collg = new JLabel("Select College:");
    collg.setBounds(30, 160, 140, 30);
    collg.setFont(new Font("Raleway",Font.BOLD,14));
    p2.add(collg);
    
    String[] Colleges = {"PCCE" , "GEC", "DBCE", "RIT", "BITS","IIT", "NIT"};
    JList<String> collegeList = new JList<>(Colleges);
    collegeList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    
    JScrollPane scrollpane = new JScrollPane(collegeList);
    scrollpane.setBounds(145, 165, 110, 50);
    p2.add(scrollpane);
    
    submitB = new JButton("Submit");
    submitB.setBackground(Color.white);
    submitB.setBounds(40, 280, 100, 40);
    submitB.addActionListener(this);
    p2.add(submitB);
    
    //label for bottom text
    messg = new JLabel("");
    messg.setBounds(40, 330, 250, 30);
    p2.add(messg);
    
    JTabbedPane detailsTB = new JTabbedPane();
    detailsTB.setBounds(0, 0, 672, 408);
    detailsTB.add("ECOMP Engineering Info",p1);
    detailsTB.add("User Input Form",p2);
    tabf.add(detailsTB);
    }
    
    public void actionPerformed(ActionEvent e)
    {
        String S1 = nameTF.getText();
        String S2 = passTF.getText();
        try{
            if(e.getSource() == submitB && (S1.isEmpty() || S2.isEmpty()))
            {
            messg.setText("PLEASE ENTER ALL THE DETAILS...");
            }else{
                messg.setText("FORM SUBMITTED SUCCESFULLY...");
            }      
       }catch(Exception ae){
            ae.printStackTrace();
       }
    
    
    }
    
    public static void main(String args[]){
        AssignmentTwoQ3 oggyobj = new AssignmentTwoQ3();
  }
}
