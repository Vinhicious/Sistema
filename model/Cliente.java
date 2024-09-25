package model;

public class Cliente {
    private int idCliente;
    private int telefone;
    private String nome;

    public Cliente() {
    }

    public Cliente(int idCliente, int telefone, String nome) {
        this.idCliente = idCliente;
        this.telefone = telefone;
        this.nome = nome;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
