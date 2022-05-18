package Guardado;

import Clases.*;
import java.io.*;

public class Guardar_profesor {

    public static void guardar(Profesor prof) {
        String barra = File.separator;
        String ubicacion = System.getProperty("user.dir") + barra + "Base_datos" + barra;
        File crear_ubicacion = new File(ubicacion);
        try {
            crear_ubicacion.mkdirs();
            FileOutputStream fileStrem = new FileOutputStream(ubicacion + prof.getDocumento() + ".obj");
            ObjectOutputStream os = new ObjectOutputStream(fileStrem);
            os.writeObject(prof);
            os.close();
        } catch (Exception e) {
            System.out.println("No se pudo guardar");
        }
    }

    public static Profesor recuperar(String documento) {
        String barra = File.separator;
        String ubicacion = System.getProperty("user.dir") + barra + "Base_datos" + barra;
        try {
            FileInputStream fileStrem = new FileInputStream(ubicacion + documento + ".obj");
            ObjectInputStream os = new ObjectInputStream(fileStrem);
            Object recuperar = os.readObject();
            Profesor recuperado = (Profesor) recuperar;
            return recuperado;
            //os.close();
        } catch (Exception e) {
            //System.out.println("No se pudo recuperar");
            return null;
        }
    }
}
