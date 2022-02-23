package CS390Assignment2.Problem3;

final public class Circle {

    private final double radius;

    public Circle(double radius){
        this.radius = radius;
    }
    public double computeArea(){
        return Math.PI * radius * radius;
    }
}
