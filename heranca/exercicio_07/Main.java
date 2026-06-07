package heranca.exercicio_07;

public class Main {
    public static void main(String[] args) {
        Animal cachorro = new Cachorro("Cachorro");
        Animal gato = new Gato("Gato");

        cachorro.emitirSom();
        gato.emitirSom();
    }
}
