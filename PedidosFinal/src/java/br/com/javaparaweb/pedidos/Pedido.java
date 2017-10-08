/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.javaparaweb.pedidos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author eduardo
 */
public class Pedido {

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getCodigoPedido() {
        return codigoPedido;
    }

    public void setCodigoPedido(int codigoPedido) {
        this.codigoPedido = codigoPedido;
    }

    public ArrayList<Itens> getItens() {
        return itens;
    }

    public void setItens(ArrayList<Itens> itens) {
        this.itens = itens;
    }
    
    public Double getTotalItensPedido(){
        Double total = 0.0;
        
        int tamLIsta = itens.size();
        for(int i=0;i < itens.size();i++){
            Itens iten = (Itens) itens.get(i);
            total += iten.getTotalIten();
        }
        
        return total;
    }
    
    private String cliente;
    private String endereco;
    private int codigoPedido; 
    ArrayList<Itens> itens = new ArrayList<>();
    
}
