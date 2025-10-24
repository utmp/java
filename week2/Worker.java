class Worker{
    String name;
    int socialSecurityNumber;
    float salary;
    int workingHour;
    void displayInfo(){
        System.out.printf("Name: %s  Social Security Number: %d",name,socialSecurityNumber);
    }   
    void displaySalary(){
        // 70tl per hour
        System.out.printf("Salary: %.2f",salary*workingHour);
    }
}