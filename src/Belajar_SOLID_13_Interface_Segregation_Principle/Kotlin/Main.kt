package Belajar_SOLID_13_Interface_Segregation_Principle.Kotlin

interface IPayment{
    fun setPaymentName();
    fun setAmount();
    fun bankID()
    fun virtualBankID();
    fun accountID()
}

interface EWalletProvider{
    fun accountId();
    fun walletProviderId();
}

interface PaymentProvider{
    fun paymentName();
    fun amount();
}

interface BankProvider{
    fun bankID();
    fun virtualAccount();
}

class Gopay: EWalletProvider,PaymentProvider{
    override fun accountId() {
        TODO("Not yet implemented")
    }

    override fun walletProviderId() {
        TODO("Not yet implemented")
    }

    override fun paymentName() {
        TODO("Not yet implemented")
    }

    override fun amount() {
        TODO("Not yet implemented")
    }
}

class Maindiri: BankProvider,PaymentProvider{
    override fun paymentName() {
        TODO("Not yet implemented")
    }

    override fun amount() {
        TODO("Not yet implemented")
    }

    override fun bankID() {
        TODO("Not yet implemented")
    }

    override fun virtualAccount() {
        TODO("Not yet implemented")
    }
}

class BNI : BankProvider,PaymentProvider{
    override fun paymentName() {
        TODO("Not yet implemented")
    }

    override fun amount() {
        TODO("Not yet implemented")
    }

    override fun bankID() {
        TODO("Not yet implemented")
    }

    override fun virtualAccount() {
        TODO("Not yet implemented")
    }
}