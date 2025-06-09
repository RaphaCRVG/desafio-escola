import models.Aluno;
import models.Professor;
import models.Turma;

public class App {
    public static void main(String[] args) throws Exception {
        Aluno aluno1 = new Aluno("Raphael", "2025001", 20);
        aluno1.setNotaFinal(9.0);
        aluno1.exibirDados();

        Professor professor = new Professor("William","back-end java", 10000.00);
        professor.exibirDetalhes();

        Turma turma = new Turma("FullStack-2025.1", 1, 19);
        turma.exibirTurma();
    }
}
