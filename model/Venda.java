package model;

import java.time.LocalDateTime;

public class Venda {
    private int idVendas;
    private int idFuncionario;
    private int idCliente;
    private int idProduto;
    private float total;
    private LocalDateTime dataVenda;

    public Venda() {
    }

    public Venda(int idVendas, int idFuncionario, int idCliente, int idProduto, float total, LocalDateTime dataVenda) {
        this.idVendas = idVendas;
        this.idFuncionario = idFuncionario;
        this.idCliente = idCliente;
        this.idProduto = idProduto;
        this.total = total;
        this.dataVenda = dataVenda;
    }

    public int getIdVendas() {
        return idVendas;
    }

    public void setIdVendas(int idVendas) {
        this.idVendas = idVendas;
    }

    public int getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public LocalDateTime getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(LocalDateTime dataVenda) {
        this.dataVenda = dataVenda;
    }
}
