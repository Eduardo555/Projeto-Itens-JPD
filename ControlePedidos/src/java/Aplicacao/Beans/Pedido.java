/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplicacao.Beans;

import java.util.ArrayList;

/**
 *
 * @author eduardo
 */
public class Pedido {

    private String strCliente;
    private String strEndereco;
    private int codigoPedido = 0;
    
    ArrayList<Item> itens = new ArrayList<> ();
    
    public String getStrCliente() {
        return strCliente;
    }

    public void setStrCliente(String strCliente) {
        this.strCliente = strCliente;
    }

    public String getStrEndereco() {
        return strEndereco;
    }

    public void setStrEndereco(String strEndereco) {
        this.strEndereco = strEndereco;
    }

    public int getCodigoPedido() {
        return codigoPedido;
    }

    public void setCodigoPedido(int codigoPedido) {
        this.codigoPedido = codigoPedido;
    }

    public ArrayList<Item> getItens() {
        return itens;
    }

    public void setItens(ArrayList<Item> itens) {
        this.itens = itens;
    }
    
}
