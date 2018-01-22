
package autoavaliacao;

interface Gadget {
    void doStuff();  
}

abstract class Eletronics {
    void getPower() {
        System.out.print("plug in ");
    }
}
