/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginfacade;

/**
 *
 * @author Robinson Concha
 */
public class facadeEjemplo {
    
    public boolean clienteRegistrado(Cliente c){
       if(new Sistema().existe(c)&& (new Login().loginCorrecto(c)&&(new Registro().tieneCuenta(c)))){
           System.out.println("Iniciar Sesion");
           return true;
       
       }else{
           System.out.println("Registrar datos de usuario");
           return false;
       }
    
}

}

