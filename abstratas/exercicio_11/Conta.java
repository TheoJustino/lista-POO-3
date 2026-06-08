package abstratas.exercicio_11;

public abstract class Conta {
    protected double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public abstract void sacar(double valor); 
}
