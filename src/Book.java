public class Book {
    String name;
    String author;
    int publicationYear;
    public Book (String name,String author,int publicationYear){
        this.name=name;
        this.author=author;
        this.publicationYear=publicationYear;

}
    public String getName(){return this.name;}
    public String getAuthor (){return this.author;}
    public int getPublicationYear(){return this.publicationYear;}
    public void setPublicationYear(int publicationYear){
        this.publicationYear=publicationYear;
    }
}
