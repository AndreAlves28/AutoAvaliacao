package autoavaliacao;

public class Shuttle extends Rocket {
    public static void main (String[] args) {
        new Shuttle().go();
    }    
        void go() {
        blastOff();
        //Rocket.blastOff();//A linha
    }
    
    //Método Subescrito
    private void blastOff() {
        System.out.println("sh-bang ");
    }
        
}

