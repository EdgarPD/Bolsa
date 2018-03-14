package modelo;
// Generated 12/03/2018 01:34:56 PM by Hibernate Tools 4.3.1



/**
 * Habilidad generated by hbm2java
 */
public class Habilidad  implements java.io.Serializable {


     private int idhabilidad;
     private Profesionista profesionista;
     private String nombre;
     private Integer nivel;

    public Habilidad() {
    }

	
    public Habilidad(int idhabilidad) {
        this.idhabilidad = idhabilidad;
    }
    public Habilidad(int idhabilidad, Profesionista profesionista, String nombre, Integer nivel) {
       this.idhabilidad = idhabilidad;
       this.profesionista = profesionista;
       this.nombre = nombre;
       this.nivel = nivel;
    }
   
    public int getIdhabilidad() {
        return this.idhabilidad;
    }
    
    public void setIdhabilidad(int idhabilidad) {
        this.idhabilidad = idhabilidad;
    }
    public Profesionista getProfesionista() {
        return this.profesionista;
    }
    
    public void setProfesionista(Profesionista profesionista) {
        this.profesionista = profesionista;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Integer getNivel() {
        return this.nivel;
    }
    
    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }




}


