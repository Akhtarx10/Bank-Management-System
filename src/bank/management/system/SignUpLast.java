package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class SignUpLast extends JFrame implements ActionListener {

    JRadioButton accT1,accT2,accT3,accT4;
    JCheckBox c1,c2,c3,c4,c5,c6;
    JButton submit,cancel;
    String formNo;
    public SignUpLast(String formNo) {
        super("APPLICATION FORM");
        this.formNo = formNo;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350,5,100,100);
        add(image);

        JLabel labelFormNo = new JLabel("Form No: ");
        labelFormNo.setFont(new Font("Raleway",Font.BOLD,15));
        labelFormNo.setBounds(650,10,200,40);
        add(labelFormNo);

        JLabel labelPg = new JLabel("Page No.3");
        labelPg.setFont(new Font("Raleway",Font.BOLD,22));
        labelPg.setBounds(350,100,200,40);
        add(labelPg);

        JLabel labelAccDet = new JLabel("Account Details");
        labelAccDet.setFont(new Font("Raleway",Font.BOLD,22));
        labelAccDet.setBounds(320,130,200,40);
        add(labelAccDet);

        JLabel labelAccType= new JLabel("Account Type : ");
        labelAccType.setFont(new Font("Raleway",Font.BOLD,18));
        labelAccType.setBounds(100,180,200,30);
        add(labelAccType);

        accT1 = new JRadioButton("Savings Account");
        accT1.setBackground(new Color(143, 245, 208));
        accT1.setFont(new Font("Raleway",Font.BOLD,18));
        accT1.setBounds(120,220,200,30);
        add(accT1);

        accT2 = new JRadioButton("Current Account");
        accT2.setBackground(new Color(143, 245, 208));
        accT2.setFont(new Font("Raleway",Font.BOLD,18));
        accT2.setBounds(400,220,200,30);
        add(accT2);

        accT3 = new JRadioButton("Loan Account");
        accT3.setBackground(new Color(143, 245, 208));
        accT3.setFont(new Font("Raleway",Font.BOLD,18));
        accT3.setBounds(120,250,200,30);
        add(accT3);

        accT4 = new JRadioButton("Fixed Deposit Account");
        accT4.setBackground(new Color(143, 245, 208));
        accT4.setFont(new Font("Raleway",Font.BOLD,18));
        accT4.setBounds(400,250,200,30);
        add(accT4);

        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(accT1);
        buttonGroup1.add(accT2);
        buttonGroup1.add(accT3);
        buttonGroup1.add(accT4);

        JLabel labelCardNo= new JLabel("Card Number : ");
        labelCardNo.setFont(new Font("Raleway",Font.BOLD,18));
        labelCardNo.setBounds(100,300,200,30);
        add(labelCardNo);

        JLabel labelCardText= new JLabel("(Your 16-digit Card Number)");
        labelCardText.setFont(new Font("Raleway",Font.BOLD,12));
        labelCardText.setBounds(100,320,200,30);
        add(labelCardText);

        Random random = new Random();
        int randomNumber = 1000 + random.nextInt(9000);

        JLabel labelCardNum = new JLabel("xxxx-xxxx-xxxx-" + randomNumber);
        labelCardNum.setFont(new Font("Raleway",Font.BOLD,18));
        labelCardNum.setForeground(Color.red);
        labelCardNum.setBounds(300,300,200,30);
        add(labelCardNum);

        JLabel labelCardMsg = new JLabel("(This Will Appear On Your ATM Card/Cheque BooK and Statements)");
        labelCardMsg.setFont(new Font("Raleway",Font.BOLD,12));
        labelCardMsg.setBounds(300,320,400,30);
        add(labelCardMsg);

        JLabel labelPin= new JLabel("Pin Number : ");
        labelPin.setFont(new Font("Raleway",Font.BOLD,18));
        labelPin.setBounds(100,350,200,30);
        add(labelPin);

        JLabel labelPinText= new JLabel("(4-digit Password)");
        labelPinText.setFont(new Font("Raleway",Font.BOLD,12));
        labelPinText.setBounds(100,370,200,30);
        add(labelPinText);

        JLabel labelPinNum = new JLabel("xxxx");
        labelPinNum.setFont(new Font("Raleway",Font.BOLD,18));
        labelPinNum.setForeground(Color.red);
        labelPinNum.setBounds(300,350,200,30);
        add(labelPinNum);

        JLabel labelService = new JLabel("Services Required :");
        labelService.setFont(new Font("Raleway",Font.BOLD,18));
        labelService.setBounds(100,420,200,30);
        add(labelService);

        c1 = new JCheckBox("ATM Card");
        c1.setFont(new Font("Raleway",Font.BOLD,15));
        c1.setBackground(new Color(143, 245, 208));
        c1.setBounds(120,450,150,30);
        add(c1);

        c2 = new JCheckBox("Internet Banking");
        c2.setFont(new Font("Raleway",Font.BOLD,15));
        c2.setBackground(new Color(143, 245, 208));
        c2.setBounds(300,450,150,30);
        add(c2);

        c3 = new JCheckBox("Mobile Banking");
        c3.setFont(new Font("Raleway",Font.BOLD,15));
        c3.setBackground(new Color(143, 245, 208));
        c3.setBounds(120,480,150,30);
        add(c3);

        c4 = new JCheckBox("Email Alerts");
        c4.setFont(new Font("Raleway",Font.BOLD,15));
        c4.setBackground(new Color(143, 245, 208));
        c4.setBounds(300,480,150,30);
        add(c4);

        c5 = new JCheckBox("Cheque Book");
        c5.setFont(new Font("Raleway",Font.BOLD,15));
        c5.setBackground(new Color(143, 245, 208));
        c5.setBounds(120,510,150,30);
        add(c5);


        c6 = new JCheckBox("E-Statement");
        c6.setFont(new Font("Raleway",Font.BOLD,15));
        c6.setBackground(new Color(143, 245, 208));
        c6.setBounds(300,510,150,30);
        add(c6);

        JCheckBox c7 = new JCheckBox("I hereby declare that all the above details are given with my consent and full knowledge");
        c7.setFont(new Font("Raleway",Font.BOLD,15));
        c7.setBackground(new Color(143, 245, 208));
        c7.setBounds(200,570,500,30);
        add(c7);

        submit = new JButton("SUMBIT");
        submit.setBackground(new Color(39, 167, 214));
        submit.setForeground(Color.white);
        submit.setFont(new Font("Arial",Font.BOLD,18));
        submit.setBounds(250,650,150,30);
        submit.addActionListener(this);
        add(submit);

        cancel = new JButton("Cancel");
        cancel.setBackground(new Color(39, 167, 214));
        cancel.setForeground(Color.white);
        cancel.setFont(new Font("Arial",Font.BOLD,18));
        cancel.setBounds(420,650,150,30);
        cancel.addActionListener(this);
        add(cancel);

        setLayout(null);
        setSize(850, 750);
        setLocation(350,50);
        getContentPane().setBackground(new Color(143, 245, 208));
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String atype =null;
        if(accT1.isSelected()){
            atype = "Savings Account";
        } else if (accT2.isSelected()) {
            atype = "Current Account";
        } else if (accT3.isSelected()) {
            atype = "Loan Account";
        } else if (accT4.isSelected()) {
            atype = "Fixed Deposit Account";
        }
        Random ran = new Random();
        long first7 = (ran.nextLong() % 90000000L) + 6910823000000000L;
        String cardNo = "" + Math.abs(first7);

        long first4 =(ran.nextLong() % 9000L) + 1000L ;
        String pinNo = "" + Math.abs(first4);

        String service = "";
        if (c1.isSelected()){
            service = service + c1.getText();
        } else if (c2.isSelected()) {
            service = service + c2.getText();
        } else if (c3.isSelected()) {
            service = service + c3.getText();
        } else if (c4.isSelected()) {
            service = service + c4.getText();
        } else if (c5.isSelected()) {
            service = service + c5.getText();
        } else if (c6.isSelected()) {
            service = service + c6.getText();
        }

        try{
            if(e.getSource() == submit){
                if (atype.equals("")){
                    JOptionPane.showMessageDialog(null,"Fill All the fields");
                }else {
                    DbConnn con = new DbConnn();
                    String query = "INSERT INTO signUpLast VALUES('" + formNo + "','" + atype + "','" + cardNo + "','" + pinNo + "','" + service + "')";
                    String query2 = "INSERT INTO login VALUES('" + formNo + "','" + cardNo + "','" + pinNo + "')";
                    con.statement.executeUpdate(query);
                    con.statement.executeUpdate(query2);
                    JOptionPane.showMessageDialog(null,"Card Number: " + cardNo + "\n Pin Number: " + pinNo);
                    setVisible(false);
                }
            } else if (e.getSource() == cancel) {
                System.exit(0);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new SignUpLast("");
    }
}
