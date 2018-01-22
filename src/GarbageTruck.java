
public class GarbageTruck {

    public static void main(String[] args) {
        StringBuffer s1 = new StringBuffer("hello");
        StringBuffer s2 = new StringBuffer("goodbye");
        System.out.println(s1);
        // Neste ponto, o StringBuffer "hello" não está qualificado
        s1 = s2; // Redireciona s1 para referência ao objeto "goodbye"
                 // Agora o StringBuffer "hello" está qualificado para coleta

    }
    
}
