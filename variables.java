import java.util.Scanner;

import javax.swing.JOptionPane;

class Rectangle {
    int width = 3;
    int height = 4;

    int getArea() {
        return width * height;
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        int area = r.getArea();
        System.out.println("Area: " + area);
    }
}

class Test{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);

        int num1 ,  num2;
        double num3;
        String myName;

        System.out.println("Enter num1 and num2");
        num1 = scan.nextInt();
        num2 = scan.nextInt();

        System.out.println("Enter num3(double):");
        num3 = scan.nextDouble();

        System.out.println("Enter your name:");
        scan.nextLine();
        myName = scan.nextLine();

        //print inputs
        System.out.println("num1:" + num1);
        System.out.println("num2:" + num2);
        System.out.println("num3:" + num3);
        System.out.println("my name is:" + myName);
    }
}


class test{
    public static void main(String[] args){

        String input =JOptionPane.showInputDialog("Enter num1");
        int num1 = Integer.parseInt(input); 

        input = JOptionPane.showInputDialog("Enter num2");

        double num3 =Double.parseDouble(input);

        String myName = JOptionPane.showInputDialog("Enter name:");
        JOptionPane.showMessageDialog(null,"Read Successfully");
    }
}

