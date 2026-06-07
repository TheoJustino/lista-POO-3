package heranca.exercicio_08;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Funcionario", 3000.0);
        Gerente gerente = new Gerente("Gerente", 5000.0);

        System.out.println(funcionario.getNome() + " tem um bônus de: " + funcionario.calcularBonus());
        System.out.println(gerente.getNome() + " tem um bônus de: " + gerente.calcularBonus());
    }
}
