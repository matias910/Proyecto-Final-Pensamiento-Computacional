package InformacionBasica;

public class Loro extends InformacionAnimal {

    protected String colorPlumas;
    protected boolean puedeVolar;

    public Loro(String nombre, String especie, String sexo, String raza, String estadoSalud, int edad,
            boolean estaVacunado, String fecha, String estadoDisponibilidad,
            String colorPlumas, boolean puedeVolar) {
        super(nombre, especie, sexo, raza, estadoSalud, edad, estaVacunado, fecha, estadoDisponibilidad);
        this.colorPlumas = colorPlumas;
        this.puedeVolar = puedeVolar;
    }

    public Loro() {
        super();
        this.colorPlumas = "";
        this.puedeVolar = false;
    }

    public String getColorPlumas() {
        return colorPlumas;
    }

    public void setColorPlumas(String colorPlumas) {
        this.colorPlumas = colorPlumas;
    }

    public boolean getPuedeVolar() {
        return puedeVolar;
    }

    public void setPuedeVolar(boolean puedeVolar) {
        this.puedeVolar = puedeVolar;
    }

}