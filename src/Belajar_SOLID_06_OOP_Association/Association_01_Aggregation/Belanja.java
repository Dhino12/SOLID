package Belajar_SOLID_06_OOP_Association.Association_01_Aggregation;

// perbedaan dengan bentuk hubungan komposisi
// adalah bentuk hubungan ini tidak terikat, yang berarti setiap class dapat
// berdiri sendiri. contoh meskipun kelas Shop
// dihancurkan, class Seller masih dapat digunakan. Tapi tidak sebaliknya.
class Penjual{
    private String id;
    private String name;
}

class Belanja {

    private String id;
    private String name;
    private Penjual seller;

    public Belanja(String id,String name){
        this.id = id;
        this.name = name;
    }

    public void setSeller(Penjual seller) {
        this.seller = seller;
    }

    public final Penjual getSeller(){
        return seller;
    }
}