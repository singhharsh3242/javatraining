package JDBC;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ExpenceManager {
    public static void main(String[] args) {
        //pass the database the url username password in string
String url ="jdbc:mysql://localhost:3306/expencedb";
String user="root";
String password="";
        try {
            Connection con= DriverManager.getConnection(url,user,password);
           // System.out.println("connected");
            //to insert the data into tabel
            String insert="insert into expencetb(expencetype,expenceamount,incomeamount) value(?,?,?)";
            PreparedStatement ps=con.prepareStatement(insert);
            ps.setString(1,"Travel");
            ps.setInt(2,500);
            ps.setInt(3,100);
            ps.executeUpdate();


            System.out.println("connected");
            //Design the java ui for expence calculator
            JFrame frame=new JFrame(" HARSH EXPENCE ");

            JLabel expencetypelabel=new JLabel(" expence ");
            expencetypelabel.setBounds(225,20,80,50);
            expencetypelabel.setForeground(Color.black);
            frame.add(expencetypelabel);


            JLabel titlelabel=new JLabel(" enter expence type ");
            titlelabel.setBounds(20,70,150,30);
            titlelabel.setForeground(Color.blue);
            frame.add(titlelabel);
JTextField expencetypefield=new JTextField();
expencetypefield.setBounds(160,70,130,30);
            frame.add(expencetypefield);



            JLabel expenceamountlabel=new JLabel(" enter expence amount");
            expenceamountlabel.setBounds(20,130,150,30);
            expenceamountlabel.setForeground(Color.red);
            frame.add(expenceamountlabel);
            JTextField expenceamountfield=new JTextField();
            expenceamountfield.setBounds(160,130,130,30);
            frame.add(expenceamountfield);



            JLabel incomeamountlabel=new JLabel(" enter income amount");
            incomeamountlabel.setBounds(20,190,150,30);
            incomeamountlabel.setForeground(Color.green);
            frame.add(incomeamountlabel);
            JTextField incomeamountfield=new JTextField();
            incomeamountfield.setBounds(160,190,130,30);
            frame.add(incomeamountfield);



            JButton savedbutton=new JButton("SAVE");
            savedbutton.setBounds(160,230,130,30);
            savedbutton.setForeground(Color.orange);
            frame.add(savedbutton);
// o click on the save button
            savedbutton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                }
            });


            frame.setLayout(null);
            frame.setSize(500,400);
            frame.setVisible(true);
            frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private static class setLayout extends JLabel {
        public setLayout(Object o) {
        }
    }
}










