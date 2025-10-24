
import java.util.Scanner;

public class week3{
    public static void main(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = input.nextLine();
        System.out.println("Enter your age: ");
        int age = input.nextInt();
        System.out.printf("Your age: %d and your name is: %s",age,name);
    }
}