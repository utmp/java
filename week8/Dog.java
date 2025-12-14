class Dog extends Animal{

    public Dog(String breed,String name,int age){
        this.breed = breed;
        this.name = name;
        this.age = age;
    }
    void bark(){
        System.out.println("dog is barking");
    }
    void display(){
        System.err.printf("%s %s %d\n", breed,name,age);
    }
}