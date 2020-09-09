package Belajar_SOLID_05_OOP_Polymorphism.Java;

class Arithmetic{
    public int add(int valueA , int valueB){
        return valueA + valueB;
    }

    public float add(float valueA , float valueB){
        return valueA + valueB;
    }

    public double add(double valueA , float valueB){
        return valueA + valueB;
    }
}

public class Compile_Time_Polymorphism {
    public static void main(String[] args) {
        Arithmetic hitung = new Arithmetic();
        var hasil = hitung.add(1.2,1.2f);
        System.out.println("Hasil = " + hitung.add(100,1));
    }
}
