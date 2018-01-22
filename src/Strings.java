
public class Strings {

    public static void main(String[] args) {
       StringBuilder sb = new StringBuilder("abc");
       sb.append("def").reverse().insert(3, "--" );
       System.out.println("sb = " + sb);
    }
    
}
