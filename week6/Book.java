class Book{
    String title;
    Author author;
    Double price;
    
    public Book(String title, Author author, double price){
        this.title = title;
        this.author = author;
        this.price = price;
    }
    String getTitle(){
        return title;
    }
    Author getAuthor(){
        return author;
    }

    double getPrice(){
        return price;
    }
    @Override
    public String toString(){
        return "Book: " + title + " " + author.toSring() + "price: " + price+"tl";
    }
}