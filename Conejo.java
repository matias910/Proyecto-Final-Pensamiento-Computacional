package InformacionBasica;

public class Conejo extends InformacionAnimal {

    protected String tamano;
    protected String tipoDieta;

    public Conejo(String nombre, String especie, String sexo, String raza, String estadoSalud, int edad,
            boolean estaVacunado, String fecha, String estadoDisponibilidad,
            String tamano, String tipoDieta) {
        super(nombre, especie, sexo, raza, estadoSalud, edad, estaVacunado, fecha, estadoDisponibilidad);
        this.tamano = tamano;
        this.tipoDieta = tipoDieta;
    }

    public Conejo() {
        super();
        this.tamano = "";
        this.tipoDieta = "";
    }

    public String gettamano() {
        return tamano;
    }

    public void settamano(String tamano) {
        this.tamano = tamano;
    }

    public void setnivelAdiestramiento(String tamano) {
        this.tamano = tamano;
    }

    public String gettipoDieta() {
        return tipoDieta;
    }

    public void settipoDieta(String tipoDieta) {
        this.tipoDieta = tipoDieta;
    }

}