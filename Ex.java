class Book{
    int bookid;
    String title;
    String author;
    double price;

Book(){
    bookid=0;
    title="Unknown";
    author="Unknown";
    price=0.0;
}
Book(String title,String author){
     this.title=title;
     this.author=author;
     bookid=0;
     price=0.0;
}
Book(int bookid,String title,String author,double price){
    this.bookid=bookid;
    this.title=title;
    this.author=author;
    this.price=price;
}
void displayBook(){
    System.out.println("Book id="+bookid);
    System.out.println("Book title="+title);
    System.out.println("Book author="+author);
    System.out.println("Book price="+price);
}
}
public class Ex{
    public static void main(String[] args) {
        Book b1=new Book();
        Book b2=new Book("Java","James Gosling");
        Book b3=new Book(101,"Python","Guido Vann Rosum",750);

        b1.displayBook();
        b2.displayBook();
        b3.displayBook();
    }
}