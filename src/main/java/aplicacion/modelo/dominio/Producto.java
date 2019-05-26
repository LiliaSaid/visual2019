/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.dominio;

import java.io.Serializable;

/**
 *Definimos los atributos de
 * nuestra clase producto 
 */
public class Producto implements Serializable{
    private String codigo;
    private String nombre;
    private String marca;
    private String tipo;
    private Integer precio;

    /**
     * Constructor parametrizado 
     * @param codigo
     * @param nombre
     * @param marca
     * @param tipo   
     * @param precio 
     */
    public Producto(String codigo, String nombre, String marca, String tipo, Integer precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.marca = marca;
        this.tipo = tipo;
        this.precio = precio;
    }
/**
 * constructor
 */
    public Producto() {
    }
/**
 * Conctena los string que representan los datos de los productos
 * @return los datos de un libro
 */
    
    @Override
    public String toString() {
        return "Producto{" + "codigo=" + codigo + ", nombre=" + nombre + ", marca=" + marca + ", tipo=" + tipo + ", precio=" + precio + '}';
    }

    /**
     * Metodos accesores
     * @return 
     */
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }
    
}
