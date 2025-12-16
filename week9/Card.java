class Card extends Payment{
    double tax = 15;
    public Card(double amount){
        this.amount = amount*(1+tax/100);
    }
}