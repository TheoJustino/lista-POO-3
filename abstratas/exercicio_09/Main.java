package abstratas.exercicio_09;

public class Main {
    public static void main(String[] args) {
        Veiculo carro = new Veiculo("Toyota");
        Veiculo moto = new Veiculo("Honda");
        // Não funciona porque Veiculo é abstrata e não pode ser instanciada

        System.out.println("O " + carro.getMarca() + " buzina:");
        carro.buzinar();

        System.out.println("A " + moto.getMarca() + " buzina:");
        moto.buzinar();
    }
}
