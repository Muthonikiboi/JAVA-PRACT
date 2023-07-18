/*java variables*/
/*local variables */
class localVariables {
    public static void main(String[] args){
        //we declare the loacl variable
        int Age=21;

        System.out.println("My name is Joy.I am "+ Age +" years old");
    }
}


class instanceVariables{
    public String myName;
    public int i;
    public Integer I;
    public instanceVariables() {
        this.myName = "Joy Kiboi";
    }
//thia that follows is the main method
    public static void main(String[] args){
        instanceVariables name =new instanceVariables();

        System.out.println("My name is "+name.myName);
        System.out.println("The value of int is"+name.i);
        System.out.println("The value of integer is "+name.I);
    }
}

class staticVariables{
    public static String myName="Joy Kiboi";

    public static void main(String[] args){
        System.out.println("My realname is "+myName);
    }
}