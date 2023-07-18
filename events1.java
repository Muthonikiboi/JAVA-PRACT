import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class events1 {

    private JFrame frame;
    private JLabel label1, label2, label3;
    private JTextField textField1, textField2, textField3;
    private JButton button1, button2;

    public events1() {
        frame = new JFrame("Swing Application");
        frame.setSize(400, 300);
        frame.setLayout(null);

        label1 = new JLabel("Name:");
        label1.setBounds(20, 20, 60, 20);
        frame.add(label1);

        textField1 = new JTextField();
        textField1.setBounds(80, 20, 200, 20);
        frame.add(textField1);

        label2 = new JLabel("Age:");
        label2.setBounds(20, 50, 60, 20);
        frame.add(label2);

        textField2 = new JTextField();
        textField2.setBounds(80, 50, 200, 20);
        frame.add(textField2);

        label3 = new JLabel("Email:");
        label3.setBounds(20, 80, 60, 20);
        frame.add(label3);

        textField3 = new JTextField();
        textField3.setBounds(80, 80, 200, 20);
        frame.add(textField3);

        button1 = new JButton("Submit");
        button1.setBounds(100, 120, 80, 20);
        button1.addActionListener(new ActionListener() {
            @Override 
            public void actionPerformed(ActionEvent e) {
                // Code to execute when the "Submit" button is clicked
                String name = textField1.getText();
                String age = textField2.getText();
                String email = textField3.getText();

                if (name.isEmpty() || age.isEmpty() || email.isEmpty()) {
                JOptionPane.showMessageDialog(frame, "Ensure all details are input", "Error", JOptionPane.ERROR_MESSAGE);
                return;
                }
                // Process the input data
                // For example, display a message dialog with the entered information
                String message = "Name: " + name + "\nAge: " + age + "\nEmail: " + email;
                JOptionPane.showMessageDialog(frame, message, "Submitted Data", JOptionPane.INFORMATION_MESSAGE);
            }
        });
        frame.add(button1);

        button2 = new JButton("Cancel");
        button2.setBounds(200, 120, 80, 20);
        frame.add(button2);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new events1();
    }
}