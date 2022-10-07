package homework11;

public class Author {
    private String surname ;
    private String  name;
    private String patronymic;
    public Author (String surname ,String name,String patronymic){
        this.name=name;
        this.surname =surname;
        this.patronymic=patronymic;
}public String getName(){return this.name;}
    public String getSurname(){return this.surname;}
    public String getPatronymic(){return this.patronymic;}
}
