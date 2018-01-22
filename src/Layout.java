
public class Layout {                      //Classe
    static int s = 343;                    //Variavel estática
    int x;                                 //Variavel de inicialização
    { x = 7; int x2 = 5; }                 //bloco de inicialização
    Layout() { x += 8; int x3 = 6; }       //construtor
    
    void doStuff() {                       //Método
    int y = 0;                             //váriavel local
    for(int z = 0; z < 4; z++) {           //bloco de código for
        y += z + x;
        }
    }
}
