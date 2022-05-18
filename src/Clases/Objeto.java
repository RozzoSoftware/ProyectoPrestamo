package Clases;

import java.io.Serializable;

public class Objeto implements Serializable {

    private String nombre;
    private Profesor profesor;
    private Alumno estudiante;

    public Objeto() {
    }

    public Objeto(String nombre, Profesor profesor) {
        this.setNombre(nombre);
        this.setProfesor(profesor);
    }

    public Objeto(String nombre, Profesor profesor, Alumno estudiante) {
        this.setNombre(nombre);
        this.setProfesor(profesor);
        this.setEstudiante(estudiante);
    }

    @Override
    public String toString() {
        String nombres = "\n" + getNombre();
        return nombres;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public Alumno getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Alumno estudiante) {
        this.estudiante = estudiante;
    }

}
