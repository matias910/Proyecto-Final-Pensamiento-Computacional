package InformacionBasica;

public class Tortuga extends InformacionAnimal {

    protected double tamanoCaparazon;
    protected String dietaPrincipal;

    public Tortuga(String nombre, String especie, String sexo, String raza, String estadoSalud, int edad,
            boolean estaVacunado, String fecha, String estadoDisponibilidad,
            double tamanoCaparazon, String dietaPrincipal) {
        super(nombre, especie, sexo, raza, estadoSalud, edad, estaVacunado, fecha, estadoDisponibilidad);
        this.tamanoCaparazon = tamanoCaparazon;
        this.dietaPrincipal = dietaPrincipal;
    }

    public Tortuga() {
        super();
        this.tamanoCaparazon = 0;
        this.dietaPrincipal = "";
    }

    public double gettamanoCaparazon() {
        return tamanoCaparazon;
    }

    public void settamanoCaparazon(double tamanoCaparazon) {
        this.tamanoCaparazon = tamanoCaparazon;
    }

    public String getdietaPrincipal() {
        return dietaPrincipal;
    }

    public void setdietaPrincipal(String dietaPrincipal) {
        this.dietaPrincipal = dietaPrincipal;
    }

}