package Belajar_SOLID_04_OOP_Abstraction.Java;

public class Circle extends Shape {

    private float radius;

    public Circle(float radius){
        this.radius = radius;
    }

    @Override
    float getArea() {
        return (float) (Math.PI * radius * radius);
    }
}
