package models;

public class Aluno {

    // Atributos privados
    private String nome;
    private String matricula;
    private int idade;
    private double notaFinal = 0.0; // Inicia com 0.0

    // Construtor
    public Aluno(String nome, String matricula, int idade) {
        this.nome = nome;
        this.matricula = matricula;
        this.idade = idade;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    // Getter somente leitura para notaFinal
    public double getNotaFinal() {
        return notaFinal;
    }

    // Setter com validação para notaFinal
    public void setNotaFinal(double notaFinal) {
        if (notaFinal >= 0.0 && notaFinal <= 10.0) {
            this.notaFinal = notaFinal;
        } else {
            System.out.println("@ ERROR! @  A nota final deve estar entre 0.0 e 10.0!");
        }
    }

    // Método para exibir os dados do aluno
    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Matricula: " + matricula);
        System.out.println("Idade: " + idade);
        System.out.println("Nota final: " + notaFinal);
    }

    
}