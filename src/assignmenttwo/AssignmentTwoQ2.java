package assignmenttwo;
/*
Name: Goutam Powar
Roll No: 23EC26
Dept: Se ECOMP
*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AssignmentTwoQ2 implements ActionListener{
    //Global DeclaratioN
    JTextField NumOneTF,NumTwoTF,NumThreeTF,resultTF;
    JLabel errormessg;
    JButton addB,subB;
     int num1,num2,num3;
     int result = 0;
    
    AssignmentTwoQ2(){
        JFrame calc = new JFrame("Calculator");
        calc.setBounds(465, 100, 500, 550);
        calc.setVisible(true);
        calc.setLayout(null);
        calc.getContentPane().setBackground(Color.white);
        calc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Textfields
        JLabel NumOne = new JLabel("Enter 1st Number");
        NumOne.setBounds(50, 50, 110, 30);
        calc.add(NumOne);
        NumOneTF = new JTextField();
        NumOneTF.setBounds(50, 80, 300, 30);
        calc.add(NumOneTF);
        
        JLabel NumTwo = new JLabel("Enter 2nd Number");
        NumTwo.setBounds(50, 130, 110, 30);
        calc.add(NumTwo);
        NumTwoTF = new JTextField();
        NumTwoTF.setBounds(50, 160, 300, 30);
        calc.add(NumTwoTF);
        
        JLabel NumThree = new JLabel("Enter 3rd Number");
        NumThree.setBounds(50, 210, 100, 30);
        calc.add(NumThree);
        NumThreeTF = new JTextField();
        NumThreeTF.setBounds(50, 240, 300, 30);
        calc.add(NumThreeTF);
        
        JLabel res = new JLabel("Result");
        res.setBounds( 50, 290, 60, 30 );
        calc.add(res);
        resultTF = new JTextField();
        resultTF.setBounds( 50, 320, 60, 30 );
        resultTF.setEditable(false);
        calc.add(resultTF);
        
        //Exception handled
        errormessg = new JLabel(""); 
        errormessg.setBounds( 50, 450, 300, 30 );
        errormessg.setFont(new Font("Raleway", Font.BOLD, 17));
        errormessg.setForeground(Color.red);
        calc.add(errormessg);
        
        //Buttons
        addB = new JButton("+");
        addB.setFont(new Font("Raleway",Font.BOLD, 15));
        addB.setBounds(50, 400, 80, 40);
        addB.addActionListener(this);
        calc.add(addB);
        
        subB = new JButton("-");
        subB.setFont(new Font("Raleway",Font.BOLD, 15));
        subB.setBounds(180, 400, 80, 40);
        subB.addActionListener(this);
        calc.add(subB);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        String S1 = NumOneTF.getText();
        String S2 = NumTwoTF.getText();
        String S3 = NumThreeTF.getText();
        
        try{
        num1 = Integer.parseInt(S1);
        num2 = Integer.parseInt(S2);
        num3 = Integer.parseInt(S3);  
            
        }catch(NumberFormatException f){
        errormessg.setText("WARNING: Invalid Input...Enter Again");
        }
        
        if(e.getSource() == addB){
            result = num1 + num2 + num3;
        }else if (e.getSource() == subB){
            result = num1 - num2 - num3;
        }               
        String Res = String.valueOf(result);
        resultTF.setText(Res);
    }
    
    public static void main(String args[]){
    AssignmentTwoQ2 oggyobj = new AssignmentTwoQ2();
    }
}
