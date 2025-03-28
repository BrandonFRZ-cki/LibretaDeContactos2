package ec.edu.ups.poo.principal;

import ec.edu.ups.poo.clases.Familiar;
import ec.edu.ups.poo.clases.Persona;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        //Pruebas con commits ----
        Persona persona = new Persona();
        persona.setNombre("Jose");
        persona.setApellido("Perez");
        persona.setCedula("010101010101");
        persona.setDireccion("ElValle");
        //--------


        Scanner scanner = new Scanner(System.in);

        System.out.println("---------- LIBRETA DE CONTACTOS ---------");
        System.out.print("Ingresa el número de personas → ");
        int numeroDePersonas = scanner.nextInt();
        System.out.print("Ingresa el número de familiares → ");
        int numeroDeFamiliares = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        Persona[] personas = new Persona[numeroDePersonas];
        Familiar[] familiares = new Familiar[numeroDeFamiliares];

        String nombre=null;
        String apellido=null;
        String cedula=null;
        String direccion=null;

        for (int i = 0; i < numeroDePersonas; i++) {
            System.out.println("-------------- PERSONA [" + (i + 1) + "] --------------");
            System.out.print("Nombre → ");
            nombre = scanner.nextLine();
            System.out.print("Apellido → ");
            apellido = scanner.nextLine();
            System.out.print("Cédula → ");
            cedula = scanner.nextLine();
            System.out.print("Dirección → ");
            direccion = scanner.nextLine();

            personas[i] = new Persona(cedula, nombre, apellido, direccion);
        }
        for (int i = 0; i < numeroDeFamiliares; i++) {
            System.out.println("-------------- FAMILIAR [" + (i + 1) + "] --------------");
            System.out.print("Nombre → ");
            nombre = scanner.nextLine();
            System.out.print("Apellido → ");
            apellido = scanner.nextLine();
            System.out.print("Cédula → ");
            cedula = scanner.nextLine();
            System.out.print("Dirección → ");
            direccion = scanner.nextLine();
            System.out.print("Parentesco → ");
            String parentesco = scanner.nextLine();
            System.out.print("Tipo de sangre → ");
            String tipoSangre = scanner.nextLine();
            System.out.println("* Fecha de nacimiento *");
            System.out.print("Año → ");
            int year = scanner.nextInt();
            System.out.print("Mes → ");
            int month = scanner.nextInt() - 1;
            System.out.print("Día → ");
            int day = scanner.nextInt();
            scanner.nextLine();

            GregorianCalendar fechaNacimiento = new GregorianCalendar(year, month, day);
            familiares[i] = new Familiar(cedula, nombre, apellido, direccion, parentesco, tipoSangre, fechaNacimiento);
        }

        System.out.println("\n----- INFORMACIÓN DE PERSONAS -----");
        for (int i = 0; i < personas.length; i++) {
            System.out.println(personas[i]);
        }
        System.out.println("\n----- INFORMACIÓN DE FAMILIARES -----");
        for (int i = 0; i < familiares.length; i++) {
            System.out.println(familiares[i]);
        }
    }
}