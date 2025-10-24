public class Car {
    int serialNumber;
    public String model;
    private int power;

   
    Car(int serialNumber,String name,int power){
        this.serialNumber = serialNumber;
        this.model = name;
        this.power = power;
    }
    void showInfo(){
        System.out.printf("Model: %s, power: %d, Serial Number: %d",model,power,serialNumber);
    }

}