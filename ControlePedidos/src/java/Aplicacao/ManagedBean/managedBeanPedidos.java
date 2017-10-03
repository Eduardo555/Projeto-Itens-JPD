
package Aplicacao.ManagedBean;

import Aplicacao.Beans.Item;
import Aplicacao.Beans.Pedido;
import java.util.ArrayList;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author eduardo
 */
@ManagedBean
@ViewScoped
public class managedBeanPedidos {

    /**
     * Creates a new instance of ManagedBeanPedidos
     */
    
    public managedBeanPedidos() {
    }
    
    ArrayList<Pedido> pedidos = new ArrayList<> ();
    
    private Pedido pedido;
    private Item item;

    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public Item getItem() {
        return item;
    }
    
    /*pedidos*/
    @PostConstruct
    public void novoPedido(){
        this.pedido = new Pedido();
        this.pedido.setCodigoPedido(this.pedidos.size() + 1);
    }
    
    public void salvarPedido(){
        this.pedidos.remove(this.pedido);
        this.pedidos.add(pedido);
        novoPedido();
    }
    
    /*itens*/
    
    public void salvarItens(){
        pedido.getItens().remove(this.item);
        pedido.getItens().add(item);
        novoItem();
    }
    
    
    public void novoItem(){
        this.item = new Item();
        this.item.setCodigoItem(this.pedido.getItens().size() + 1);
    }
    
}
