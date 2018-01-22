
public class Island {
    Island i;

    public static void main(String[] args) {
        Island i2 = new Island();
        Island i3 = new Island();
        Island i4 = new Island();
        
        i2.i = i3; //i2 referencia i3
        i3.i = i4; //i3 referencia i4
        i4.i = i2; //i4 referencia i2
        
        i2 = null;
        i3 = null;
        i4 = null;
        
    Runtime.getRuntime();
        
        
        // realiza tarefas complicadas e que exigem muita memória

    }
    
}
