
public class BirthDate {
    int year;                 //Variável de instancia 

    public static void main(String[] args) {
        BirthDate bd = new BirthDate();
        bd.showYear();
    }
    public void showYear() {
        System.out.println("The year is " + year);
    }
}
