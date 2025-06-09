package models;

public class Turma {

    // Atributos privados
    private String codigoTurma;
    private int serie;
    private int quantidadeAlunos = 0;

    // Construtor
    public Turma(String codigoTurma, int serie, int quantidadeAlunos) {
        this.codigoTurma = codigoTurma;
        this.serie = serie;
        setQuantidadeAlunos(quantidadeAlunos);
    }

    // Getters e Setters
    public String getCodigoTurma() {
        return codigoTurma;
    }

    public void setCodigoTurma(String codigoTurma) {
        this.codigoTurma = codigoTurma;
    }

    public int getSerie() {
        return serie;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }

    // Getter e Setter para quantidadeAlunos (Com validação)
    public int getQuantidadeAlunos() {
        return quantidadeAlunos;
    }

    public void setQuantidadeAlunos(int quantidadeAlunos) {
        if (quantidadeAlunos > 0) {
            this.quantidadeAlunos = quantidadeAlunos;
        } else {
            System.out.println("@ ERROR! @ A quantidade de alunos deve ser maior que 0.");
        }
    }

    // Método para exibir detalhes da turma
    public void exibirTurma() {
        System.out.println("Código da turma: " + codigoTurma);
        System.out.println("Série: " + serie);
        System.out.println("Quantidade de alunos: " + quantidadeAlunos);
    }

}
