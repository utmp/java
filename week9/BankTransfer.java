class BankTransfer extends Payment{
    double tax = 10;
    public BankTransfer(double amount){
        this.amount = amount*(1+tax/100);
    }
    
}