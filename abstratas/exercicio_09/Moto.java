package abstratas.exercicio_09;

public class Moto extends Veiculo {
    public Moto(String marca) {
        super(marca);
    }

    @Override
    public void buzinar() {
        System.out.println("BI BI!");
    }
}
