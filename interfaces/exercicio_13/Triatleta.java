package interfaces.exercicio_13;

public class Triatleta implements Corredor, Nadador {
    @Override
    public void correr() {
        System.out.println("O triatleta está correndo...");
    }

    @Override
    public void nadar() {
        System.out.println("O triatleta está nadando...");
    }
}
