package org.iesteis.domain;

public class Alumno {
    private String nombre;
    private String dni;

    public Alumno(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return this.dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();
        string.append("Nombre: ");
        string.append(getNombre());
        string.append(" - DNI: ");
        string.append(getDni());
        return string.toString();
    }


}
