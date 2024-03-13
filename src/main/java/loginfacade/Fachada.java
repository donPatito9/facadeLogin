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
public class Fachada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(new facadeEjemplo()
                .clienteRegistrado(new Cliente(
                        "rconcha@alumno.iplacex.cl","contraseña")));
    }
    
}
