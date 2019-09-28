
package com.demo.controller;

import com.demo.model.ModeloUsuario;
import com.demo.model.entity.Usuario;

public class ControllerLogin extends Controller {
   public ControllerLogin(){
        
    }    
    public boolean LogIn(String Usuario, String Clave){
        boolean band= false;  
        Usuario u =new Usuario(Usuario, Clave);
        band= ModeloUsuario.login(u);
        return band ;
    }
    
    }
    
    
        
        

