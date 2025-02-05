
package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class SignupThree extends JFrame implements ActionListener{
    JRadioButton r1,r2,r3,r4;
    JCheckBox c1,c2,c3,c4,c5,c6,c7;
    JButton submit,cancel;
    String formno;
    
    SignupThree(String formno){
        
        this.formno = formno;
        setLayout(null);
        JLabel l1 = new JLabel("Page 3: Account details");
        l1.setFont(new Font("Raleway", Font.BOLD, 22));
        l1.setBounds(280,40,400,40);
        add(l1);
        
        JLabel type = new JLabel("Account type");
        type.setFont(new Font("Raleway", Font.BOLD, 22));
        type.setBounds(100,140,200,30);
        add(type);
        
        r1 = new JRadioButton("Savings account");
        r1.setFont(new Font("Raleway", Font.BOLD, 16));
        r1.setBackground(Color.WHITE);
        r1.setBounds(100,180,200,20);
        add(r1);
        
        r2 = new JRadioButton("Fixed deposit account");
        r2.setFont(new Font("Raleway", Font.BOLD, 16));
        r2.setBackground(Color.WHITE);
        r2.setBounds(350,180,250,20);
        add(r2);
        
        r3 = new JRadioButton("Current account");
        r3.setFont(new Font("Raleway", Font.BOLD, 16));
        r3.setBackground(Color.WHITE);
        r3.setBounds(100,220,200,20);
        add(r3);
        
        r4 = new JRadioButton("Recurring account");
        r4.setFont(new Font("Raleway", Font.BOLD, 16));
        r4.setBackground(Color.WHITE);
        r4.setBounds(350,220,250,20);
        add(r4);
        
        ButtonGroup groupaccount = new ButtonGroup();
        groupaccount.add(r1);
        groupaccount.add(r2);
        groupaccount.add(r3);
        groupaccount.add(r4);
        
        JLabel card = new JLabel("Card number");
        card.setFont(new Font("Raleway", Font.BOLD, 22));
        card.setBounds(100,300,200,30);
        add(card);
        
        JLabel number = new JLabel("XXXX-XXXX-XXXX-3427");
        number.setFont(new Font("Raleway", Font.BOLD, 22));
        number.setBounds(330,300,300,30);
        add(number);
        
        JLabel cnumber = new JLabel("Your 16 digit card number");
        cnumber.setFont(new Font("Raleway", Font.BOLD, 12));
        cnumber.setBounds(100,330,300,30);
        add(cnumber);
        
        JLabel pin = new JLabel("PIN");
        pin.setFont(new Font("Raleway", Font.BOLD, 22));
        pin.setBounds(100,370,200,30);
        add(pin);
        
        JLabel pnumber = new JLabel("XXXX");
        pnumber.setFont(new Font("Raleway", Font.BOLD, 22));
        pnumber.setBounds(330,370,300,30);
        add(pnumber);
        
        JLabel service = new JLabel("Services required");
        service.setFont(new Font("Raleway", Font.BOLD, 22));
        service.setBounds(100,450,200,30);
        add(service);
        
        c1 = new JCheckBox("ATM CARD");
        c1.setBackground(Color.WHITE);
        c1.setFont(new Font("RALEWAY",Font.BOLD, 16));
        c1.setBounds(100, 500, 200, 30);
        add(c1);
        
        c2 = new JCheckBox("Internet banking");
        c2.setBackground(Color.WHITE);
        c2.setFont(new Font("RALEWAY",Font.BOLD, 16));
        c2.setBounds(350, 500, 200, 30);
        add(c2);
        
        c3 = new JCheckBox("Mobile banking");
        c3.setBackground(Color.WHITE);
        c3.setFont(new Font("RALEWAY",Font.BOLD, 16));
        c3.setBounds(100, 550, 200, 30);
        add(c3);
        
        c4 = new JCheckBox("Email and SMS alerts");
        c4.setBackground(Color.WHITE);
        c4.setFont(new Font("RALEWAY",Font.BOLD, 16));
        c4.setBounds(350, 550, 200, 30);
        add(c4);
        
        c5 = new JCheckBox("Cheque book");
        c5.setBackground(Color.WHITE);
        c5.setFont(new Font("RALEWAY",Font.BOLD, 16));
        c5.setBounds(100, 600, 200, 30);
        add(c5);
        
        c6 = new JCheckBox("e-statement");
        c6.setBackground(Color.WHITE);
        c6.setFont(new Font("RALEWAY",Font.BOLD, 16));
        c6.setBounds(350, 600, 200, 30);
        add(c6);
        
        c7 = new JCheckBox("I here by declare that the above information is correct");
        c7.setBackground(Color.WHITE);
        c7.setFont(new Font("RALEWAY",Font.BOLD, 12));
        c7.setBounds(100, 680, 600, 30);
        add(c7);
        
        submit = new JButton("submit");
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.setFont(new Font("RALEWAY",Font.BOLD, 14));
        submit.setBounds(250, 720, 100, 30);
        submit.addActionListener(this);
        add(submit);
         
        cancel = new JButton("cancel");
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.setFont(new Font("RALEWAY",Font.BOLD, 14));
        cancel.setBounds(420, 720, 100, 30);
        cancel.addActionListener(this);
        add(cancel);
        
        
        
        setSize(920,920);
        setLocation(350,0);
        setVisible(true);
    
    }
    
    public void actionPerformed(ActionEvent ae){
        String atype = null;
        if(r1.isSelected()){ 
            atype = "Saving Account";
        }
        else if(r2.isSelected()){ 
            atype = "Fixed Deposit Account";
        }
        else if(r3.isSelected()){ 
            atype = "Current Account";
        }else if(r4.isSelected()){ 
            atype = "Recurring Deposit Account";
        }
        
        Random ran = new Random();
        long first7 = (ran.nextLong() % 90000000L) + 5040936000000000L;
        String cardno = "" + Math.abs(first7);
        
        long first3 = (ran.nextLong() % 9000L) + 1000L;
        String pin = "" + Math.abs(first3);
        
        String facility = "";
        if(c1.isSelected()){ 
            facility = facility + " ATM Card";
        }
        if(c2.isSelected()){ 
            facility = facility + " Internet Banking";
        }
        if(c3.isSelected()){ 
            facility = facility + " Mobile Banking";
        }
        if(c4.isSelected()){ 
            facility = facility + " EMAIL Alerts";
        }
        if(c5.isSelected()){ 
            facility = facility + " Cheque Book";
        }
        if(c6.isSelected()){ 
            facility = facility + " E-Statement";
        }
        
        try{
            if(ae.getSource()==submit){
                
                if(atype.equals("")){
                    JOptionPane.showMessageDialog(null, "Fill all the required fields");
                }else{
                    Conn c1 = new Conn();
                    String q1 = "insert into signupthree values('"+formno+"','"+atype+"','"+cardno+"','"+pin+"','"+facility+"')";  
                    String q2 = "insert into login values('"+formno+"','"+cardno+"','"+pin+"')";
                    c1.s.executeUpdate(q1);
                    c1.s.executeUpdate(q2);
                    JOptionPane.showMessageDialog(null, "Card Number: " + cardno + "\n Pin:"+ pin);
                    
                    new Deposit(pin).setVisible(true);
                    setVisible(false);
                }
            
            }else if(ae.getSource()==cancel){
                System.exit(0);
                
                new  Login().setVisible(true);
            }
            
            
        }catch(Exception e){
            System.out.println(e);
        }
        
    }
    public static void main(String args[]){
    
        new SignupThree("");
    
    }
}
