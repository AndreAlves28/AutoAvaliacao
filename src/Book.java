
public class Book {
    private String Title;         //Variavel de referência de instância
    public String getTitle() {
        return Title;
    }
    public static void main(String[] args) {
        Book b = new Book();
        System.out.println("The title is " + b.getTitle());

    }
    
}
