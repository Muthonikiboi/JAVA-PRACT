import java.util.Date;
public class PrimitReferVar{
    public static void main(String[] args){
        byte age =30;

        int x=10;

        Date now =new Date();

        System.out.println(now);

        //to console x
        System.out.println("x="+x);
        
        System.out.println(age);

        //test the value of X 
        if (x>5){
            String result="X is greater than 5";
            System.out.println(result);
        }    }
}  