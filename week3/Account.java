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
        System.out.println("Enter passwd to see balance: ");
        int passwd = input.nextInt();
        if(passwd == 1234){
            return balance;
        }else return 0;
    }
}