package polimorfismo.exercicio_16;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animais = new ArrayList<>(); 

        animais.add(new Cachorro("Cachorro 1"));
        animais.add(new Gato("Gato 1"));
        animais.add(new Cachorro("Cachorro 2"));
        animais.add(new Gato("Gato 2"));

        for (Animal animal : animais) {
            animal.emitirSom();
        }
    }
}
