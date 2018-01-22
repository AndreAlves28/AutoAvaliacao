class Foo {
    public void doFooStuff() {
    }
}
class Bar extends Foo {
    public void doBarStuff() {
            
        }
    }
class Test {
    public static void main(String[] args) {
        Foo reallyABar = new Bar();  //Válido, pois Bar é uma subclasse de Foo
        Bar reallyAFoo = new Foo();  //Inválido! Foo não é uma subclasse de bar

    }
    
}
