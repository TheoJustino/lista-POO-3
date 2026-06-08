package interfaces.exercicio_12;

public class Main {
    public static void main(String[] args) {
        Imprimivel nota = new Nota();
        Imprimivel relatorio = new Relatorio();

        nota.imprimir();
        relatorio.imprimir();
    }
}
