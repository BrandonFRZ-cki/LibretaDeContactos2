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
        double edad = 0;
        GregorianCalendar today = new GregorianCalendar();
        long diffMillis = today.getTimeInMillis() - fechaNacimiento.getTimeInMillis();
        long diffDays = diffMillis / (24 * 60 * 60 * 1000);
        edad = diffDays / 365.25;
        return edad;
    }

    @Override
    public String toString() {
        return
                super.toString()+
                "\n\tParentesco: " + parentesco +
                "\n\tTipo de sangre: " + tipoDeSangre +
                "\n\tEdad: " + calcularEdad() + " años";
    }
}