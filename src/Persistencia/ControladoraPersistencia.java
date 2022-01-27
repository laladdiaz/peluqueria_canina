/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Logica.Cliente;
import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author Carla
 */
public class ControladoraPersistencia {
      ClienteJpaController clienteJpa = new ClienteJpaController();
      String res="";
    
    public String AltaCliente(Cliente cliente){
        try{
            List<Cliente> listado;
            listado = listarCliente();
            boolean aux=false;
                    
            for(Cliente cl: listado) {
               if(cl.getNum_cliente() == cliente.getNum_cliente()) {
                   aux =true;
               }
            }
            
            
            if(!aux){
               res= clienteJpa.create(cliente);
            }else{
                res= "El Numero de Cliente ya existe.";
            }
                        
        }catch(Exception ex) {
            res = "Error al Comprobar si existe.";
        }
        
        return res;
    }
    
    public List<Cliente> listarCliente(){
        List<Cliente> clientes =new ArrayList<>();
        
        return clientes = clienteJpa.findClienteEntities();
    }
}