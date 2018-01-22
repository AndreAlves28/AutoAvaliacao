
public class Dogg {
    String name;
    Dogg(String s) {
        name = s;
    }
    public static void main(String[] args) {
        Dogg d1 = new Dogg("Boi");
        Dogg d2 = new Dogg("Tyri");
        System.out.println((d1 == d2) + " "); //true
        Dogg d3 = new Dogg("Boi");
        d2 = d1;
        System.out.println((d1 == d2) + " "); //true
        System.out.println((d1 == d3) + " "); //true
    }
    
}
