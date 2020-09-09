package Belajar_SOLID_09_OOP_Realization_Atau_Implementation.Java;

public class Main {

    interface ProductService{
        public void getProduct(String id);
        public void calculateProductPrice();
    }

    class ProductServiceImpl implements ProductService{

        @Override
        public void getProduct(String id) {

        }

        @Override
        public void calculateProductPrice() {

        }
    }
}


//    Hubungan ini menandakan bahwa classifier mengimplementasikan kontrak yang
//    telah ditentukan oleh kelas interface. Kelas classifier dapat mengimplementasikan
//    satu atau beberapa kelas interface. Classifier yang mengimplementasikan interface
//    mendukung serangkaian fitur yang dimiliki oleh kelas interface.

//    Pada contoh kode diatas kelas ProductServiceImpl merupakan kelas classifier yang
//    mengimplementasikan kontrak dari kelas interface-nya yaitu kelas ProductService. 