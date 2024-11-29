// Has-A relation

class Author
{
    String authorName;
    int age;
    String place;

    Author(String name, int age, String splace)
    {
        this.authorName = name;
        this.age = age;
        this.place = splace;
    }
}

class Book
{
    String name;
    int price;
    Author auther;
    Book(String n, int p, Author auther)
    {
        this.name = n;
        this.price = p;
        this.auther = auther;
    }
}

public class Inheritance10 {
    public static void main(String[] args)
    {
       Author auther = new Author("Chriss", 45, "USA");
       Book b = new Book("JAVA", 500, auther);

       System.out.println("Book name "+b.name);
       System.out.println("Book price "+b.price);
       System.out.println("Author name "+b.auther.authorName);
    }
}
