/*
Ahora deberemos en el main crear dos Personas y dos Perros. 
Después, vamos a tener que pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, 
mostrar desde la clase Persona, la información del Perro y de la Persona.
 */
package Servicios;

import Entidades.Perro;
import Entidades.Persona;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author MiriamNahuel
 */
public class ServicioAdopcion {

    Scanner lector = new Scanner(System.in).useDelimiter("\n");

    public ArrayList<Persona> crearPersona() {

        ArrayList<Persona> personas = new ArrayList();
        String continuar;
        System.out.println("Inserte los datos de la persona:");

        do {
            System.out.println("Nombre: ");
            String nombre = lector.next();

            System.out.println("Apellido: ");
            String apellido = lector.next();

            System.out.println("Edad: ");
            int edad = lector.nextInt();

            System.out.println("Documento de identidad: ");
            int documento = lector.nextInt();

            System.out.println("Perro adoptado: ");
            String nombrePerro = lector.next();
            System.out.println("Raza del perro: ");
            String razaPerro = lector.next();
            System.out.println("Edad del perro: ");
            int edadPerro = lector.nextInt();
            System.out.println("Tamaño del perro: ");
            String tamanoPerro = lector.next();

            Perro perro = new Perro(nombrePerro, razaPerro, edadPerro, tamanoPerro);
            Persona persona = new Persona(nombre, apellido, edad, documento, perro);

            personas.add(persona);

            System.out.println("¿Desea agregar otra persona? (s/n)");
            continuar = lector.next();
            
            System.out.println("------------------------------------");

        } while (continuar.equalsIgnoreCase("s"));

        return personas;
    }

    public void mostrarInformacion(ArrayList<Persona> personas) {

        for (Persona persona : personas) {
            //datos persona
            System.out.println("Nombre del adoptante: " + persona.getNombre() + " " + persona.getApellido());
            System.out.println("Edad: " + persona.getEdad() + " y documento " + persona.getDocumento());

           
            //datos perro adoptado
            System.out.println("Adopta a " + persona.getPerro().getNombre());
            System.out.println("Es un " + persona.getPerro().getRaza() + " de tamaño " + persona.getPerro().getTamano());

             System.out.println("-----------------------------------------");
        }

    }
}
