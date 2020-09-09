package Belajar_SOLID_04_OOP_Abstraction.Java;

public class Main {
    public static void main(String[] args) {
        // Membuat object dari Triangle
        Shape segitiga = new Triangle(4,3);

        // Membuat object dari circle
        Shape lingkaran = new Circle(10);

        System.out.println("Luas Lingkaran : " + lingkaran.getArea() );
        System.out.println("Luas Segitiga : " + segitiga.getArea() );
    }
}
