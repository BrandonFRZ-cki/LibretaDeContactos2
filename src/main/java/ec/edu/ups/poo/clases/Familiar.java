package ec.edu.ups.poo.clases;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Familiar extends Persona {
    private String parentesco;
    private String tipoDeSangre;
    private GregorianCalendar fechaNacimiento;

    public Familiar() {
    }

    public Familiar(String cedula, String nombre, String apellido, String direccion, String parentesco, String tipoDeSangre, GregorianCalendar fechaNacimiento) {
        super(cedula, nombre, apellido, direccion);
        this.parentesco = parentesco;
        this.tipoDeSangre = tipoDeSangre;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    public String getTipoDeSangre() {
        return tipoDeSangre;
    }

    public void setTipoDeSangre(String tipoDeSangre) {
        this.tipoDeSangre = tipoDeSangre;
    }

    public GregorianCalendar getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(GregorianCalendar fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public double calcularEdad() {
        Calendar fechaActual = Calendar.getInstance();
        int esteYear = fechaActual.get(Calendar.YEAR);
        int esteMes = fechaActual.get(Calendar.MONTH);
        int esteDia = fechaActual.get(Calendar.DAY_OF_MONTH);

        int yearNacimiento = fechaNacimiento.get(Calendar.YEAR);
        int mesNacimiento = fechaNacimiento.get(Calendar.MONTH);
        int diaNacimiento = fechaNacimiento.get(Calendar.DAY_OF_MONTH);

        int edad = esteYear - yearNacimiento;

        if (esteMes < mesNacimiento || (esteMes == mesNacimiento && esteDia < diaNacimiento)) {
            edad--;
        }

        return edad;
    }

    @Override
    public String toString() {
        return "----- FAMILIAR -----" +
                "\n\tNombre: " + getNombre() +
                "\n\tApellido: " + getApellido() +
                "\n\tC.I.: " + getCedula() +
                "\n\tDirección: " + getDireccion() +
                "\n\t--- Información Familiar ---" +
                "\n\tParentesco: " + parentesco +
                "\n\tTipo de sangre: " + tipoDeSangre +
                "\n\tEdad: " + calcularEdad() + " años";
    }
}