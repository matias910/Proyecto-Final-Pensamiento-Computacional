package Excepciones;

import Consolas.ConsolaRegistro;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import Consolas.ConsolaAcoger;
import Consolas.ConsolaAdoptar;
import javax.swing.JOptionPane;

public class Excepciones {

    JTextField Nombre = new JTextField();
    JTextField Especie = new JTextField();
    ButtonGroup Sexo = new ButtonGroup();
    JRadioButton Masculino = new JRadioButton("Masculino");
    JRadioButton Femenino = new JRadioButton("Femenino");
    JTextField Raza = new JTextField();
    JTextField EstadoSalud = new JTextField();
    JTextField Edad = new JTextField();
    ButtonGroup Vacunado = new ButtonGroup();
    JRadioButton SiVacunado = new JRadioButton("Si");
    JRadioButton NoVacunado = new JRadioButton("No");
    JTextField Fecha = new JTextField();
    String[] Animales = { "Loro", "Conejo", "Gato", "Perro", "Hamster", "Serpiente", "Tortuga" };
    JComboBox<String> Animal = new JComboBox<>(Animales);
    JTextField NivelAdiestramiento = new JTextField(); // PERRO
    JTextField ColorPelo = new JTextField(); // PERRO
    JTextField NivelAgresividad = new JTextField(); // GATO
    ButtonGroup Esterelizado = new ButtonGroup();// GATO
    JRadioButton SiEsterelizado = new JRadioButton("Si");// GATO
    JRadioButton NoEsterelizado = new JRadioButton("No");// GATO
    JTextField Tamano = new JTextField();// CONEJO
    JTextField TipoDieta = new JTextField();// CONEJO
    JTextField ColorPlumas = new JTextField();// LORO
    ButtonGroup PuedeVolar = new ButtonGroup();// LORO
    JRadioButton SiVuela = new JRadioButton("Si");// LORO
    JRadioButton NoVuela = new JRadioButton("No");// LORO
    JTextField FrecuenciaAlimentacion = new JTextField();// SERPIENTE
    ButtonGroup Venenosa = new ButtonGroup();// SERPIENTE
    JRadioButton SiVenenosa = new JRadioButton("Si");// SERPIENTE
    JRadioButton NoVenenosa = new JRadioButton("No");// SERPIENTE
    JTextField TamanoCaparazon = new JTextField();// TORTUGA
    JTextField DietaPrincipal = new JTextField();// TORTUGA
    JButton VolverMenu = new JButton("Volver");

    public Excepciones(JTextField Nombre, JTextField Especie, JTextField Raza, JTextField EstadoSalud,
            JTextField Edad) {
        this.Nombre = Nombre;
        this.Especie = Especie;
        this.Raza = Raza;
        this.EstadoSalud = EstadoSalud;
        this.Edad = Edad;
    }

    public boolean Error() {
        boolean error = false;
        // NOMBRE
        if (Nombre.getText() == null) {
            System.out.println("No se puede dejar vacio el nombre");
            error = true;
        }
        try {
            Integer.parseInt(Nombre.getText());
            JOptionPane.showMessageDialog(null, "El nombre no puede ser un numero");
            error = true;
        } catch (NumberFormatException e) {
            // CORRECTO
        }
        // ESPECIE
        if (Especie.getText() == null) {
            JOptionPane.showMessageDialog(null, "No se puede dejar vacía la especie");
            error = true;
        }
        try {
            Integer.parseInt(Especie.getText());
            JOptionPane.showMessageDialog(null, "La especie no puede ser un número");
            error = true;
        } catch (NumberFormatException e) {
            // CORRECTO
        }
        // RAZA
        if (Raza.getText() == null) {
            JOptionPane.showMessageDialog(null, "No se puede dejar vacía la raza");
            error = true;
        }
        try {
            Integer.parseInt(Raza.getText());
            JOptionPane.showMessageDialog(null, "La raza no puede ser un número");
            error = true;

        } catch (NumberFormatException e) {
            // CORRECTO
        }
        // ESTADO DE SALUD
        if (EstadoSalud.getText() == null) {
            JOptionPane.showMessageDialog(null, "No se puede dejar vacío el estado de salud");
            error = true;
        }
        try {
            Integer.parseInt(EstadoSalud.getText());
            JOptionPane.showMessageDialog(null, "El estado de salud no puede ser un número");
            error = true;
        } catch (NumberFormatException e) {
            // CORRECTO
        }
        // EDAD
        if (Edad.getText() == null || Edad.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Edad errónea, diligenciar los campos por favor");
            error = true;
        } else {
            try {
                int edad = Integer.parseInt(Edad.getText().trim());
                if (edad < 0 || edad > 70) {
                    JOptionPane.showMessageDialog(null, "Ingresar una edad real");
                    error = true;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "La edad tiene que ser un número");
                error = true;
            }
        }

        return error;
    }
}
