class Worker{
    String name;
    int salary;
    public static int counter;
    final static String companyName = "Amazon"; // constant value
    void setSalary(){

    }
    void setName(){
        
    }
    public Worker(String name, int salary, int id){
        this.name = name;
        this.salary = salary;
        this.counter = id;
    }
}