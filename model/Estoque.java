package model;

public class Estoque {
    private int idEstoque;
    private int idProduto;
    private int quantidade;

    public Estoque() {}

    public Estoque(int idEstoque, int idProduto, int quantidade) {
        this.idEstoque = idEstoque;
        this.idProduto = idProduto;
        this.quantidade = quantidade;
    }

    public int getIdEstoque() {
        return idEstoque;
    }

    public void setIdEstoque(int idEstoque) {
        this.idEstoque = idEstoque;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
