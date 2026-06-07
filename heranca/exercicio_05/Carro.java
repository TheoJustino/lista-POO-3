package heranca.exercicio_05;

public class Carro extends Veiculo {
    private int numPortas;

    public Carro(String marca, int ano, int numeroPortas) {
        super(marca, ano);
        this.numPortas = numeroPortas;
    }
}
