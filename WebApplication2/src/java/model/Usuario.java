package model;
// Generated 31-mar-2016 20:17:34 by Hibernate Tools 4.3.1



/**
 * Usuario generated by hbm2java
 */
public class Usuario  implements java.io.Serializable {


     private int id;
     private String nombre;
     private String correo;
     private Character sexo;

    public Usuario() {
    }

	
    public Usuario(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    public Usuario(int id, String nombre, String correo, Character sexo) {
       this.id = id;
       this.nombre = nombre;
       this.correo = correo;
       this.sexo = sexo;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCorreo() {
        return this.correo;
    }
    
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public Character getSexo() {
        return this.sexo;
    }
    
    public void setSexo(Character sexo) {
        this.sexo = sexo;
    }




}


