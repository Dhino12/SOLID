package Belajar_SOLID_06_OOP_Association.Association_02_Composition;

public class Belanja{
    public static void main(String[] args) {
        Pengguna user = new Pengguna("123","Cocoa",new Alamat("456","Surabaya"));
    }
}

class Pengguna{
    private String id;
    private String nama;
    private Alamat alamat;

    public Pengguna(String id,String nama ,Alamat alamat){
        this.id = id;
        this.alamat = alamat;
        this.nama = nama;
    }
}

class Alamat{
    private String id;
    private String location;

    public Alamat(String id ,String location){
        this.id = id;
        this.location = location;
    }
}
//    Perhatikan kode pada fungsi main() di atas, ketika kita membuat sebuah objek dari class User
//    maka kita juga membuat sebuah objek baru dari class Address. Apabila objek user kita hapus,
//    maka objek class address akan terhapus juga. Begitulah ilustrasi dari bentuk hubungan komposisi.