class Alpha {
    static String s = " "; //Variavel de instancia estática
    protected Alpha() {    //método
        s += "alpha ";
    }
}
class SubAlpha extends Alpha {
    private SubAlpha() {
        s += "sub ";
    }
}
public class SubSubAlpha extends Alpha {
    private SubSubAlpha() {
        s += "subsub ";
    }
    public static void main(String[] args) {
        new SubSubAlpha();
        System.out.print(s);
    }
    
}
