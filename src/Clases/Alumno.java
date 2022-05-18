package Clases;
import java.io.Serializable;
import java.util.List;

public class Alumno extends Persona implements Serializable{

    private String Curso;

    public Alumno(){}
    /*
    public Alumno(List<Object> objeto){
    this.setImplemento_prestado(objeto);
    }
    */
    public Alumno(String nombre,String documento, String clave, String curso){
    this.setNombre(nombre);
    this.setDocumento(documento);
    this.setClave(clave);   
    this.setCurso(curso);
    }
    
    @Override
    public String toString(){
        String datos = "Nombre: "+getNombre()
                +"\nDocumento: "+getDocumento()
                +"\nCurso: "+getCurso()
                +"\nObjetos prestados: "+getImplemento_prestado();
    return datos;
    }
      
    public String getCurso() {
        return Curso;
    }

    public void setCurso(String Curso) {
        this.Curso = Curso;
    }

    @Override
    public void pedir_objeto(Objeto objeto) {
    }

    ;
    @Override
    public void entregar_objeto(Objeto objeto) {
    }

}
