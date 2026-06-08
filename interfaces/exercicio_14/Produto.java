package interfaces.exercicio_14;

public class Produto implements Tributavel {
    private double preco;

    public Produto(double preco) {
        this.preco = preco;
    }

    @Override
    public double calcularImposto() {
        return preco * 0.12; 
    }

    public double getPreco() {
        return preco;
    }
}
