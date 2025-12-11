class Employee{
    int age;
    String name;
    String surname;
    public static int numberOfEmployees;

    public Employee(int age,String name,String surname){
        this.age = age;
        this.name = name;
        this.surname = surname;
        numberOfEmployees++;
    }

    static void display(){
        System.out.println("static method working");
    }
    void show(){
        System.out.println("object method is working");
    }
}