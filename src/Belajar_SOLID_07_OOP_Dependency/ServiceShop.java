package Belajar_SOLID_07_OOP_Dependency;

public class ServiceShop {
    public void changeProductPrice(String price,Barang product){
        product.changePrice(price);
    }
}

class Barang{
    private String id;
    private String name;
    private String price;

    public Barang(String id ,String name, String price){
        this.id  = id;
        this.name = name;
        this.price = price;
    }

    public void changePrice(String value){
        this.price = value;
    }
}
