package abstratas.exercicio_11;

public class Main {
    public static void main(String[] args) {
        Conta contaCorrente = new ContaCorrente();
        Conta contaPoupanca = new ContaPoupanca();

        contaCorrente.depositar(1000.0);
        contaPoupanca.depositar(1000.0);

        System.out.println("Saldo inicial da conta corrente: " + contaCorrente.getSaldo());
        System.out.println("Saldo inicial da conta poupança: " + contaPoupanca.getSaldo());

        contaCorrente.sacar(1100.0);
        contaPoupanca.sacar(1100.0);

        System.out.println("Saldo após saque da conta corrente: " + contaCorrente.getSaldo());
        System.out.println("Saldo após saque da conta poupança: " + contaPoupanca.getSaldo());
    }
}
