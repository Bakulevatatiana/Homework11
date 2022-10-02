public class Main {
    public static void main(String[] args) {

        Book book= new Book ("Война и мир","Лев Толстой",1869);

        System.out.println("book.name="+book.getName() );
        System.out.println("book.publicationYear="+book.getPublicationYear() );
        book.setPublicationYear(2010);
        System.out.println("book.PublicationYear= "+book.getPublicationYear());
        Author author= new Author( "Толстой","Лев","Николаевич");
        System.out.println("author="+ author.getSurname()+" "+author.getName()+" "+author.getPatronymic()  );
        Book book1= new Book ("Три товарища","Эрих Мария Ремарк",2011);
        System.out.println(book1.getName()+" "+book1.getAuthor()+ " " +book1.getPublicationYear());
        Book book2= new Book ("1984 ","Джордж Оруэлл",2012);
        System.out.println(book2.getName()+" "+book2.getAuthor()+ " " +book2.getPublicationYear());
        book2.setPublicationYear(2013);
        System.out.println("book2.PublicationYear= "+book2.getPublicationYear());



    }

}