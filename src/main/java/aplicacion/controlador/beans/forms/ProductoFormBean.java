/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador.beans.forms;

import aplicacion.dao.Iproducto;
import aplicacion.dao.imp.ProductoListDaoImp;
import aplicacion.modelo.dominio.Producto;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * 
 */
@ManagedBean
@ViewScoped
public class ProductoFormBean implements Serializable{
    private Iproducto productoDAO;
    private Producto producto;
    private List<Producto> listaProductoSeleccionado ;
    
    /**
     * Creates a new instance of ProductoFormBean
     */
    public ProductoFormBean() {
        productoDAO = new ProductoListDaoImp();
        producto = new Producto();
        listaProductoSeleccionado = new ArrayList<>();
        
    }

    public List<Producto> obtener(){
        return productoDAO.obtener();
    }
    public Iproducto getProductoDAO() {
        return productoDAO;
    }

    public void setProductoDAO(Iproducto productoDAO) {
        this.productoDAO = productoDAO;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public List<Producto> getListaProductoSeleccionado() {
        return listaProductoSeleccionado;
    }

    public void setListaProductoSeleccionado(List<Producto> listaProductoSeleccionado) {
        this.listaProductoSeleccionado = listaProductoSeleccionado;
    }
    
    public Integer getPrecioTotal(){
        Integer Total = 0;
        for (Producto p:listaProductoSeleccionado){
            Total += p.getPrecio();
        }
        return Total;
    }
    
    
}
