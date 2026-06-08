package interfaces.exercicio_14;

public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto(3000.00);
        Servico servico = new Servico(1500.00);

        System.out.println("Imposto do produto: " + produto.calcularImposto());
        System.out.println("Imposto do serviço: " + servico.calcularImposto());
    }
}
