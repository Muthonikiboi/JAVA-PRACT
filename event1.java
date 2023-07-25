import javax.swing.*;
import java.awt.event.*;

public class event1 implements ActionListener{
    public static void main(String[]args){
        JFrame myframe= new JFrame();
        JButton button1= new JButton("Click Me!");

        button1.setActionCommand("push");

        button1.addActionListener(new event1());

        myframe.getContentPane().add(button1);
        myframe.setSize(400,400);
        myframe.setVisible(true);
    }

    public void actionPerformed(ActionEvent click){
        if (click.getActionCommand().equals("push")){
            System.out.println("You clicked me");
        }
    }
}
