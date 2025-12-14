class Library{
    String name;
    Book[] books;
    int count;

    public Library(String name){
        this.name = name;
        this.books = new Book[100];
        this.count = 0;
    }
    void addBook(Book book){
        if(count < books.length){
            books[count] = book;
            count++;
        }
    }
    void displayBooks(){
        if(count == 0){
            System.out.println("Library is empty");
        }else{
        System.out.println("Library: " + name);
        for(int i = 0; i < count; i++){
            System.out.println(books[i].toString());
        }
    }
    }
}