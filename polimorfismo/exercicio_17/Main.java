package polimorfismo.exercicio_17;

public class Main {
    public static void main(String[] args) {
        imprimirDocumento(new Nota());
        imprimirDocumento(new Relatorio());
    }

    public static void imprimirDocumento(Imprimivel doc) {
        doc.imprimir();
    }
}
