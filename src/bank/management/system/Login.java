package bank.management.system;

import com.toedter.calendar.JDateChooser;
import com.toedter.calendar.JDateChooserBeanInfo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;


public class SignUp extends JFrame implements ActionListener{

    //    Initializing global variables
    JButton next;
    JTextField textName,textFName,textEmail,textAdd,textMs,textCity,textPin,textState,textCountry;
    JDateChooser dateChooser;
    JDateChooserBeanInfo date;
    JRadioButton rBtn1, rBtn2,rBtn3,rBtn4,rBtn5,rBtn6;

    Random ran = new Random();
    long first4 = (ran.nextLong() % 9000L) + 1000L;
    String first = " " + Math.abs(first4);
    SignUp() {
        super("SIGN UP");
        //Bank Icon
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25,10,100,100);
        add(image);
//        SETTING HEADING
        JLabel label1 = new JLabel("APPLICATION FORM NO. "+ first);
        label1.setBounds(160,10,600,40);
        label1.setFont(new Font("Raleway",Font.BOLD,38));
        add(label1);
//        ADDING PAGE NO.
        JLabel label2 = new JLabel("PAGE NO.1");
        label2.setFont(new Font("Raleway",Font.BOLD,28));
        label2.setBounds(400,50,600,30);
        add(label2);
//        ADDING TEXT
        JLabel label3 = new JLabel("PERSONAL DETAILS:");
        label3.setBounds(330,80,600,30);
        label3.setFont(new Font("Raleway",Font.BOLD,28));
        add(label3);
//        NAME COLOUMN
        JLabel labelName = new JLabel("NAME :");
        labelName.setFont(new Font("Arial",Font.BOLD,20));
        labelName.setBounds(100,190,200,30);
        add(labelName);

        textName = new JTextField();
        textName.setFont(new Font("Raleway",Font.BOLD,20));
        textName.setBounds(300,190,400,30);
        add(textName);
//        Father's Name Column
        JLabel labelFName = new JLabel("FATHER'S NAME :");
        labelFName.setFont(new Font("Arial",Font.BOLD,20));
        labelFName.setBounds(100,240,200,30);
        add(labelFName);

        textFName = new JTextField();
        textFName.setFont(new Font("Raleway",Font.BOLD,20));
        textFName.setBounds(300,240,400,30);
        add(textFName);
//        Date of birth
        JLabel DOB= new JLabel("DATE OF BIRTH :");
        DOB.setFont(new Font("Arial",Font.BOLD,20));
        DOB.setBounds(100,290,200,30);
        add(DOB);

        dateChooser= new JDateChooser();
        dateChooser.setFont(new Font("Raleway",Font.BOLD,20));
        dateChooser.setForeground(new Color(105,105,105));
        dateChooser.setBounds(300,290,400,30);
        add(dateChooser);

        //        Gender details
        JLabel labelGender= new JLabel("GENDER :");
        labelGender.setFont(new Font("Arial",Font.BOLD,20));
        labelGender.setBounds(100,340,200,30);
        add(labelGender);

        rBtn1 = new JRadioButton("MALE");
        rBtn1.setBackground(new Color(165,221,238,255));
        rBtn1.setFont(new Font("Raleway",Font.BOLD,20));
        rBtn1.setBounds(300,340,100,30);
        add(rBtn1);

        rBtn2 = new JRadioButton("FEMALE");
        rBtn2.setBackground(new Color(165,221,238,255));
        rBtn2.setFont(new Font("Raleway",Font.BOLD,20));
        rBtn2.setBounds(430,340,120,30);
        add(rBtn2);

        rBtn3 = new JRadioButton("OTHERS");
        rBtn3.setBackground(new Color(165,221,238,255));
        rBtn3.setFont(new Font("Raleway",Font.BOLD,20));
        rBtn3.setBounds(580,340,120,30);
        add(rBtn3);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(rBtn1);
        buttonGroup.add(rBtn2);
        buttonGroup.add(rBtn3);

//        EMAIL ADDRESS

