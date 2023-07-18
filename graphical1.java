import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class graphical1{

    public static void main(String[] args) {
        JFrame frame = new JFrame("Swing Application");
        frame.setSize(400, 300);
        frame.setLayout(null);

        JLabel label1 = new JLabel("Name:");
        label1.setBounds(20, 20, 60, 20);
        frame.add(label1);

        JTextField textField1 = new JTextField();
        textField1.setBounds(80, 20, 200, 20);
        frame.add(textField1);

        JLabel label2 = new JLabel("Age:");
        label2.setBounds(20, 50, 60, 20);
        frame.add(label2);

        JTextField textField2 = new JTextField();
        textField2.setBounds(80, 50, 200, 20);
        frame.add(textField2);

        JLabel label3 = new JLabel("Email:");
        label3.setBounds(20, 80, 60, 20);
        frame.add(label3);

        JTextField textField3 = new JTextField();
        textField3.setBounds(80, 80, 200, 20);
        frame.add(textField3);

        JButton button1 = new JButton("Submit");
        button1.setBounds(100, 120, 80, 20);
        frame.add(button1);

        JButton button2 = new JButton("Cancel");
        button2.setBounds(200, 120, 80, 20);
        frame.add(button2);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}