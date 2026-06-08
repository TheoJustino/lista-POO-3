package abstratas.exercicio_11;

public class ContaCorrente extends Conta {
    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }
}
