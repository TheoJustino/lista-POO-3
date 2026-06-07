package heranca.exercicio_06;

public class Main {
    public static void main(String[] args) {
        Professor professor = new Professor("Dr. Smith", 45, "Matemática");
        professor.apresentar();

        Aluno aluno = new Aluno("João", 20, "12345");
        aluno.apresentar();
    }
}
