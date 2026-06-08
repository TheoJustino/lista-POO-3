package interfaces.exercicio_13;

public class Main {
    public static void main(String[] args) {
        Triatleta triatleta = new Triatleta();
        Peixe peixe = new Peixe();

        triatleta.correr();
        triatleta.nadar();

        peixe.nadar();
    }
}
