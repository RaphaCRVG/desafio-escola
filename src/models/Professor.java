package models;

public class Professor {
    
    // Atributos privados
    private String nome;
    private String disciplina;
    private double salario;
    
    // Construtor 
    public Professor(String nome, String disciplina, double salario) {
        this.nome = nome;
        this.disciplina = disciplina;
        setSalario(salario); //Usa o setter para validar
    }
    
    
    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    // Getter e Setter para salário (Com validação)
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario > 0) {
            this.salario = salario;
        } else {
            System.out.println("@ ERROR! @ O salário deve ser maior que R$ 0,00");
        }
    }

    // Método para exibir detalhes
    public void exibirDetalhes() {
        System.out.println("Nome: " + nome);
        System.out.println("Disciplina: " + disciplina);
        System.out.println("Salário: " + salario);
    }



}
