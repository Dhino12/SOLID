package Belajar_SOLID_13_Interface_Segregation_Principle.Java;

import com.sun.management.VMOption;

interface IPayment{
    void setPaymentName();
    void setAmount();
    void bankId();
    void virtualBankID();
    void accountID();
}

interface EWalletProvider{
    void accountID();
    void walletProviderId();
}

interface PaymentProvider{
    void paymentName();
    void amount();
}

interface BankProvider{
    void bankId();
    void virtualAccount();
}

class GoPay implements EWalletProvider,PaymentProvider{

    @Override
    public void accountID() {

    }

    @Override
    public void walletProviderId() {

    }

    @Override
    public void paymentName() {

    }

    @Override
    public void amount() {

    }
}

class Maindiri implements PaymentProvider,BankProvider{
    @Override
    public void paymentName() {

    }

    @Override
    public void amount() {

    }

    @Override
    public void bankId() {

    }

    @Override
    public void virtualAccount() {

    }
}
//    Dengan memecah interface menjadi beberapa interface kecil,
//    kita dapat dengan mudah menyesuaikan kebutuhan masing-masing class.
//    Kita juga dapat dengan mudah menambahkan class-class baru yang mengimplementasi
//    interface yang sesuai.