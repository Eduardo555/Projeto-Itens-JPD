/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplicacao.Beans;

/**
 *
 * @author eduardo
 */
public class Item {
    
    private int Quantidade;
    private int codigoItem = 0;
    private String strProduto;
    private Double Preco;
    
    public int getQuantidade() {
        return Quantidade;
    }

    public void setQuantidade(int Quantidade) {
        this.Quantidade = Quantidade;
    }

    public int getCodigoItem() {
        return codigoItem;
    }

    public void setCodigoItem(int codigoItem) {
        this.codigoItem = codigoItem;
    }

    public String getStrProduto() {
        return strProduto;
    }

    public void setStrProduto(String strProduto) {
        this.strProduto = strProduto;
    }

    public Double getPreco() {
        return Preco;
    }

    public void setPreco(Double Preco) {
        this.Preco = Preco;
    }
    
}
