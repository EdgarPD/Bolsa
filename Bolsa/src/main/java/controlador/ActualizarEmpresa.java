/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import modelo.Empresa;
import modelo.EmpresaDAO;

//Etiqueta para decirle a jsf que esta clase es un controlador
@ManagedBean
//Etiqueta para que viva este bean hasta que se cambie de pagina. util para jax
@ViewScoped

/**
 *
 * @author Cal
 */
public class ActualizarEmpresa {
    private String nombre;
    private String oficinas;
    private Integer numempleados;
    private String contacto;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getOficinas() {
        return this.oficinas;
    }
    
    public void setOficinas(String oficinas) {
        this.oficinas = oficinas;
    }
    public Integer getNumempleados() {
        return this.numempleados;
    }
    
    public void setNumempleados(Integer numempleados) {
        this.numempleados = numempleados;
    }
    public String getContacto() {
        return this.contacto;
    }
    
    public void setContacto(String contacto) {
        this.contacto = contacto;
    }
    
    /**
     * peticion que guarda un proyecto 
     */
    public void actualizaEmpresa(){
        Empresa p = new Empresa();
        p.setNombre(nombre);
        p.setOficinas(oficinas);
        p.setNumempleados(numempleados);
        p.setContacto(contacto);
        EmpresaDAO pd = new EmpresaDAO();
        pd.actualiza(p);
    }
}
