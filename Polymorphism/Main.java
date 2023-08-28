package Polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shape =new Shapes();
        Circles circle =new Circles();
        Square square =new Square();
        Shapes circlesa =new Circles();//parent obj = new child(); her i
        shape.area();//same area fun is calling all polygon this is called polymorphism
        circle.area();
        square.area();
        circlesa.area();

    }
    
}
