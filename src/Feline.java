
public class Feline {

    public static void main(String[] args) {
        long x = 42L;
        long y = 44L;
        System.out.println(" " + 7 + 2 + " ");    //72
        System.out.println(foo() + x + 5 + " ");  //foo425
        System.out.println(x + y + foo());        //86foo

    }
    
    static String foo() {
        return "foo";
    }
    
}
