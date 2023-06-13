/*
OBJETIVO
Realizar un programa para que una Persona pueda adoptar un Perro. 

PASOS
Vamos a contar de dos clases. 
    1) Perro, que tendrá como atributos: 
            nombre, 
            raza, 
            edad y 
            tamaño;  
    2)la clase Persona con atributos: 
            nombre, 
            apellido, 
            edad, 
            documento y 
            Perro.

Ahora deberemos en el main crear dos Personas y dos Perros. 
Después, vamos a tener que pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, 
mostrar desde la clase Persona, la información del Perro y de la Persona.
 */
package Main;

import Entidades.Persona;
import Servicios.ServicioAdopcion;
import java.util.ArrayList;

/**
 *
 * @author MiriamNahuel
 */
public class Java2Encuentros10Al18Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServicioAdopcion servicio = new ServicioAdopcion();
        
        ArrayList<Persona> personas = servicio.crearPersona();
        
        servicio.mostrarInformacion(personas);
    }
    
}
