package com.demo.model;

import com.demo.model.entity.Usuario;
import java.util.ArrayList;

public class ModeloUsuario extends Model {

      private static ArrayList<Usuario> Usuarios = new ArrayList<Usuario>();
      
            
    public static void ArrayList(){
        
        Usuario u1= new Usuario("admin@gmail.com","111");        
        Usuario u2= new Usuario("klokprins.20021814@gmail.com", "222");
       
        Usuarios.add(u1);
        Usuarios.add(u2);
       
        
    }
    
    public static boolean login(Usuario u){
        
        ArrayList();
        boolean band= false;
        int i=0;
        while(band == false & i<Usuarios.size()){
            if( u.getUsuario().compareTo(Usuarios.get(i).getUsuario())==0  &&
                    u.getClave().compareTo(Usuarios.get(i).getClave())==0 ){
             
                
                band= true;
            }else{
                band=false;
                i++;
            }
        }
        return band;
    }
     
     public static boolean logup(Usuario u){
        ArrayList();
        boolean correcto= true;
        int i=0;
        while(correcto==true && i<Usuarios.size()){
            if (Usuarios.get(i).getUsuario().compareTo(u.getUsuario())==0){
                correcto= false;
            }else {
                i++;
                if (i==Usuarios.size()){
                    Usuarios.add(u);
                    i++;
                }
            }
        }
        return correcto;
    }
    public static long CambiarClave(Usuario u){
       ArrayList();
        long status =0;
        int i=0;
        while(status == 0 && i<Usuarios.size() ){
      
            if (Usuarios.get(i).getUsuario().compareTo(u.getUsuario())==0){
                Usuarios.get(i).setClave(u.getClave());
                status=500;
                System.out.println();
            }else{
                i++;
                System.out.println();
            }
            
        }
        return status ;
    }
   
}
