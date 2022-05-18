package Clases;

import java.io.Serializable;
import java.util.List;

public abstract class Persona implements Gestor,Serializable{

    private String nombre;
    private String documento;
    private String clave;
    private List<Objeto> Implemento_prestado;
    private List<Objeto> Implemento_devuelto;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public List<Objeto> getImplemento_prestado() {
        return Implemento_prestado;
    }

    public void setImplemento_prestado(List<Objeto> Implemento_prestado) {
        this.Implemento_prestado = Implemento_prestado;
    }

    public List<Objeto> getImplemento_devuelto() {
        return Implemento_devuelto;
    }

    public void setImplemento_devuelto(List<Objeto> Implemento_devuelto) {
        this.Implemento_devuelto = Implemento_devuelto;
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
