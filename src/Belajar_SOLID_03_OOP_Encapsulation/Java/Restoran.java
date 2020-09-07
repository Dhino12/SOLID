package Belajar_SOLID_03_OOP_Encapsulation.Java;

public class Restoran {
    private String menu;
    private double harga;
    private boolean spesial;

    // === Method Setter (Public) dengan parameter ===
    public void setMenu(String menu) {
        this.menu = menu;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public void setSpesial(boolean spesial) {
        this.spesial = spesial;
    }

    // === Method Getter(Public) dengan parameter ====

    public double getHarga() {
        return harga;
    }

    public String getMenu() {
        return menu;
    }

    public boolean getSpesial(){
        return spesial;
    }
}
