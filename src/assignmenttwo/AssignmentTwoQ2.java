package assignmenttwo;

import javax.swing.*;
import java.awt.*;

public class AssignmentTwoQ2 {
    JTextField NumOneTF,NumTwoTF,NumThreeTF,resultTF;
    JButton addB,subB;
    
    AssignmentTwoQ2(){
        JFrame calc = new JFrame("Calculator");
        calc.setBounds(465, 100, 500, 550);
        calc.setVisible(true);
        calc.setLayout(null);
        calc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
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
        
        
        
        addB = new JButton("+");
        addB.setFont(new Font("Raleway",Font.BOLD, 15));
        addB.setBounds(50, 400, 80, 40);
        calc.add(addB);
        
        subB = new JButton("-");
        subB.setFont(new Font("Raleway",Font.BOLD, 15));
        subB.setBounds(180, 400, 80, 40);
        calc.add(subB);

    }
    
    public static void main(String args[]){
    AssignmentTwoQ2 obj = new AssignmentTwoQ2();
    }
}
