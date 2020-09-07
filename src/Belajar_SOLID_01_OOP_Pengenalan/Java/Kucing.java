package Belajar_SOLID_01_OOP_Pengenalan.Java;



public class Kucing {

    // Property ==============
    private String color;
    private Double height;
    private Double lenght;
    private Double weight;

    // ======== Constractor Function ============
    public Kucing(){

    }

    // ======== Constractor Function ============
    public Kucing(String color,Double height,Double lenght,Double weight){
        this.color = color;
        this.height = height;
        this.lenght = lenght;
        this.weight = weight;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public void setLenght(Double lenght) {
        this.lenght = lenght;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getHeight() {
        return height;
    }

    public Double getLenght() {
        return lenght;
    }

    public Double getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public static void main(String[] args) {
        Kucing persian = new Kucing();
        persian.setColor("Putih");
        persian.setHeight(24.0);
        persian.setLenght(46.0);
        persian.setWeight(2.0);

        Kucing anggora = new Kucing("Abu-abu",25.0,41.0,2.4);
        System.out.println("Kucing Persian Warna: " + persian.getColor());
        System.out.println("Kucing Persian Berat: " + persian.getHeight());
        System.out.println("Kucing Persian Suara: " + persian.purring());
    }

    // ====== Function / Behaviour ========
    public String purring() {
        return "Meowww....";
    }

    public Double eat(){
        return height++;
    }
}
