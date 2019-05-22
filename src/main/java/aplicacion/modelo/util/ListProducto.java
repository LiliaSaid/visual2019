/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.util;

import aplicacion.modelo.dominio.Producto;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Se inicializa la lista y se le agregan productos.
 * ademas se agregan sus metodos accesores.
 */
public class ListProducto implements Serializable{
    private List<Producto> listProducto;
    
    public ListProducto() {
        listProducto = new ArrayList<>();
        
        listProducto.add(new Producto("1", "computadora", "dell", "electrodomestico", 20000));
        listProducto.add(new Producto("2", "lavarropa", "asda", "electrodomestico", 20000));
        listProducto.add(new Producto("3", "heladera", "dell", "electrodomestico", 20000));
        listProducto.add(new Producto("4", "bicicleta", "dell", "electrodomestico", 20000));
        listProducto.add(new Producto("5", "celular", "asus", "electrodomestico", 20000));
        
    }

    public List<Producto> getListProducto() {
        return listProducto;
    }

    public void setListProducto(List<Producto> listProducto) {
        this.listProducto = listProducto;
    }
    
    
    
    
}
