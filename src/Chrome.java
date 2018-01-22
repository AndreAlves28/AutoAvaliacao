class X {
    void do1() {
        System.out.println("Método do1");
    }
}
class Y extends X {
    void do2() {
        System.out.println("Método do2");
     }
}
class Chrome {
    public static void main(String[] args) {
        X x1 = new X();
        X x2 = new Y();
        Y y1 = new Y();

        //Y)x2.do2();
        ((Y)x2).do2();
        
    }
    
}
