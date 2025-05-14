package InformacionBasica;

public class Hamster extends InformacionAnimal {

    protected String nivelAgresividad;

    public Hamster(String nombre, String especie, String sexo, String raza, String estadoSalud, int edad,
            boolean estaVacunado, String fecha, String estadoDisponibilidad,
            String nivelAgresividad) {
        super(nombre, especie, sexo, raza, estadoSalud, edad, estaVacunado, fecha, estadoDisponibilidad);
        this.nivelAgresividad = nivelAgresividad;
    }

    public Hamster() {
        super();
        this.nivelAgresividad = "";
    }

    public String getnivelAgredividad() {
        return nivelAgresividad;
    }

    public void setnivelAgresividad(String nivelAgresividad) {
        this.nivelAgresividad = nivelAgresividad;
    }

}