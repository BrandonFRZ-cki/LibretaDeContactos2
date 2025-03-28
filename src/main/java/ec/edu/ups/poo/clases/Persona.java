package ec.edu.ups.poo.clases;

public class Persona {
    private String cedula;
    private String nombre;
    private String apellido;
    private String direccion;

    public Persona() {}
    public Persona(String cedula, String nombre, String apellido, String direccion) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    public String getCedula() {
        return cedula;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getApellido() {
        return apellido;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getDireccion() {
        return direccion;
    }


    @Override
    public String toString() {
        return "----- PERSONA -----" +
                "\n\tNombre: " + nombre +
                "\n\tApellido: " + apellido +
                "\n\tC.I.: " + cedula +
                "\n\tDirección: " + direccion;
    }
}
