package polimorfismo.exercicio_15;

public class Gato extends Animal {
    public Gato(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom() {
        System.out.println("O " + getNome() + " faz:");
        System.out.println("Miau!");
    }
}
