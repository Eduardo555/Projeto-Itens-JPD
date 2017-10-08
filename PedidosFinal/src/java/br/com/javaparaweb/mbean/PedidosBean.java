/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.javaparaweb.mbean;

import br.com.javaparaweb.pedidos.Itens;
import br.com.javaparaweb.pedidos.Pedido;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author eduardo
 */
@ManagedBean
@ViewScoped
public class PedidosBean {

    /**
     * Creates a new instance of PedidosBean
     */
    public PedidosBean() {
        

        
    }
    
    ArrayList<Pedido> pedidos = new ArrayList<>();

    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(ArrayList<Pedido> pedidos) {
        this.pedidos = pedidos;
    }
    
    Pedido pedido = new Pedido();
    Itens iten = new Itens();
    
    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Itens getIten() {
        return iten;
    }

    public void setIten(Itens iten) {
        this.iten = iten;
    }
    
    /*Pedidos*/
    
    public void novoPedido(){
        this.pedido = new Pedido();
        this.pedido.setCodigoPedido(this.pedidos.size() + 1);
    }
    
    public void salvarPedido(){
        pedidos.remove(this.pedido);
        pedidos.add(pedido);
        novoPedido();
    }
    
    public void removerPedido(Pedido pedido){
        this.pedidos.remove(pedido);
        novoPedido();
    }
    
    /*Itens*/
    
    public void removerItem(Itens iten){
        this.pedido.getItens().remove(iten);
        novoIten();
    }
    
    public void novoIten(){
        this.iten = new Itens();
        this.iten.setCodigoItem(this.pedido.getItens().size() + 1);
    }
    
    public void salvarIten(){
        pedido.getItens().remove(this.iten);
        pedido.getItens().add(iten);
        novoIten();
    }
    
}
