class Building {
    Building() {
        System.out.print("b ");
    }
        Building(String name) {
        this();
        System.out.println("bn " + name);
    }
}
public class House extends Building {
    House() {
        System.out.print("h ");
    }   
    House(String name) {
        this();
        System.out.print("hh " + name);
    }
    public static void main(String[] args) {
        new House("x ");
    }
    
}
