import java.util.Date;
public class CheckGC {

    public static void main(String[] args) {
        Runtime rt = Runtime.getRuntime();
        System.out.println("Total JVM memory: " + rt.totalMemory()); //Total
        System.out.println("Before JVM memory: " + rt.freeMemory()); //Dispo
        
        Date d = null;
       // for(int i = 0; i < 10000; i++) {
            d = new Date();
            d = null;
        
        System.out.println("After JVM Memory: " + rt.freeMemory());
        rt.gc(); //uma alternativa a System.gc()
        System.out.println("After GC Memory: " + rt.freeMemory());
        }
    //}
    void Check() {
        int local = 2;
    }
    
}
