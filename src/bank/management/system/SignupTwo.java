package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;


public class SignupTwo extends JFrame implements ActionListener{
    
    
    JTextField pan,aadhar;
    JButton next;
    JRadioButton syes,sno,eyes,eno;
    JComboBox religion,category,occupation,qualification,income;
    String formno;
    
    SignupTwo(String formno){
        this.formno = formno;
        
        
        setLayout(null);
        
        
       setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
        
       
        
        JLabel additionalDetails = new JLabel("Page 2: Additional Details" );
        additionalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        additionalDetails.setBounds(290, 80, 400, 30);
        add(additionalDetails);
        
        JLabel name = new JLabel("Religion :");
        name.setFont(new Font("Raleway", Font.BOLD, 20));
        name.setBounds(100, 140, 100, 30);
        add(name);
        
        String valReligion[] = {"Select","Hindu", "Muslim", "Sikh", "Others"};
        religion = new JComboBox(valReligion);
         religion.setBounds(300, 140, 400, 30);
         religion.setBackground(Color.WHITE);
        add(religion);
        
       
      
        JLabel fname = new JLabel("Category :");
        fname.setFont(new Font("Raleway", Font.BOLD, 20));
        fname.setBounds(100, 190, 200, 30);
        add(fname);
        
        String valcategory[] = {"Select","General","OBC","SC","ST","Others"};
        category = new JComboBox(valcategory);
        category.setBounds(300, 190, 400, 30);
        category.setBackground(Color.WHITE);
        add(category);
        
        
      
        
        JLabel dob = new JLabel("Income :");
        dob.setFont(new Font("Raleway", Font.BOLD, 20));
        dob.setBounds(100, 240, 200, 30);
        add(dob);
        
        String valincome[] = {"Select","Null","< 1,50,000","<2,50,000","<5,00,000","10,00,000"};
        income = new JComboBox(valincome);
        income.setBounds(300, 240, 400, 30);
        income.setBackground(Color.WHITE);
        add(income);
        
        
        JLabel gender = new JLabel("Educational");
        gender.setFont(new Font("Raleway", Font.BOLD, 20));
        gender.setBounds(100, 290, 200, 30);
        add(gender);
        
       
        
        JLabel email = new JLabel("Qualification :");
        email.setFont(new Font("Raleway", Font.BOLD, 20));
        email.setBounds(100, 315, 200, 30);
        add(email);
        
        String qual[] = {"Select","10th","12th","Degree","PG","Others"};
        qualification = new JComboBox(qual);
        qualification.setBounds(300, 315, 400, 30);
        qualification.setBackground(Color.WHITE);
        add(qualification);
        
        
        
        
        JLabel marital = new JLabel("Ocupation :");
        marital.setFont(new Font("Raleway", Font.BOLD, 20));
        marital.setBounds(100, 390, 200, 30);
        add(marital);
        
        String occ[] = {"Select","Slaried","Self employed","Student","Retired","Others"};
        occupation = new JComboBox(occ);
        occupation.setBounds(300, 390, 400, 30);
        occupation.setBackground(Color.WHITE);
        add(occupation);
        
        
         JLabel adress = new JLabel("PAN number :");
        adress.setFont(new Font("Raleway", Font.BOLD, 20));
        adress.setBounds(100, 440, 200, 30);
        add(adress);
        
        pan = new JTextField();
        pan.setFont(new Font("Raleway", Font.BOLD, 14));
        pan.setBounds(300, 440, 400, 30);
        add(pan);
        
         JLabel city = new JLabel("Aadhar number :");
         city.setFont(new Font("Raleway", Font.BOLD, 20));
        city.setBounds(100, 490, 200, 30);
        add(city);
        
        
        aadhar = new JTextField();
        aadhar.setFont(new Font("Raleway", Font.BOLD, 14));
        aadhar.setBounds(300, 490, 400, 30);
        add(aadhar);
        
        
         JLabel state = new JLabel("Senior citizen :");
        state.setFont(new Font("Raleway", Font.BOLD, 20));
        state.setBounds(100, 540, 200, 30);
        add(state);
        
        
        syes = new JRadioButton("YES");
        syes.setBounds(300,540,60,30);
        syes.setBackground(Color.WHITE);
        add(syes);
        
        sno = new JRadioButton("No");
        sno.setBounds(450, 540, 120, 30);
        sno.setBackground(Color.WHITE);
        add(sno);
        
        
       
        
        
         JLabel pincode = new JLabel("Existing Account :");
        pincode.setFont(new Font("Raleway", Font.BOLD, 20));
        pincode.setBounds(100, 590, 200, 30);
        add(pincode);
        
        
        eyes = new JRadioButton("YES");
        eyes.setBounds(300,590,60,30);
        eyes.setBackground(Color.WHITE);
        add(eyes);
        
        eno = new JRadioButton("No");
        eno.setBounds(450, 590, 120, 30);
        eno.setBackground(Color.WHITE);
        add(eno);
        
        
        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBounds(620, 660, 80, 30);
        next.addActionListener(this);
        add(next);
        
        
        setSize(850, 800);
        setLocation(350, 10);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        String sformno = ""+formno;
        String sreligion = (String) religion.getSelectedItem();
        String scategory =  (String) category.getSelectedItem();
        String sincome = (String) income.getSelectedItem();
        String squalifiation =(String) qualification.getSelectedItem();
        String socupation = (String) occupation.getSelectedItem();
        String seniorcitizen = null;
        if (syes.isSelected()){
         seniorcitizen = "Yes";
        } else if (sno.isSelected()){
         seniorcitizen = "No";
        }
        
        String existingaccount = null;
        if (eyes.isSelected()){
         existingaccount = " Yes";
        } else if (eno.isSelected()){
         existingaccount = "No";
        }
       
        String span = pan.getText();
        String saadhar = aadhar.getText();
        
        
         try{
           
                Conn c  = new Conn();
                String query = "insert into signuptwo values('"+sformno+"','"+sreligion+"','"+scategory+"','"+sincome+"','"+squalifiation+"','"+span+"','"+saadhar+"','"+seniorcitizen+"','"+existingaccount+"')" ;
                c.s.executeUpdate(query);
                
                setVisible(false);
                new SignupThree(formno).setVisible(true);
                
           
         } catch(Exception e ){
           System.out.println(e);
         }
        }
        
       
    
    public static void main(String args[]){
    
        new SignupTwo("");
                
    }
}

