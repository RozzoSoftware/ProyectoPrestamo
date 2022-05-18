package Guardado;

import java.io.File;
import java.io.*;
import Clases.*;

public class Guardar_estudiante {
    public static void guardar(Alumno estu) {
        String barra = File.separator;
        String ubicacion = System.getProperty("user.dir") + barra + "Base_datos" + barra;
        File crear_ubicacion = new File(ubicacion);
        try {
            crear_ubicacion.mkdirs();
            FileOutputStream fileStrem = new FileOutputStream(ubicacion + estu.getDocumento() + ".obj");
            ObjectOutputStream os = new ObjectOutputStream(fileStrem);
            os.writeObject(estu);
            os.close();
        } catch (Exception e) {
            System.out.println("No se pudo guardar");
        }

    }

    public static Alumno recuperar(String documento) {
        String barra = File.separator;
        String ubicacion = System.getProperty("user.dir") + barra + "Base_datos" + barra;
        try {
            FileInputStream fileStrem = new FileInputStream(ubicacion + documento + ".obj");
            ObjectInputStream os = new ObjectInputStream(fileStrem);
            Object recuperar = os.readObject();
            Alumno recuperado = (Alumno) recuperar;
            return recuperado;
            //os.close();
        } catch (Exception e) {
            //System.out.println("No se pudo recuperar");
            return null;
        }
    }
}
