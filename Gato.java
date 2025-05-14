package InformacionBasica;

public class Gato extends InformacionAnimal {

    protected String nivelAgresividad;
    protected boolean estaEsterilizado;

    public Gato(String nombre, String especie, String sexo, String raza, String estadoSalud, int edad,
            boolean estaVacunado, String fecha, String estadoDisponibilidad,
            String nivelAgresividad, boolean estaEsterilizado) {
        super(nombre, especie, sexo, raza, estadoSalud, edad, estaVacunado, fecha, estadoDisponibilidad);
        this.nivelAgresividad = nivelAgresividad;
        this.estaEsterilizado = estaEsterilizado;
    }

    public Gato() {
        super();
        this.nivelAgresividad = "";
        this.estaEsterilizado = false;
    }

    public String getnivelAgredividad() {
        return nivelAgresividad;
    }

    public void setnivelAgresividad(String nivelAgresividad) {
        this.nivelAgresividad = nivelAgresividad;
    }

    public boolean getestaEsterilizado() {
        return estaEsterilizado;
    }

    public void setestaEsterilizado(boolean estaEsterilizado) {
        this.estaEsterilizado = estaEsterilizado;
    }

}