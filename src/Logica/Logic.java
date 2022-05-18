package Logica;

import java.util.ArrayList;
import Clases.*;
import Guardado.*;
import Vista.*;
import javax.swing.JOptionPane;

public class Logic {

    public static void main(String[] args) {
    }

    public static void inicio() {
        Profesor leandro = new Profesor("Leandro", "1234", "1234", "Administrador");
        Guardar_profesor.guardar(leandro);
        Profesor rta = Guardar_profesor.recuperar("1234");
        //System.out.println(rta);
         /*
        Objeto nuevo = new Objeto("Zapato",leandro);
       prestar_estudiante("123456",nuevo);
        
       */
        /*
        cuenta de estudiante
        documento:123456
        clave:1234
        
         */
    }

    public static void sesion(String documento, String clave) {
        if (Guardar_estudiante.recuperar(documento) != null) {
            Alumno rta = Guardar_estudiante.recuperar(documento);
            if (rta.getDocumento().equals(documento) && rta.getClave().equals(clave)) {

                Consultar_estudiante abrir = new Consultar_estudiante(rta);
                abrir.setVisible(true);

            } else {
                System.out.println("CUENTA O CONTRASEÑA INCORRECTA");
            }

        } else if (Guardar_profesor.recuperar(documento) != null) {
            Profesor rta = Guardar_profesor.recuperar(documento);
            if (rta.getDocumento().equals(documento) && rta.getClave().equals(clave)) {
                if (rta.getProfesion().equals("Administrador")) {
                    Menu_administrador abrir = new Menu_administrador();
                    abrir.setVisible(true);
                } else {
                    Menu_profesor abrir = new Menu_profesor(rta);
                    abrir.setVisible(true);
                }
            } else {
                Login abrir = new Login();
                abrir.setVisible(true);
                System.out.println("CUENTA O CONTRASEÑA INCORRECTA");
            }
        } else {
            Login abrir = new Login();
            abrir.setVisible(true);
            System.out.println("CUENTA O CONTRASEÑA INCORRECTA");
        }
    }

    public static void agregar_profesor(Profesor nuevo) {
        Guardar_profesor.guardar(nuevo);
    }

    public static void agregar_estudiante(Alumno nuevo) {
        Guardar_estudiante.guardar(nuevo);
    }

    public static void prestar_estudiante(String documento, Objeto objeto) {
       /**/ if (Guardar_estudiante.recuperar(documento) != null) {
            Alumno rta = Guardar_estudiante.recuperar(documento);
            ArrayList<Objeto> objetos = new ArrayList();
            int numero;
            try {
               numero = rta.getImplemento_prestado().size();
           } catch (Exception e) {
               numero = 0;
           } 
           for(int i =0;i<numero;i++){
           objetos.add(rta.getImplemento_prestado().get(i));
           }
            objetos.add(objeto);
            rta.setImplemento_prestado(objetos);
            agregar_estudiante(rta);
        } else {
            JOptionPane.showMessageDialog(null, "No existe el estudiante");
        }

    }

    public static Alumno consulta_estuiante(String documento) { // agregar condision de que exista      
        Alumno consulta = new Alumno();
        if (Guardar_estudiante.recuperar(documento) != null) {
            consulta = Guardar_estudiante.recuperar(documento);
        } else {
            JOptionPane.showMessageDialog(null, "Estudiante no encontrado");
            consulta = null;
        }
        return consulta;
    }

}
