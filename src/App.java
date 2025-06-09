import models.Aluno;

public class App {
    public static void main(String[] args) throws Exception {
        Aluno aluno = new Aluno("Raphael", "2025001", 20);
        aluno.setNotaFinal(9.0);
        aluno.exibirDados();

    }
}
