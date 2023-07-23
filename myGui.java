import java.awt.*;
import javax.swing.*;

public class myGui {

    myGui() {
        JFrame myFrame = new JFrame();

        JPanel myPanel = new JPanel();
        myPanel.setBounds(40, 80, 200, 200);
        myPanel.setBackground(Color.gray);

        JButton btn1 = new JButton("Button 1");
        btn1.setBounds(50,100,80, 30);
        btn1.setBackground(Color.pink);
        JButton btn2 = new JButton("Button 2");
        btn2.setBounds(150,100,80, 30);
        btn2.setBackground(Color.blue);

        myPanel.add(btn1);
        myPanel.add(btn2);

        myFrame.getContentPane().add(myPanel);

        myFrame.setSize(300, 300);
        myFrame.setVisible(true);
    }

    public static void main(String[] args) {
        new myGui();
    }
}
