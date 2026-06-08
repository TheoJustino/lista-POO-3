package interfaces.exercicio_14;

public class Servico implements Tributavel {
    private double valor;

    public Servico(double valor) {
        this.valor = valor;
    }

    @Override
    public double calcularImposto() {
        return valor * 0.06; 
    }
}
