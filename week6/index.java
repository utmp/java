class index{
    public static void main(String[] args){
        Author auth1 = new Author("Jack London","j@gmail.com");
        Author auth2 = new Author("Franz Kafka","f@gmail.com");

        Book b1 = new Book("Metamorphosis",auth2,230);
        Book b2 = new Book("Before Adam", auth1, 300);

        Library l1 = new Library("Kbu library");
        l1.addBook(b1);
        l1.addBook(b2);
        l1.displayBooks();
    }
}