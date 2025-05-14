package InformacionBasica;

public class Serpiente extends InformacionAnimal {

    protected boolean esVenenosa;
    protected int frecuenciaAlimentacion;

    public Serpiente(String nombre, String especie, String sexo, String raza, String estadoSalud, int edad,
            boolean estaVacunado, String fecha, String estadoDisponibilidad,
            int frecuenciaAlimentacion, boolean esVenenosa) {
        super(nombre, especie, sexo, raza, estadoSalud, edad, estaVacunado, fecha, estadoDisponibilidad);
        this.frecuenciaAlimentacion = frecuenciaAlimentacion;
        this.esVenenosa = esVenenosa;
    }

    public Serpiente() {
        super();
        this.esVenenosa = false;
        this.frecuenciaAlimentacion = 0;
    }

    public boolean geteesVenenosa() {
        return esVenenosa;
    }

    public void setesVenenosa(boolean esVenenosa) {
        this.esVenenosa = esVenenosa;
    }

    public int getfrecuenciaAlimentacion() {
        return frecuenciaAlimentacion;
    }

    public void setfrecuenciaAlimentacion(int frecuenciaAlimentacion) {
        this.frecuenciaAlimentacion = frecuenciaAlimentacion;
    }

}