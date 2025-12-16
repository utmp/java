class Paypal extends Payment{
    double tax = 10;
    public Paypal(double amount){
        this.amount = amount*(1+tax/100);
    }
   
}