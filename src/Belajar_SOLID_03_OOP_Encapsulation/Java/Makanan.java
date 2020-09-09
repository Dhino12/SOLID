package Belajar_SOLID_03_OOP_Encapsulation.Java;

public class Makanan {
    public static void main(String[] args) {

        // Memasukan data ke variable
        Restoran data = new Restoran();
        data.setMenu("Ayam Goreng");
        data.setHarga(17000.0);
        data.setSpesial(true);

        // Memanggil Method Get dari Class restoran dan Menampilkannya
        System.out.println("Menu Makanan: " + data.getMenu());
        System.out.println("Harga Makanan: " + data.getHarga());
        System.out.println("Menu Spesial: " + data.getSpesial());
    }
}
