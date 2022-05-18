package BD;

import java.io.File;
import java.util.Formatter;

public class Datos {

    public static void crear(String dato_1, String dato_2, String dato_3, String dato_4) {
        String barra = File.separator;
        String ubicacion = System.getProperty("user.dir") + barra + "Base_datos" + barra;

        String archivo = dato_1 + ".txt";
        File crear_ubicacion = new File(ubicacion);
        File crear_archivo = new File(ubicacion + archivo);
        if (crear_archivo.exists()) {
            System.out.println("Ya exixste el archivo");
        } else {
            try {
                crear_ubicacion.mkdirs();
                try (Formatter crear = new Formatter(ubicacion+archivo)) {
                    crear.format("%s", "dato 1: " + dato_1);
                    crear.close();
                }
                System.out.println("archivo creado");
            } catch (Exception e) {
                System.out.println("archivo no creado");
            }
        }

    }
}
