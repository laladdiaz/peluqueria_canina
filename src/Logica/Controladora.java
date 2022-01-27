/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Persistencia.ControladoraPersistencia;

public class Controladora {

    ControladoraPersistencia control = new ControladoraPersistencia();

    public String agregar(int num_cliente, String nombre_perro, String raza, String color, String alergico, String atencion_especial, String nombre_duenio, String celular_duenio, String observaciones) {
        Cliente cliente = new Cliente();
        String res;

        cliente.setNum_cliente(num_cliente);
        cliente.setNombre_perro(nombre_perro);
        cliente.setRaza(raza);
        cliente.setColor(color);
        cliente.setNombre_dueno(nombre_duenio);
        cliente.setAlergico(alergico);
        cliente.setAtencion_especial(atencion_especial);
        cliente.setTel_dueno(celular_duenio);
        cliente.setObservaciones(observaciones);

        res = control.AltaCliente(cliente);
        
        return res;
    }

}
