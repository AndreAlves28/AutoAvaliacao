
public class SpecialOps {

    public static void main(String[] args) {
        String s = " ";
        boolean b1 = true;
        boolean b2 = false;
        
        if ((b2 = false) | (21%5) > 2) s += "x"; // true entra x
        if (b1 || (b2 == true))        s += "y"; //
        if (b2 == true)                s += "z"; // false
        
        System.out.println(s);
    }  
}
