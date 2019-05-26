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
    private String proCodigo;
    private String proNombre;
    private String proMarca;
    private String proTipo;
    private Integer proPrecio;

    /**
     * Constructor parametrizado 
     * @param proCodigo
     * @param proNombre
     * @param proMarca
     * @param proTipo
     * @param proPrecio 
     */
    public Producto(String proCodigo, String proNombre, String proMarca, String proTipo, Integer proPrecio) {
        this.proCodigo = proCodigo;
        this.proNombre = proNombre;
        this.proMarca = proMarca;
        this.proTipo = proTipo;
        this.proPrecio = proPrecio;
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
        return "Producto{" + "proCodigo=" + proCodigo + ", proNombre=" + proNombre + ", proMarca=" + proMarca + ", proTipo=" + proTipo + ", proPrecio=" + proPrecio + '}';
    }

    /**
     * Metodos accesores
     * @return 
     */
    public String getProCodigo() {
        return proCodigo;
    }

    public void setProCodigo(String proCodigo) {
        this.proCodigo = proCodigo;
    }

    public String getProNombre() {
        return proNombre;
    }

    public void setProNombre(String proNombre) {
        this.proNombre = proNombre;
    }

    public String getProMarca() {
        return proMarca;
    }

    public void setProMarca(String proMarca) {
        this.proMarca = proMarca;
    }

    public String getProTipo() {
        return proTipo;
    }

    public void setProTipo(String proTipo) {
        this.proTipo = proTipo;
    }

    public Integer getProPrecio() {
        return proPrecio;
    }

    public void setPro_precio(Integer proPrecio) {
        this.proPrecio = proPrecio;
    }
    
    
}
