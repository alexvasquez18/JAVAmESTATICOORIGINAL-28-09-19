
package com.demo.controller;

import com.demo.model.ModeloUsuario;
import com.demo.model.entity.Usuario;


public class ControllerCambiarClave extends Controller{
    public ControllerCambiarClave(){
    }
    
    public long RecuperarClave(String usuario, String claveRC){
        long status = 0;
        Usuario u =new Usuario(usuario,claveRC);
            status = ModeloUsuario.CambiarClave(u);
            return status;
    }

    }

