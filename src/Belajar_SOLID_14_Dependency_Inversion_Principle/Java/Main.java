package Belajar_SOLID_14_Dependency_Inversion_Principle.Java;

class PaymentService{
    private Database database;

    public PaymentService(Database database){
        this.database = database;
    }

    void paymentIsValid(){}
    void openDatabase(){}
    void addNewPayment(){}
    void removePaymentById(){}
    void updatePaymentById(){}
}

abstract class Database{
    abstract void insert();
    abstract void update();
    abstract void delete();

}

class MySQLDatabase extends Database{
    @Override
    void insert() {

    }

    @Override
    void update() {

    }

    @Override
    void delete() {

    }
}

class MongoDatabase extends Database{

    @Override
    void insert() {

    }

    @Override
    void update() {

    }

    @Override
    void delete() {

    }
}
