public class main{
    public static void main(String[] args){
        Employee w1 = new Employee(23,"John","Doe");
        Employee w2 = new Employee(23,"Simon","Derrick");
        System.out.printf("%s",Employee.numberOfEmployees);
        Employee.display();
        w1.show();
    }
}