package InformacionBasica;

public class InformacionAnimal {
    protected String nombre;
    protected String especie;
    protected String sexo;
    protected String raza;
    protected String estadoSalud;
    protected int edad;
    protected boolean estaVacunado;
    protected String fecha;
    protected String estadoDisponibilidad;

    public InformacionAnimal() {
        this.nombre = "";
        this.especie = "";
        this.sexo = "";
        this.raza = "";
        this.estadoSalud = "";
        this.edad = 0;
        this.estaVacunado = false;
        this.fecha = "";
        this.estadoDisponibilidad = "";
    }

    public InformacionAnimal(String nombre, String especie, String sexo, String raza, String estadoSalud, int edad,
            boolean estaVacunado, String fecha, String estadoDisponibilidad) {
        this.nombre = nombre;
        this.especie = especie;
        this.sexo = sexo;
        this.raza = raza;
        this.estadoSalud = estadoSalud;
        this.edad = edad;
        this.estaVacunado = estaVacunado;
        this.fecha = fecha;
        this.estadoDisponibilidad = estadoDisponibilidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getsexo() {
        return sexo;
    }

    public void setsexo(String sexo) {
        this.sexo = sexo;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getEstadoSalud() {
        return estadoSalud;
    }

    public void setEstadoSalud(String estadoSalud) {
        this.estadoSalud = estadoSalud;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean getestaVacunado() {
        return estaVacunado;
    }

    public void setEstaVacunado(boolean estaVacunado) {
        this.estaVacunado = estaVacunado;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getEstadoDisponibilidad() {
        return estadoDisponibilidad;
    }

    public void setEstadoDisponibilidad(String estado) {
        this.estadoDisponibilidad = estado;
    }

}
