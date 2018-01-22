
public class Literais {

    public static void main(String[] args) {
        int pre7 = 100000; //pré Java 7 - esperamos que seja um milhão
        int with7 = 1_000_000; //muito mais claro!
        
        //int i1 = _1_000_000;   //Inválido, não pode começar com um "_"
        int i2 = 10_0000_0;   //válido, mas confuso
        
        //float f = 23.45678;   //Erro de compilador, possivel perca de precisão
        float g = 4945405.039494f;  //Ok, possui o sufixo "f"
        
        double d = 5969404.56643D; //Opcional, não é obrigatório nenhum sufixo
                                   //"d", mas está ok, pois o literal é padrão
        double w = 567675.556566;
        
        float f = (float) 32.3;
        float t = 32.3f;
        float h = 32.3F;
        
        byte a = (byte) 128;
        
        System.out.print(a + " ");
        
    }
    
}
