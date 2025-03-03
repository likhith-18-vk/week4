public class Book{
// atributes
private String title;
private String author;
private int yearofpublication;
// constructor
public Book( String title, String author, int yearofpublication ){
this.title= title;
this.author= author;
this. yearofpublication=  yearofpublication;
}
// method to display the details of the book
public void displaydetails(){
System.out.println("the title of the book is:"+ title);
System.out.println("the autor of book is:"+ author);
System.out.println("year of publication:"+ yearofpublication );
}
// Main method to create and display details of two books
public static void main(String[] args){
// Creating two Book objects
Book book1= new Book("Solo levelling", "p.likhith", 2025);
Book book2= new Book("attack on titan", "p.likhith", 2026);

 System.out.println("book 1 Details:");
 book1.displaydetails();

 System.out.println("book 2 Details:");
 book2.displaydetails();
}
}