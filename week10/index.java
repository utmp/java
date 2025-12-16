class Animal{
    public void walk(){
        System.out.printf("walking ... ");
    }
}

class Dog extends Animal{ 
    public void bark(){
        System.out.printf("dog is barking ... ");
    }
    @Override 
    public void walk(){
        System.out.printf("dog is walking ... ");
    }
}

class index{
    public static void main(String[] args) {
        // Dog dog = new Dog();
        
        // implicit upcasting
        // Animal animal = dog;
        // animal.walk();

        //explicit upcasting
        // Animal animal = (Animal) dog;
        // animal.walk();

        // downcasting
        // Animal animal = new Dog();
        // Dog dog = (Dog) animal;
        // dog.bark();
        // dog.walk();

        // more practical
        Animal a = new Dog();
        ((Dog)a).bark();

    }
}