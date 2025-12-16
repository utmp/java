class index{
    public static void main(String[] args){
        
        Payment[] payments = new Payment[] {
            new Card(100),
            new BankTransfer(150),
            new Paypal(200)
        };
        for(Payment p: payments){
            System.out.printf("applied tax: %.2f\n",p.amount);
        }
    }
}