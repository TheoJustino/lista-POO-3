package heranca.exercicio_05;

public class Veiculo {
    private String marca;
    private int ano;

    public Veiculo(String marca, int ano) {
        this.marca = marca;
        this.ano = ano;
    }

    public void ligar() {
        System.out.println("O veículo está ligado.");
    }
}
