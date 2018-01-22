class Collar {

}
public class Dog2 {
    Collar c;               //Variavel de instância
    String name;            //Variavel de instância
    public static void main(String[] args) {
        Dog2 d;             //Variavel local: d
        d = new Dog2();
        d.go(d);
    }
    void go(Dog2 dog) {     //Variavel local: dog
        c = new Collar();
        dog.setName("Aiko");

    }
    void setName(String dogName) { //Variavel local: dogName
        name = dogName;
    }
    
}
