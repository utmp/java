
import java.util.Scanner;

public class index{
    public static void main(String[] args) {
        // Student student1 = new Student();
        // student1.name = "John";
        // student1.midTerm = 45;
        // student1.finalExam = 34;
        // student1.printResult();

        // Student student2 = new Student();
        // student2.name = "David";
        // student2.midTerm = 70;
        // student2.finalExam = 90;
        // student2.printResult();


        Worker amele = new Worker();
        amele.name = "Mohammed Ali";
        amele.socialSecurityNumber = 329786;
        amele.salary = 70;
        amele.workingHour = 5;
        amele.displayInfo();
        amele.displaySalary();

        // get info from user
        Scanner input = new Scanner(System.in);
        Worker amele1 = new Worker();
        System.out.println("Enter worker name: ");
        String name = input.nextLine();
        amele1.name = name;
        System.out.println("Enter worker social security number: ");
        int sSNumber = input.nextInt();
        amele1.socialSecurityNumber = sSNumber;
        System.out.println("Enter worker salary: ");
        int salary = input.nextInt();
        amele1.salary = salary;
        System.out.println("Enter worker working hour: ");
        int workingH = input.nextInt();
        amele1.workingHour = workingH;

        amele1.displayInfo();
        amele1.displaySalary();
    }
}