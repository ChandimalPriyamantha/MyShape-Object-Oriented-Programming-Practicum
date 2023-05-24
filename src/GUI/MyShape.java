package GUI;

import Services.imp.Circle;
import Services.imp.ResizableCircle;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyShape extends JFrame{
    private JPanel panel1;
    private JTextField readus;
    private JTextField re_size;
    private JButton button1;
    private JLabel printValue;
    private JLabel PrintValu_2;

    public MyShape() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double value = Double.parseDouble(readus.getText());
                double size = Double.parseDouble(re_size.getText());

                System.out.println(value);

                 Circle myCircle = new Circle();
                 myCircle.setRadius(value);

//                ResizableCircle reSize = new ResizableCircle();
//                myCircle.setRadius(reSize.resize(size));





                printValue.setText(String.valueOf(myCircle.getArea()));
                PrintValu_2.setText(String.valueOf(myCircle.getPerimeter()));



            }
        });
    }

    public static void main(String[] args) {
        MyShape myShape = new MyShape();
        myShape.setContentPane(myShape.panel1);
        myShape.setTitle("My Shape");
        myShape.setSize(300,400);
        myShape.setVisible(true);
        myShape.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
