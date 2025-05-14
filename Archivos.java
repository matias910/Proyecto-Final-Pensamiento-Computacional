package Archivos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Archivos {
    public void crearRecibo(String rutaArchivo, String contenidoRecibo) {
        try (BufferedWriter escritor = new BufferedWriter(new FileWriter(rutaArchivo))) {
            escritor.write(contenidoRecibo);
            System.out.println("Recibo creada con éxito: " + rutaArchivo);
        } catch (IOException e) {
            System.out.println("Error al crear el recibo: " + e.getMessage());
        }
    }

}
