
package com.demo.model.entity;

public class Usuario {
    
    private String id;
     private String nombre;
    private String apellido_pa;
    private String apellido_ma;
    private String usuario;
    private String clave;
   
     
  

public Usuario(){
}
    public Usuario(String Id, String Nombre, String Apellido_pa,String Apellido_ma, String Usuario,String Clave) {
        this.id =Id;
        
        this.nombre = Nombre;
        this.apellido_pa=Apellido_pa;
        this.apellido_ma=Apellido_ma;
        
        this.usuario = Usuario;
        this.clave = Clave;
        
        
    }

    public Usuario(String usuario, String clave) {
        this.usuario = usuario;
        this.clave = clave;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

 
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido_pa() {
        return apellido_pa;
    }

    public void setApellido_pa(String apellido_pa) {
        this.apellido_pa = apellido_pa;
    }

    public String getApellido_ma() {
        return apellido_ma;
    }

    public void setApellido_ma(String apellido_ma) {
        this.apellido_ma = apellido_ma;
    }

  
   
}
