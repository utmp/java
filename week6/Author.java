class Author{
    String name;
    String email;

    public Author(String name,String email){
        this.name = name;
        this.email = email;
    }

    String getName(){
        return name;
    }

    String getEmail(){
        return email;
    }
    public String toSring(){
        return "Author: " + name + " " + "email: " + email + " ";
    }
}