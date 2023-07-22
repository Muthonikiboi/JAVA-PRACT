import javax.swing.*;
public class gui_interface{
    public static void main(String[] args){
        JFrame myJFrame = new JFrame("My First Window");
        JLabel myJLabel = new JLabel("Hello World");

        myJFrame.getContentPane().add(myJLabel);
        myJFrame.pack();
        myJFrame.setVisible(true);
    }
}