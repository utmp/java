class Cat extends Animal{
    String color = "white";
    public Cat(String breed,String name,int age){
        this.breed =  breed;
        this.name = name;
        this.age = age;
    }
    void display(){
        System.out.printf("%s %s %s %d\n",breed,name,super.color,age);
    }
    void meow(){
        System.out.println("meoww");
    }
}