package InformacionBasica;

import java.util.ArrayList;
import java.util.List;

public class Registros {
    public static Registros instancia;
    public List<InformacionAnimal> animales;

    public Registros() {
        this.animales = new ArrayList<>();
    }

    public List<InformacionAnimal> getAnimales() {
        return animales;
    }

    public static Registros getInstancia() {
        if (instancia == null) {
            instancia = new Registros();
        }
        return instancia;
    }

    public void agregarAnimal(InformacionAnimal animal, String fecha) {
        animales.add(animal);
        animal.setFecha(fecha);
        System.out.println(animal.getNombre() + " ha sido agregado exitosamente el día " + fecha);
    }

    public void registrarAdopcion(String nombre, String fecha) {
        for (InformacionAnimal animal : animales) {
            if (animal.getNombre().equalsIgnoreCase(nombre)
                    && animal.getEstadoDisponibilidad().equalsIgnoreCase("Disponible")) {
                animal.setEstadoDisponibilidad("Adoptado");
                animal.setFecha(fecha);
                System.out.println("Adoptaste a " + nombre + " el día " + fecha);
                return;
            }
        }
    }

    public void registrarAcogida(String nombre, String tiempo, String fecha) {
        for (InformacionAnimal animal : animales) {
            if (animal.getNombre().equals(nombre) && animal.getEstadoDisponibilidad().equalsIgnoreCase("Disponible")) {
                animal.setEstadoDisponibilidad("Acogido");
                animal.setFecha(fecha);
                System.out.println("Acogiste a " + nombre + " por " + tiempo + " el día " + fecha);
                return;
            }
        }
        System.out.println(nombre + " no está disponible para ser acogido");
    }

}