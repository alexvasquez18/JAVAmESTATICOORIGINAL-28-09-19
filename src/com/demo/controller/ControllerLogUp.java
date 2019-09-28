
package com.demo.controller;

import com.demo.model.ModeloUsuario;
import com.demo.model.entity.Usuario;

public class ControllerLogUp extends Controller{
    public ControllerLogUp(){

}
    public long LogUp(){
        long status=0 ;
        return status;
    }
        public boolean Registrar (String Id , String Nombre, String Apellido_pa,String Apellido_ma,
            String Usuario,String Clave){
        boolean band= false;
        Usuario u=new Usuario (Id,Nombre,Apellido_pa,Apellido_ma,Usuario,Clave);
        band = ModeloUsuario.logup(u);
       
        
        return band;
}}
