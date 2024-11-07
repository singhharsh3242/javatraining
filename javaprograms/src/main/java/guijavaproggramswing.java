import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class guijavaproggramswing {
    public static void main(String[] args) {
        bmivalculator();

//        //to create aframe using swing in java
//        JFrame frame = new JFrame("BMI calculator");
//
//        //CREATE Ui componet to calculate bmi
//        JLabel heightlabel= new JLabel("Enter your height");
//        JLabel weightlabel= new JLabel("Enter your weight");
//        JLabel bmilabel=new JLabel();
//
//
//        JTextField weightfield= new JTextField();
//        JTextField heightfield= new JTextField();
//        // to build the default layout
//
//        JButton bmibutton = new JButton("CALCULATE BMI");
//        //to set the size and position of ui components
//        heightlabel.setBounds(30,30,120,40);
//        heightfield.setBounds(150,30,50,40);
//weightlabel.setBounds(30,80,120,40);
//weightfield.setBounds(150,80,50,40);
//bmibutton.setBounds(30,130,120,40);
//bmilabel.setBounds(170,150,100,40);
//
//
//
//
//        //to attach the label to frame
//        frame.add(heightlabel);
//       frame.add(heightfield);
//frame.add(weightlabel);
//        frame.add(weightfield);
//        frame.add(bmibutton);
//        frame.add(bmilabel);
//
//        bmibutton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                float heightval= Integer.parseInt(heightfield.getText());
//                float weightval=Integer.parseInt(weightfield.getText());
//                float bmival=weightval/(heightval*heightval) *10000;
//
//                if(bmival < 18.5){
//                    bmilabel.setText("You are Underweight.");
//
//                } else if(bmival > 18.5 && bmival < 24.9){
//                    bmilabel.setText("You are normal.");
//                } else if(bmival > 24.9 && bmival < 29.9){
//                    bmilabel.setText("You are Overweight.");
//                } else {
//                    bmilabel.setText("Obesity.");
//                }
//            }
//
//        });
//
//
//
//
//
//
//
//
//
//
//
//
//        frame.setLayout(null);
//        //to set the size for frame
//        frame.setSize(380,250);
//        // to visible the frame on the screen
//        frame.setVisible(true);

    }

    private static void bmivalculator() { //to create aframe using swing in java
        JFrame frame = new JFrame("BMI calculator");

        //CREATE Ui componet to calculate bmi
        JLabel heightlabel= new JLabel("Enter your height");
        JLabel weightlabel= new JLabel("Enter your weight");
        JLabel bmilabel=new JLabel();


        JTextField weightfield= new JTextField();
        JTextField heightfield= new JTextField();
        // to build the default layout

        JButton bmibutton = new JButton("CALCULATE BMI");
        //to set the size and position of ui components
        heightlabel.setBounds(30,30,120,40);
        heightfield.setBounds(150,30,50,40);
        weightlabel.setBounds(30,80,120,40);
        weightfield.setBounds(150,80,50,40);
        bmibutton.setBounds(30,130,120,40);
        bmilabel.setBounds(170,150,100,40);




        //to attach the label to frame
        frame.add(heightlabel);
        frame.add(heightfield);
        frame.add(weightlabel);
        frame.add(weightfield);
        frame.add(bmibutton);
        frame.add(bmilabel);

        bmibutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float heightval= Integer.parseInt(heightfield.getText());
                float weightval=Integer.parseInt(weightfield.getText());
                float bmival=weightval/(heightval*heightval) *10000;

                if(bmival < 18.5){
                    bmilabel.setText("You are Underweight.");

                } else if(bmival > 18.5 && bmival < 24.9){
                    bmilabel.setText("You are normal.");
                } else if(bmival > 24.9 && bmival < 29.9){
                    bmilabel.setText("You are Overweight.");
                } else {
                    bmilabel.setText("Obesity.");
                }
            }

        });












        frame.setLayout(null);
        //to set the size for frame
        frame.setSize(380,250);
        // to visible the frame on the screen
        frame.setVisible(true);

    }
}
//JFRAME to give frame
//JTEXTFEILD to take input user type karega
//JBUTTON to display button click able button
//jlabel label dene ke liye readeable message
//enter your weight jlabel
//enter your height jlabel
//calculate bmi j buttton
//user input weight to display jlabel it is a readable messaege
// user input height to display jlabel  it is a readable messaege
