

/**
 * Do not modify this file
 * @author accidentalg
 */
public class User {
    // instance variables for a typical user
    private String number;
    private String name;
    private int PIN;
    private double balance;
    
    // method to set a number, checks length and if a number begins 
    public void setNumber(String aNumber){
        this.number = aNumber;
    }
    
    public String getNumber(){
        return this.number;
    }
    
    public void setName(String aName){
        this.name = aName;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setPIN(int aPIN){
        this.PIN = aPIN;
    }
    
    public int getPIN(){
        return this.PIN;
    }
    
    public void setBalance(double aBalance){
        if(aBalance < 0 || aBalance > 200000){
            System.out.println("The balance must be between 0 and 200,000");
        }
        else
            this.balance = aBalance;
    }
    
    public double getBalance(){
        return this.balance;
    }
    
}