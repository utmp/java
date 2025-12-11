class Circle{
    private final double PI = 3.14;
    private double radius;

     Circle(double radius){
        this.radius = radius;
    }
    public double computeArea(){
        return PI * radius * radius;
    }
}

public class index{
    public static void main(String[] args){
        Circle[] circles = {
            new Circle(5),
            new Circle(10),
            new Circle(15)
        };
        for(Circle c: circles){
            System.out.printf("%f\n",c.computeArea());
        }
    }
}