        JLabel labelEmail = new JLabel("EMAIL ADDRESS :");
        labelEmail.setFont(new Font("Arial",Font.BOLD,20));
        labelEmail.setBounds(100,390,200,30);
        add(labelEmail);

        textEmail = new JTextField();
        textEmail.setFont(new Font("Raleway",Font.BOLD,20));
        textEmail.setBounds(300,390,400,30);
        add(textEmail);

//        Married status

        JLabel labelMs = new JLabel("MARRIED STATUS :");
        labelMs.setFont(new Font("Arial",Font.BOLD,20));
        labelMs.setBounds(100,440,200,30);
        add(labelMs);

        rBtn4 = new JRadioButton("YES");
        rBtn4.setBackground(new Color(165,221,238,255));
        rBtn4.setFont(new Font("Raleway",Font.BOLD,20));
        rBtn4.setBounds(300,440,75,30);
        add(rBtn4);
        rBtn5 = new JRadioButton("NO");
        rBtn5.setBackground(new Color(165,221,238,255));
        rBtn5.setFont(new Font("Raleway",Font.BOLD,20));
        rBtn5.setBounds(400,440,65,30);
        add(rBtn5);
        rBtn6 = new JRadioButton("OTHER");
        rBtn6.setBackground(new Color(165,221,238,255));
        rBtn6.setFont(new Font("Raleway",Font.BOLD,20));
        rBtn6.setBounds(500,440,110,30);
        add(rBtn6);
        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(rBtn4);
        buttonGroup1.add(rBtn5);
        buttonGroup1.add(rBtn6);
//        ADDRESS

        JLabel labelAdd = new JLabel("ADDRESS :");
        labelAdd.setFont(new Font("Arial",Font.BOLD,20));
        labelAdd.setBounds(100,490,200,30);
        add(labelAdd);

        textAdd = new JTextField();
        textAdd.setFont(new Font("Raleway",Font.BOLD,20));
        textAdd.setBounds(300,490,400,30);
        add(textAdd);

//        City Details

        JLabel labelCity = new JLabel("CITY :");
        labelCity.setFont(new Font("Arial",Font.BOLD,20));
        labelCity.setBounds(100,540,200,30);
        add(labelCity);

        textCity = new JTextField();
        textCity.setFont(new Font("Raleway",Font.BOLD,20));
        textCity.setBounds(300,540,400,30);
        add(textCity);

//        PIN CODE
        JLabel labelPin = new JLabel("PINCODE :");
        labelPin.setFont(new Font("Arial",Font.BOLD,20));
        labelPin.setBounds(100,590,200,30);
        add(labelPin);

        textPin = new JTextField();
        textPin.setFont(new Font("Raleway",Font.BOLD,20));
        textPin.setBounds(300,590,400,30);
        add(textPin);

//        STATE

        JLabel labelState = new JLabel("STATE :");
        labelState.setFont(new Font("Arial",Font.BOLD,20));
        labelState.setBounds(100,640,200,30);
        add(labelState);

        textState = new JTextField();
        textState.setFont(new Font("Raleway",Font.BOLD,20));
        textState.setBounds(300,640,400,30);
        add(textState);

//        COUNTRY

        JLabel labelCountry = new JLabel("COUNTRY :");
        labelCountry.setFont(new Font("Arial",Font.BOLD,20));
        labelCountry.setBounds(100,690,200,30);
        add(labelCountry);

        textCountry = new JTextField();
        textCountry.setFont(new Font("Raleway",Font.BOLD,20));
        textCountry.setBounds(300,690,400,30);
        add(textCountry);

//        NEXT BUTTON
        next = new JButton("NEXT");
        next.setFont(new Font("Raleway",Font.BOLD,20));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(400,730,100,30);
        next.addActionListener(this);
        add(next);


//        SETTING THE PAGE DETAILS
        getContentPane().setBackground(new Color(	157, 249, 239));
        setLayout(null);
        setSize(850,820);
        setLocation(350,20);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if(e.getSource() == next){
//                do it later
            }
        }catch (Exception E){
            System.out.println("Next Button has not been clicked");
        }
    }

    public static void main(String[] args) {
        new SignUp();
    }
}