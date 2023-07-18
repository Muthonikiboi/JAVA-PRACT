import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static Scanner keyboard = new Scanner(System.in);

    public static User register() {
        User user = new User();
        System.out.println("\nEnter the phone number of a user as 07...: ");
        String aNumber = keyboard.nextLine();
        user.setNumber(aNumber);
        System.out.println("Enter a user name: ");
        user.setName(keyboard.nextLine());
        System.out.println("Enter a 6-digit secret PIN: ");
        user.setPIN(keyboard.nextInt());
        System.out.println("Enter the bank  balance for this user: ");
        user.setBalance(keyboard.nextDouble());
        keyboard.nextLine();
        return user;
    }

    public static void deposit(User user) {
        System.out.println("Enter an amount to deposit: ");
        double amount = keyboard.nextDouble();
        keyboard.nextLine();

        System.out.println("\nEnter your PIN: ");
        int enteredPIN = keyboard.nextInt();
        keyboard.nextLine();

        if (enteredPIN == user.getPIN()) {
            amount += user.getBalance();
            user.setBalance(amount);
            System.out.println("Deposit was successful");
        } else {
            System.out.println("Incorrect PIN. Deposit canceled.");
        }
    }

    public static void sendMoney(ArrayList<User> users) {
        System.out.println("\nEnter the amount to send: ");
        double amount = keyboard.nextDouble();
        keyboard.nextLine();

        System.out.println("Enter the sender's phone number: ");
        String senderNumber = keyboard.next();
        System.out.println("Enter the sender's PIN: ");
        int senderPIN = keyboard.nextInt();
        System.out.println("Enter the receiver's phone number: ");
        String receiverNumber = keyboard.next();

        User sender = null;
        User receiver = null;

        for (User user : users) {
            if (user.getNumber().equals(senderNumber) && user.getPIN() == senderPIN) {
                sender = user;
            } else if (user.getNumber().equals(receiverNumber)) {
                receiver = user;
            }
        }

        if (sender == null || receiver == null) {
            System.out.println("Invalid sender or receiver phone number.");
        } else if (sender.getBalance() < amount) {
            System.out.println("Insufficient balance. Transaction canceled.");
        } else {
            sender.setBalance(sender.getBalance() - amount);
            receiver.setBalance(receiver.getBalance() + amount);
            System.out.println("Money sent successfully.");
        }
    }



    public static void withdraw(User user) {
        System.out.println("\nEnter your PIN: ");
        int enteredPIN = keyboard.nextInt();
        keyboard.nextLine();

        if (enteredPIN == user.getPIN()) {
            System.out.println("Enter the amount to withdraw: ");
            double amount = keyboard.nextDouble();
            keyboard.nextLine();

            if (amount <= user.getBalance()) {
                double newBalance = user.getBalance() - amount;
                user.setBalance(newBalance);
                System.out.println("Withdrawal successful. Your new balance is: " + user.getBalance());
            } else {
                System.out.println("Insufficient balance. Cannot withdraw amount.");
            }
        } else {
            System.out.println("Incorrect PIN. Withdrawal canceled.");
        }
    }


    public static void buyAirtime(User user) {
        System.out.println("Enter the amount of airtime to buy: ");
        double amount = keyboard.nextDouble();
        keyboard.nextLine();

        System.out.println("\nEnter your PIN: ");
        int enteredPIN = keyboard.nextInt();
        keyboard.nextLine();

        if (enteredPIN == user.getPIN()) {
            if (amount > user.getBalance()) {
                System.out.println("Insufficient balance. Airtime purchase canceled.");
            } else {
                double updatedBalance = user.getBalance() - amount;
                user.setBalance(updatedBalance);
                System.out.println("Airtime purchased successfully. Remaining balance: " + user.getBalance());
            }
        } else {
            System.out.println("Incorrect PIN. Airtime purchase canceled.");
        }
    }



    public static void buyGoods(User user) {
        System.out.println("Enter the amount for the goods: ");
        double amount = keyboard.nextDouble();
        keyboard.nextLine();

        System.out.println("\nEnter your PIN: ");
        int enteredPIN = keyboard.nextInt();
        keyboard.nextLine();

        if (enteredPIN == user.getPIN()) {
            if (amount > user.getBalance()) {
                System.out.println("Insufficient balance. Goods purchase canceled.");
            } else {
                double updatedBalance = user.getBalance() - amount;
                user.setBalance(updatedBalance);
                System.out.println("Goods purchased successfully. Remaining balance: " + user.getBalance());
            }
        } else {
            System.out.println("Incorrect PIN. Goods purchase canceled.");
        }
    }



    public static void displayUsers(ArrayList<User> users) {
        if (users.isEmpty()) {
            System.out.println("There are no registered users, please add some to continue");
        } else {
            System.out.println("Phone Number\tName\tPIN\tBalance");
            for (User user : users) {
                System.out.printf("%s\t%s\t%d\t%.2f\n", user.getNumber(),
                        user.getName(), user.getPIN(), user.getBalance());
            }
        }
    }

    public static void displayMenu() {
        System.out.println("\n1. Register");
        System.out.println("2. Deposit");
        System.out.println("3. Send Money");
        System.out.println("4. Withdraw Cash");
        System.out.println("5. Buy Airtime");
        System.out.println("6. Buy Goods");
        System.out.println("7. Display Registered Users");
        System.out.println("8. Quit");
    }

    public static void main(String[] args) {

        ArrayList<User> users = new ArrayList<>();

        System.out.println("Welcome to our Co-operative Banking System\n");

        int choice;

        displayMenu();
        System.out.println("Select a choice (from 1 to 8): ");
        choice = keyboard.nextInt();
        keyboard.nextLine();

        while (choice != 8) {
            switch (choice) {
                case 1:
                    User user = register();
                    users.add(user);
                    break;
                case 2:
                    System.out.println("\nEnter a phone number: ");
                    String userNumber = keyboard.nextLine();

                    boolean found = false;
                    User aUser = null;

                    for (User u : users) {
                        if (u.getNumber().equals(userNumber)) {
                            found = true;
                            aUser = u;
                            break;
                        }
                    }

                    if (found) {
                        deposit(aUser);
                    } else {
                        System.out.printf("\n%s does not exist in the system\n", userNumber);
                    }
                    break;
                case 3:
                    sendMoney(users);
                    break;
                case 4:
                    System.out.println("\nEnter a phone number: ");
                    String phoneNumber = keyboard.nextLine();

                    found = false;
                    aUser = null;

                    for (User u : users) {
                        if (u.getNumber().equals(phoneNumber)) {
                            found = true;
                            aUser = u;
                            break;
                        }
                    }

                    if (found) {
                        withdraw(aUser);
                    } else {
                        System.out.printf("\n%s does not exist in the system\n", phoneNumber);
                    }
                    break;
                case 5:
                    System.out.println("\nEnter a phone number: ");
                    phoneNumber = keyboard.nextLine();

                    found = false;
                    aUser = null;

                    for (User u : users) {
                        if (u.getNumber().equals(phoneNumber)) {
                            found = true;
                            aUser = u;
                            break;
                        }
                    }

                    if (found) {
                        buyAirtime(aUser);
                    } else {
                        System.out.printf("\n%s does not exist in the system\n", phoneNumber);
                    }
                    break;
                case 6:
                    System.out.println("\nEnter a phone number: ");
                    phoneNumber = keyboard.nextLine();

                    found = false;
                    aUser = null;

                    for (User u : users) {
                        if (u.getNumber().equals(phoneNumber)) {
                            found = true;
                            aUser = u;
                            break;
                        }
                    }

                    if (found) {
                        buyGoods(aUser);
                    } else {
                        System.out.printf("\n%s does not exist in the system\n", phoneNumber);
                    }
                    break;
                case 7:
                    displayUsers(users);
                    break;
                default:
                    System.out.println("Invalid choice, please try again");
                    break;
            }

            System.out.println();
            displayMenu();
            System.out.println("Select a choice (from 1 to 8): ");
            choice = keyboard.nextInt();
            keyboard.nextLine();
        }

        System.out.println("\nThank you for choosing Co-operative bank. We , are you\n");
    }
}