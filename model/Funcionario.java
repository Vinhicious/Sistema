package model;

public class Funcionario {
    private int idFuncionario;
    private String nome;
    private String cargo;

    public Funcionario() {}

    public Funcionario(int idFuncionario, String nome, String cargo) {
        this.idFuncionario = idFuncionario;
        this.nome = nome;
        this.cargo = cargo;
    }

    public int getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
