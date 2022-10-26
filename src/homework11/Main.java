package homework11;

public class Main {
    public static void main(String[] args) {

        Author levTolstoy= new Author( "Толстой","Лев","Николаевич");
        Author maryaRemark= new Author( "Ремарк","Мария","Эрих");
        Book voynaUMir= new Book("Война и мир",levTolstoy,1869);
        Book tryTovarihsay = new Book("Три товарища",maryaRemark,2011);
        System.out.println("book.name="+levTolstoy.getName() );
        System.out.println("book.publicationYear="+voynaUMir.getPublicationYear() );
        voynaUMir.setPublicationYear(2010);
        System.out.println(voynaUMir.getName()+" "+voynaUMir.getAuthor()+ " " +voynaUMir.getPublicationYear());
        System.out.println("book.PublicationYear= "+voynaUMir.getPublicationYear());

        System.out.println("author="+ maryaRemark.getSurname()+" "+maryaRemark.getName()+" "+maryaRemark.getPatronymic()  );
        tryTovarihsay.setPublicationYear(2013);
        System.out.println("book2.PublicationYear= "+tryTovarihsay.getPublicationYear());
        System.out.println(tryTovarihsay.getName()+" "+tryTovarihsay.getAuthor()+ " " +tryTovarihsay.getPublicationYear());
        System.out.println(tryTovarihsay);
        System.out.println(voynaUMir);








    }

}