import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.plaf.basic.BasicRadioButtonUI;
import javax.swing.border.LineBorder;

public class Assignment {

    private JFrame frame;
    private JLabel label1, label2, label3, label4, label5;
    private JLabel studentLabel, courseLabel; // Separate labels for radio button texts
    private JTextField textField1, textField2, textField3, textField4, textField5;
    private JButton button1, button2, button3, button4;
    private JRadioButton radioButton1, radioButton2;
    private ButtonGroup radioGroup;
    private static final Color BUTTON_COLOR = Color.BLACK;
    private static final Color BUTTON_TEXT_COLOR = Color.WHITE;
    private static final Color WINDOW_BACKGROUND_COLOR = new Color(0x6699CC); // #6699CC as an RGB color
    private static final Color RADIO_BUTTON_BACKGROUND_COLOR = new Color(0x6699CC);
    private static final Color RADIO_BUTTON_BORDER_COLOR = new Color(0x041E42);

    
    public Assignment() {
        frame = new JFrame("Course Details");
        frame.setSize(400, 300);
        frame.setLayout(null);

        frame.getContentPane().setBackground(WINDOW_BACKGROUND_COLOR); // Set window background color

        textField5 = new JTextField();
        textField5.setBounds(20, 20, 200, 20);
        frame.add(textField5);

        button4 = new JButton("Search");
        button4.setBounds(250, 20, 100, 20);
        frame.add(button4);

        label1 = new JLabel("Title");
        label1.setBounds(20, 50, 60, 20);
        frame.add(label1);

        textField1 = new JTextField();
        textField1.setBounds(80, 50, 200, 20);
        frame.add(textField1);

        studentLabel = new JLabel("student");
        studentLabel.setBounds(300, 70, 80, 20);
        frame.add(studentLabel);

        courseLabel = new JLabel("courses");
        courseLabel.setBounds(300, 100, 80, 20);
        frame.add(courseLabel);

        radioButton1 = new JRadioButton();
        radioButton1.setBounds(360, 70, 20, 20);
        radioButton1.setUI(new CustomRadioButtonUI());
        radioButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (radioButton1.isSelected()) {
                    updateFrameForStudents();
                }
            }
        });
        frame.add(radioButton1);

        radioButton2 = new JRadioButton();
        radioButton2.setBounds(360, 100, 20, 20);
        radioButton2.setUI(new CustomRadioButtonUI());
        radioButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (radioButton2.isSelected()) {
                    updateFrameForCourses();
                }
            }
        });
        frame.add(radioButton2);

        radioGroup = new ButtonGroup();
        radioGroup.add(radioButton1);
        radioGroup.add(radioButton2);

        label2 = new JLabel("Course ID");
        label2.setBounds(20, 80, 60, 20);
        frame.add(label2);

        textField2 = new JTextField();
        textField2.setBounds(80, 80, 200, 20);
        frame.add(textField2);

        label3 = new JLabel("Duration");
        label3.setBounds(20, 110, 60, 20);
        frame.add(label3);

        textField3 = new JTextField();
        textField3.setBounds(80, 110, 200, 20);
        frame.add(textField3);

        label3 = new JLabel("Department");
        label3.setBounds(20, 140, 60, 20);
        frame.add(label3);

        textField4 = new JTextField();
        textField4.setBounds(80, 140, 200, 20);
        frame.add(textField4);

        button1 = new JButton("save");
        button1.setBounds(50, 180, 80, 20);
        frame.add(button1);

        button2 = new JButton("delete");
        button2.setBounds(150, 180, 80, 20);
        frame.add(button2);

        button3 = new JButton("Reset");
        button3.setBounds(250, 180, 80, 20);
        frame.add(button3);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        // Set button colors and text colors
        button1.setBackground(BUTTON_COLOR);
        button1.setForeground(BUTTON_TEXT_COLOR);
        button2.setBackground(BUTTON_COLOR);
        button2.setForeground(BUTTON_TEXT_COLOR);
        button3.setBackground(BUTTON_COLOR);
        button3.setForeground(BUTTON_TEXT_COLOR);
        button4.setBackground(BUTTON_COLOR);
        button4.setForeground(BUTTON_TEXT_COLOR);
        
    }
    

    private void updateFrameForStudents() {
        frame.setTitle("Student Details");
        label1.setText("Name");
        label2.setText("RegNo");
        label3.setText("Gender");
        label4.setText("Tel");
        courseLabel.setText("courses");
    }

    private void updateFrameForCourses() {
        frame.setTitle("Course Details");
        label1.setText("Title");
        label2.setText("Course ID");
        label3.setText("Duration");
        label4.setText("Department");
        courseLabel.setText("");
    }

    // Custom RadioButtonUI to set background color and border color
    private class CustomRadioButtonUI extends BasicRadioButtonUI {
        @Override
        public void installDefaults(AbstractButton b) {
            super.installDefaults(b);
            b.setBackground(RADIO_BUTTON_BACKGROUND_COLOR);
            b.setBorder(new LineBorder(RADIO_BUTTON_BORDER_COLOR));
        }
    }

    public static void main(String[] args) {
        new Assignment();
    }
}
