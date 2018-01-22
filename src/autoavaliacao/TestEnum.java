package autoavaliacao;

enum Animals {
    DOG("Woof"), CAT("Meow"), FISH("Burble");
    String sound;
    Animals(String s) { sound = s; }
}

public class TestEnum {
    static Animals a;
    public static void main(String[] args) {
    
    System.out.println(a.DOG.sound + " " + a.FISH.sound);
    
    }  
}
