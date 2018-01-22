class Bird {
    {
        System.out.println("b1" );
    } public Bird() { //Construtor Bird
        System.out.print("b2 "); 
        }
    }
class Raptor extends Bird {
    static { //Variavel de inicialização estática
        System.out.print("r1 ");
    } public Raptor() { 
        System.out.print("r2 "); 
    }  //Construtor Raptor
        { System.out.print("r3 ");
    }
    static {  //Variavel de inicialização estática
        System.out.print("r4 ");
    }
}
class Hawk extends Raptor {
    public static void main(String[] args) {
        System.out.print("pre ");
        new Hawk();
        System.out.print("Hawk ");
    }
}
    

