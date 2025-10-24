import java.util.Scanner;
class Account{
    private String name;
    private double balance;

    Account(String name, double balance){
        this.name = name;
        this.balance = balance;
    }
    public double getBalance(){
        Scanner input = new Scanner(System.in);
        int attemp = 1;
        for (; attemp <= 3; attemp++){
        System.out.println("Enter passwd to see balance: ");
        int passwd = input.nextInt();
        if(passwd == 1234){
        return balance;
        }
        if(attemp == 3){
        System.out.println("Your account has been blocked, please try again!");
        break;   
        }
           
        }   
        return 0;
        }
    }