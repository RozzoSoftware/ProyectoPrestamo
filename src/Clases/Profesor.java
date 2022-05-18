package Clases;

import java.io.Serializable;
import java.util.List;

public class Profesor extends Persona implements Serializable {

    private String profesion;

    public Profesor() {
    }

    @Override
    public String toString() {
        String datos = "Nombre: " + getNombre()
                + "\nDocumento: " + getDocumento();
        return datos;
    }

    public Profesor(String profesion) {
        this.profesion = profesion;
    }

    public Profesor(String nombre, String documento, String clave, String profesion) {
        this.setNombre(nombre);
        this.setDocumento(documento);
        this.setClave(clave);
        this.setProfesion(profesion);

    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    @Override
    public void pedir_objeto(Objeto objeto) {
    }

    ;
    @Override
    public void entregar_objeto(Objeto objeto) {
    }
;

}
