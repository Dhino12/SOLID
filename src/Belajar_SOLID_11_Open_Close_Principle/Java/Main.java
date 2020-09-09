package Belajar_SOLID_11_Open_Close_Principle.Java;

class Product {
    // Product Entitas
}

class ShippingOrderService{
    public void chekout(Product product, Shipping shipping){
        int costShipping = shipping.calculate(product);
    }
}

abstract class Shipping{
    abstract public int calculate(Product product);
}

class JNEShipping extends Shipping{
    @Override
    public int calculate(Product product) {
        return 0;
    }
}

class TIKIShipping extends Shipping{
    @Override
    public int calculate(Product product) {
        return 0;
    }
}

// Penambahan class baru tanpa mengubah kode di ShippingOrederService
class SiCepatShipping extends Shipping{
    @Override
    public int calculate(Product product) {
        return 0;
    }
}
//    Ini bisa dibuktikan ketika ingin menambahkan
//    jenis pengiriman baru, kita cukup membuat class baru tanpa
//    harus mengubah kode yang berada di dalam class ShippingOrderService.