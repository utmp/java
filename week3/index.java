import Animals.Cat;
import Animals.Dog;
public class index{
    public static void main(String[] args) {
    //     Dog dog1 = new Dog();
    //     dog1.id = 84;
    //     System.out.println(dog1.id);
    //    ConstructorExample();

        Account acc = new Account("John Doe",500);
        System.out.printf("%.2f tl",acc.getBalance());
    }
     private static void ConstructorExample(){
            // Cat cat1 = new Cat();
            // cat1.id = 23;
            // System.out.println(cat1.id);

    Car lambo = new Car(234,"Revuelto",747);
    lambo.showInfo();
}
}