import javax.swing.*;//to gain access to the swing packet

public class graphical {
    public static void main(String[]args){
        JFrame frame= new JFrame("JOY KIBOI JAVA WINDOW");//to create a window
        JLabel myJLabel= new JLabel("Hello world");//create a text label

        frame.getContentPane().add(myJLabel);//put the label into the window frame
        frame.pack();//get things compact on the frame & place window on the screen

        frame.setVisible(true);//makes it appear on that frame
    }
}
