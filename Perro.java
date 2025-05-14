package InformacionBasica;

public class Perro extends InformacionAnimal {

    protected String nivelAdiestramiento;
    protected String colorPelo;

    public Perro(String nombre, String especie, String sexo, String raza, String estadoSalud, int edad,
            boolean estaVacunado, String fecha, String estadoDisponibilidad,
            String nivelAdiestramiento, String colorPelo) {
        super(nombre, especie, sexo, raza, estadoSalud, edad, estaVacunado, fecha, estadoDisponibilidad);
        this.nivelAdiestramiento = nivelAdiestramiento;
        this.colorPelo = colorPelo;
    }

    public Perro() {
        super();
        this.nivelAdiestramiento = "";
        this.colorPelo = "";
    }

    public String getnivelAdiestramiento() {
        return nivelAdiestramiento;
    }

    public void setnivelAdiestramiento(String nivelAdiestramiento) {
        this.nivelAdiestramiento = nivelAdiestramiento;
    }

    public String getcolorPelo() {
        return colorPelo;
    }

    public void setcolorPelo(String colorPelo) {
        this.colorPelo = colorPelo;
    }

}