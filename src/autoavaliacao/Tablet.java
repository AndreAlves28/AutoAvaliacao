package autoavaliacao;

public class Tablet extends Eletronics implements Gadget {
     public void doStuff() {
            System.out.print("Show book ");
    }
    public static void main(String[] args) {
       new Tablet().getPower();
       new Tablet().doStuff();

    }
    
}
