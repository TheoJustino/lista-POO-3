package polimorfismo.exercicio_16;

public class Cachorro extends Animal {
    
    public Cachorro(String nome) {
        super(nome);
    }
    
    @Override
    public void emitirSom() {
        System.out.println("O " + getNome() + " faz:");
        System.out.println("Au au!");
    }
}
