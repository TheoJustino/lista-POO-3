package polimorfismo.exercicio_15;

public class Animal {
    private String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    public void emitirSom() {
        System.out.println("...");
    }

    public String getNome() { 
        return nome; 
    }
}
