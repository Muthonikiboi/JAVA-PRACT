class classwork {
    public int getSum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        classwork test = new classwork();
        int num1 = 20;
        int num2 = 3;
        int sum = test.getSum(num1, num2);
        System.out.println("Sum is " + sum);
    }

    public void printAge() {
        System.out.println("Age ="+30);
    }

    public static double getAverage(){
        int a=30,b=70,c=3;
        double arg=(a+b+c);
        return arg;
    }

        Test test = new Test();

        test.printAge();

        double average = getAverage();
        System.out.println("Average = " + average);
}

