import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import Archivos.Archivos;
import Excepciones.Excepciones;

import java.time.LocalDate;
import InformacionBasica.Perro;
import InformacionBasica.Gato;
import InformacionBasica.Hamster;
import InformacionBasica.Conejo;
import InformacionBasica.Hamster;
import InformacionBasica.Loro;
import InformacionBasica.Serpiente;
import InformacionBasica.Tortuga;
import InformacionBasica.Registros;
import java.io.File;

public class ConsolaRegistro implements ActionListener {

    public Perro perro = new Perro(null, null, null, null, null, 0, false, null, null, null, null);
    public Gato gato = new Gato(null, null, null, null, null, 0, false, null, null, null, false);
    public Conejo conejo = new Conejo(null, null, null, null, null, 0, false, null, null, null, null);
    public Hamster hamster = new Hamster(null, null, null, null, null, 0, false, null, null, null);
    public Loro loro = new Loro(null, null, null, null, null, 0, false, null, null, null, false);
    public Serpiente serpiente = new Serpiente(null, null, null, null, null, 0, false, null, null, 0, false);
    public Tortuga tortuga = new Tortuga(null, null, null, null, null, 0, false, null, null, 0, null);
    public Registros animalAgregar;
    public Archivos ArchivoCreado;

    JFrame VentanaRegistro = new JFrame();
    JButton GuardarBoton = new JButton("<html>Guardar<br>Registro</html>");
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

    public ConsolaRegistro() {

        animalAgregar = Registros.getInstancia();
        ArchivoCreado = new Archivos();

        // Animales de ejemplo
        Perro perro1 = new Perro("Jack", "Perro", "Masculino", "Pomeranea", "Aliviado", 5, true, "04/05/2025",
                "Disponible", "Alto", "Banco");
        animalAgregar.agregarAnimal(perro1, perro1.getFecha());

        Gato gato1 = new Gato("Blue", "Gato", "Femenino", "Siames", "Enfermo", 3, false, "10/05/2025", "Adoptado",
                "Bajo", true);
        animalAgregar.agregarAnimal(gato1, gato1.getFecha());

        Conejo conejo1 = new Conejo("Sombra", "Conejo", "Femenino", "Enano", "Aliviado", 4, true, "05/05/2024",
                "Adoptado", "Pequeño", "Herbívoro");
        animalAgregar.agregarAnimal(conejo1, conejo1.getFecha());

        Hamster hamster1 = new Hamster("Everest", "Hamster", "Masculino", "Ruso", "Aliviado", 1, false, "20/01/2024",
                "Disponible", "Muy Alto");
        animalAgregar.agregarAnimal(hamster1, hamster1.getFecha());

        Loro loro1 = new Loro("Pachito", "Loro", "Masculino", "Amazonas", "Aliviado", 4, true, "12/07/2024",
                "Acogido",
                "Rojas", true);
        animalAgregar.agregarAnimal(loro1, loro1.getFecha());

        Serpiente serpiente1 = new Serpiente("Luca", "Serpiente", "Masculino", "Boa", "Enfermo", 6, false, "18/06/2024",
                "Adoptado", 4, false);
        animalAgregar.agregarAnimal(serpiente1, serpiente1.getFecha());

        Tortuga tortuga1 = new Tortuga("Samanta", "Tortuga", "Femenino", "Mediterránea", "Aliviado", 10, true,
                "01/07/2024", "Disponible", 15.5, "Vegetariana");
        animalAgregar.agregarAnimal(tortuga1, tortuga1.getFecha());

        Perro perro2 = new Perro("Sasha", "Perro", "Femenino", "Salchicha", "Enfermo", 8, false, "08/08/2024",
                "Adoptado", "Alto", "Negro");
        animalAgregar.agregarAnimal(perro2, perro2.getFecha());

        Gato gato2 = new Gato("Nico", "Gato", "Masculino", "Persa", "Aliviado", 2, true, "09/09/2024", "Disponible",
                "Alto", false);
        animalAgregar.agregarAnimal(gato2, gato2.getFecha());

        VentanaRegistro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        VentanaRegistro.getContentPane().setBackground(new Color(211, 211, 211));
        VentanaRegistro.setSize(600, 750);
        VentanaRegistro.setResizable(false);
        VentanaRegistro.setLayout(null);

        JLabel TextoInicioRegistro = new JLabel("Registro de animales");
        TextoInicioRegistro.setFont(new Font("Tahoma", Font.BOLD, 24));
        TextoInicioRegistro.setBounds(175, 0, 300, 50);

        JLabel TextoAnimal = new JLabel("Que animal vas a registrar: ");
        TextoAnimal.setFont(new Font("Tahoma", Font.BOLD, 14));
        TextoAnimal.setBounds(20, 60, 200, 30);
        Animal.setBounds(250, 60, 150, 30);

        GuardarBoton.setFont(new Font("Tahoma", Font.BOLD, 14));
        GuardarBoton.setBounds(200, 510, 100, 60);
        GuardarBoton.addActionListener(this);
        VentanaRegistro.add(GuardarBoton);

        VolverMenu.setFont(new Font("Tahoma", Font.BOLD, 14));
        VolverMenu.setBounds(200, 580, 100, 60);
        VolverMenu.addActionListener(this);

        JLabel TextoNombre = new JLabel("Nombre:");
        TextoNombre.setFont(new Font("Tahoma", Font.BOLD, 14));
        TextoNombre.setBounds(20, 100, 100, 30);
        Nombre.setBounds(140, 100, 300, 30);

        JLabel TextoEspecie = new JLabel("Especie:");
        TextoEspecie.setFont(new Font("Tahoma", Font.BOLD, 14));
        TextoEspecie.setBounds(20, 140, 100, 30);
        Especie.setBounds(140, 140, 300, 30);

        JLabel TextoSexo = new JLabel("Sexo:");
        TextoSexo.setFont(new Font("Tahoma", Font.BOLD, 14));
        TextoSexo.setBounds(20, 180, 100, 30);
        Sexo.add(Masculino);
        Sexo.add(Femenino);
        Masculino.setBounds(140, 180, 100, 30);
        Masculino.setBackground(new Color(211, 211, 211));
        Femenino.setBounds(260, 180, 150, 30);
        Femenino.setBackground(new Color(211, 211, 211));

        JLabel TextoRaza = new JLabel("Raza:");
        TextoRaza.setFont(new Font("Tahoma", Font.BOLD, 14));
        TextoRaza.setBounds(20, 220, 100, 30);
        Raza.setBounds(140, 220, 300, 30);

        JLabel TextoEstadoSalud = new JLabel("<html>Estado de<br>Salud:</html>");
        TextoEstadoSalud.setFont(new Font("Tahoma", Font.BOLD, 14));
        TextoEstadoSalud.setBounds(20, 260, 150, 30);
        EstadoSalud.setBounds(140, 260, 300, 30);

        JLabel TextoEdad = new JLabel("Edad:");
        TextoEdad.setFont(new Font("Tahoma", Font.BOLD, 14));
        TextoEdad.setBounds(20, 300, 100, 30);
        Edad.setBounds(140, 300, 300, 30);

        JLabel TextoVacunado = new JLabel("Vacunado?");
        TextoVacunado.setFont(new Font("Tahoma", Font.BOLD, 14));
        TextoVacunado.setBounds(20, 340, 150, 30);
        Vacunado.add(SiVacunado);
        Vacunado.add(NoVacunado);
        SiVacunado.setBounds(160, 340, 50, 30);
        SiVacunado.setBackground(new Color(211, 211, 211));
        NoVacunado.setBounds(220, 340, 50, 30);
        NoVacunado.setBackground(new Color(211, 211, 211));

        JLabel TextoFecha = new JLabel("Fecha:");
        TextoFecha.setFont(new Font("Tahoma", Font.BOLD, 14));
        TextoFecha.setBounds(20, 380, 100, 30);
        Fecha.setBounds(140, 380, 300, 30);

        // NivelAdiestramiento: Perros
        JLabel TextoNivelAdiestramiento = new JLabel("<html>Nivel de<br>Adiestramiento:</html>");
        TextoNivelAdiestramiento.setFont(new Font("Tahoma", Font.BOLD, 14));
        TextoNivelAdiestramiento.setBounds(20, 420, 300, 30);
        NivelAdiestramiento.setBounds(140, 420, 300, 30);

        // ColorPelo: Perros
        JLabel TextoColorPelo = new JLabel("<html>Color de<br>Pelo:</html>");
        TextoColorPelo.setFont(new Font("Tahoma", Font.BOLD, 14));
        TextoColorPelo.setBounds(20, 460, 300, 30);
        ColorPelo.setBounds(140, 460, 300, 30);

        // Tamano: Conejo
        JLabel TextoTamano = new JLabel("Tamaño:");
        TextoTamano.setFont(new Font("Tahoma", Font.BOLD, 14));
        TextoTamano.setBounds(20, 420, 100, 30);
        Tamano.setBounds(140, 420, 300, 30);

        // Dieta Conejo
        JLabel TextoTipoDieta = new JLabel("Tipo de Dieta:");
        TextoTipoDieta.setFont(new Font("Tahoma", Font.BOLD, 14));
        TextoTipoDieta.setBounds(20, 460, 150, 30);
        TipoDieta.setBounds(140, 460, 300, 30);

        // Nivel Agresividad Gato y Hamster
        JLabel TextoNivelAgresividad = new JLabel("<html>Nivel de<br>Agresividad:</html>");
        TextoNivelAgresividad.setFont(new Font("Tahoma", Font.BOLD, 14));
        TextoNivelAgresividad.setBounds(20, 420, 300, 40);

        NivelAgresividad.setBounds(140, 420, 300, 30);

        // Esterilizado Gato
        JLabel TextoEstaEsterilizado = new JLabel("Esterelizado?");
        TextoEstaEsterilizado.setFont(new Font("Tahoma", Font.BOLD, 14));
        TextoEstaEsterilizado.setBounds(20, 460, 150, 30);
        Esterelizado.add(SiEsterelizado);
        Esterelizado.add(NoEsterelizado);
        SiEsterelizado.setBounds(160, 460, 50, 30);
        SiEsterelizado.setBackground(new Color(211, 211, 211));
        NoEsterelizado.setBounds(220, 460, 50, 30);
        NoEsterelizado.setBackground(new Color(211, 211, 211));

        // Color plumas Loro
        JLabel TextoColorPlumas = new JLabel("<html>Color de<br>las Plumas:</html>");
        TextoColorPlumas.setFont(new Font("Tahoma", Font.BOLD, 14));
        TextoColorPlumas.setBounds(20, 420, 300, 40);
        ColorPlumas.setBounds(140, 420, 300, 30);

        // Puede volar Loro
        JLabel TextoPuedeVolar = new JLabel("Puede Volar?");
        TextoPuedeVolar.setFont(new Font("Tahoma", Font.BOLD, 14));
        TextoPuedeVolar.setBounds(20, 460, 150, 30);
        PuedeVolar.add(SiVuela);
        PuedeVolar.add(NoVuela);
        SiVuela.setBounds(160, 460, 50, 30);
        SiVuela.setBackground(new Color(211, 211, 211));
        NoVuela.setBounds(220, 460, 50, 30);
        NoVuela.setBackground(new Color(211, 211, 211));

        // Frecuencia de Alimentación: Serpiente
        JLabel TextoFrecuenciaAlimentacion = new JLabel("<html>Frecuencia de<br>Alimentación:</html>");
        TextoFrecuenciaAlimentacion.setFont(new Font("Tahoma", Font.BOLD, 14));
        TextoFrecuenciaAlimentacion.setBounds(20, 420, 200, 40);
        FrecuenciaAlimentacion.setBounds(140, 420, 300, 30);

        // Es venenosa Serpiente
        JLabel TextoEsVenenosa = new JLabel("Es Venenosa?");
        TextoEsVenenosa.setFont(new Font("Tahoma", Font.BOLD, 14));
        TextoEsVenenosa.setBounds(20, 460, 150, 30);
        Venenosa.add(SiVenenosa);
        Venenosa.add(NoVenenosa);
        SiVenenosa.setBounds(160, 460, 50, 30);
        SiVenenosa.setBackground(new Color(211, 211, 211));
        NoVenenosa.setBounds(220, 460, 50, 30);
        NoVenenosa.setBackground(new Color(211, 211, 211));

        // Tamaño del Caparazón: Tortuga
        JLabel TextoTamanoCaparazon = new JLabel("<html>Tamaño del<br>Caparazón:</html>");
        TextoTamanoCaparazon.setFont(new Font("Tahoma", Font.BOLD, 14));
        TextoTamanoCaparazon.setBounds(20, 420, 200, 40);
        TamanoCaparazon.setBounds(140, 420, 300, 30);

        // Dieta Principal: Tortuga
        JLabel TextoDietaPrincipal = new JLabel("Dieta Principal:");
        TextoDietaPrincipal.setFont(new Font("Tahoma", Font.BOLD, 14));
        TextoDietaPrincipal.setBounds(20, 460, 150, 30);
        DietaPrincipal.setBounds(140, 460, 300, 30);

        VentanaRegistro.setVisible(true);
        VentanaRegistro.add(TextoInicioRegistro);
        VentanaRegistro.add(TextoAnimal);
        VentanaRegistro.add(Animal);
        VentanaRegistro.add(TextoNombre);
        VentanaRegistro.add(Nombre);
        VentanaRegistro.add(TextoEspecie);
        VentanaRegistro.add(Especie);
        VentanaRegistro.add(TextoSexo);
        VentanaRegistro.add(Masculino);
        VentanaRegistro.add(Femenino);
        VentanaRegistro.add(TextoRaza);
        VentanaRegistro.add(Raza);
        VentanaRegistro.add(TextoEstadoSalud);
        VentanaRegistro.add(EstadoSalud);
        VentanaRegistro.add(TextoEdad);
        VentanaRegistro.add(Edad);
        VentanaRegistro.add(TextoVacunado);
        VentanaRegistro.add(SiVacunado);
        VentanaRegistro.add(NoVacunado);
        VentanaRegistro.add(TextoFecha);
        VentanaRegistro.add(Fecha);
        VentanaRegistro.add(TextoNivelAdiestramiento);
        VentanaRegistro.add(NivelAdiestramiento);
        VentanaRegistro.add(TextoColorPelo);
        VentanaRegistro.add(ColorPelo);
        VentanaRegistro.add(TextoTamano);
        VentanaRegistro.add(Tamano);
        VentanaRegistro.add(TextoTipoDieta);
        VentanaRegistro.add(TipoDieta);
        VentanaRegistro.add(TextoNivelAgresividad);
        VentanaRegistro.add(NivelAgresividad);
        VentanaRegistro.add(TextoEstaEsterilizado);
        VentanaRegistro.add(SiEsterelizado);
        VentanaRegistro.add(NoEsterelizado);
        VentanaRegistro.add(TextoColorPlumas);
        VentanaRegistro.add(ColorPlumas);
        VentanaRegistro.add(TextoPuedeVolar);
        VentanaRegistro.add(SiVuela);
        VentanaRegistro.add(NoVuela);
        VentanaRegistro.add(TextoFrecuenciaAlimentacion);
        VentanaRegistro.add(FrecuenciaAlimentacion);
        VentanaRegistro.add(TextoEsVenenosa);
        VentanaRegistro.add(SiVenenosa);
        VentanaRegistro.add(NoVenenosa);
        VentanaRegistro.add(TextoTamanoCaparazon);
        VentanaRegistro.add(TamanoCaparazon);
        VentanaRegistro.add(DietaPrincipal);
        VentanaRegistro.add(TextoDietaPrincipal);
        VentanaRegistro.add(VolverMenu);

        TextoNivelAdiestramiento.setVisible(false);
        NivelAdiestramiento.setVisible(false);
        TextoColorPelo.setVisible(false);
        ColorPelo.setVisible(false);
        TextoTamano.setVisible(false);
        Tamano.setVisible(false);
        TextoTipoDieta.setVisible(false);
        TipoDieta.setVisible(false);
        TextoNivelAgresividad.setVisible(false);
        NivelAgresividad.setVisible(false);
        TextoEstaEsterilizado.setVisible(false);
        SiEsterelizado.setVisible(false);
        NoEsterelizado.setVisible(false);
        TextoColorPlumas.setVisible(false);
        ColorPlumas.setVisible(false);
        TextoPuedeVolar.setVisible(false);
        SiVuela.setVisible(false);
        NoVuela.setVisible(false);
        TextoFrecuenciaAlimentacion.setVisible(false);
        FrecuenciaAlimentacion.setVisible(false);
        TextoEsVenenosa.setVisible(false);
        SiVenenosa.setVisible(false);
        NoVenenosa.setVisible(false);
        TextoTamanoCaparazon.setVisible(false);
        TamanoCaparazon.setVisible(false);
        TextoDietaPrincipal.setVisible(false);
        DietaPrincipal.setVisible(false);

        Animal.addActionListener(e -> {
            String seleccionado = (String) Animal.getSelectedItem();
            TextoNivelAdiestramiento.setVisible(false);
            NivelAdiestramiento.setVisible(false);
            TextoColorPelo.setVisible(false);
            ColorPelo.setVisible(false);
            TextoTamano.setVisible(false);
            Tamano.setVisible(false);
            TextoTipoDieta.setVisible(false);
            TipoDieta.setVisible(false);
            TextoNivelAgresividad.setVisible(false);
            NivelAgresividad.setVisible(false);
            TextoEstaEsterilizado.setVisible(false);
            SiEsterelizado.setVisible(false);
            NoEsterelizado.setVisible(false);
            TextoColorPlumas.setVisible(false);
            ColorPlumas.setVisible(false);
            TextoPuedeVolar.setVisible(false);
            SiVuela.setVisible(false);
            NoVuela.setVisible(false);
            TextoFrecuenciaAlimentacion.setVisible(false);
            FrecuenciaAlimentacion.setVisible(false);
            TextoEsVenenosa.setVisible(false);
            SiVenenosa.setVisible(false);
            NoVenenosa.setVisible(false);
            TextoTamanoCaparazon.setVisible(false);
            TamanoCaparazon.setVisible(false);
            TextoDietaPrincipal.setVisible(false);
            DietaPrincipal.setVisible(false);

            switch (seleccionado) {
                case "Perro":
                    TextoNivelAdiestramiento.setVisible(true);
                    NivelAdiestramiento.setVisible(true);
                    TextoColorPelo.setVisible(true);
                    ColorPelo.setVisible(true);
                    break;
                case "Conejo":
                    TextoTamano.setVisible(true);
                    Tamano.setVisible(true);
                    TextoTipoDieta.setVisible(true);
                    TipoDieta.setVisible(true);
                    break;
                case "Gato":
                    TextoNivelAgresividad.setVisible(true);
                    NivelAgresividad.setVisible(true);
                    TextoEstaEsterilizado.setVisible(true);
                    SiEsterelizado.setVisible(true);
                    NoEsterelizado.setVisible(true);
                    break;
                case "Hamster":
                    TextoNivelAgresividad.setVisible(true);
                    NivelAgresividad.setVisible(true);
                    break;
                case "Loro":
                    TextoColorPlumas.setVisible(true);
                    ColorPlumas.setVisible(true);
                    TextoPuedeVolar.setVisible(true);
                    SiVuela.setVisible(true);
                    NoVuela.setVisible(true);
                    break;
                case "Serpiente":
                    TextoFrecuenciaAlimentacion.setVisible(true);
                    FrecuenciaAlimentacion.setVisible(true);
                    TextoEsVenenosa.setVisible(true);
                    SiVenenosa.setVisible(true);
                    NoVenenosa.setVisible(true);
                    break;
                case "Tortuga":
                    TextoTamanoCaparazon.setVisible(true);
                    TamanoCaparazon.setVisible(true);
                    TextoDietaPrincipal.setVisible(true);
                    DietaPrincipal.setVisible(true);
                    break;
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == VolverMenu) {
            VentanaRegistro.dispose();
            ConsolaMenu VentanaMenu = new ConsolaMenu();
        }
        if (e.getSource() == GuardarBoton) {
            Excepciones validador = new Excepciones(Nombre, Especie, Raza, EstadoSalud, Edad);
            if (validador.Error()) {
                // NO CONTINUAR
                return;
            }
            StringBuilder contenido = new StringBuilder();
            contenido.append("Registro creado exitosamente el " + Fecha.getText() + "\n");
            contenido.append("Registraste un " + Especie.getText() + " " + Raza.getText() + "\n");
            contenido.append("Su nombre es " + Nombre.getText() + " y tiene " + Edad.getText() + " años\n");
            contenido.append("Esta " + EstadoSalud.getText() + "\n");

            // LORO
            if (Animal.getSelectedIndex() == 0) {
                this.loro = new Loro();
                loro.setNombre(Nombre.getText());
                loro.setEspecie("Loro");
                if (Masculino.isSelected()) {
                    loro.setsexo("Masculino");
                    contenido.append("Es masculino\n");
                }
                if (Femenino.isSelected()) {
                    loro.setsexo("Femenino");
                    contenido.append("Es femenino\n");
                }
                loro.setRaza(Raza.getText());
                loro.setEstadoSalud(EstadoSalud.getText());
                loro.setEdad(Integer.parseInt(Edad.getText()));
                if (SiVacunado.isSelected()) {
                    loro.setEstaVacunado(true);
                    contenido.append("Tiene sus vacunas al dia\n");
                }
                if (NoVacunado.isSelected()) {
                    loro.setEstaVacunado(false);
                    contenido.append("Hay que aplicarle sus vacunas\n");
                }
                loro.setFecha(Fecha.getText());
                loro.setEstadoDisponibilidad("Disponible");
                loro.setColorPlumas(ColorPlumas.getText());
                contenido.append("Sus alas son de color " + ColorPlumas.getText() + "\n");
                if (SiVuela.isSelected()) {
                    loro.setPuedeVolar(true);
                    contenido.append("Puede volar\n");
                }
                if (NoVuela.isSelected()) {
                    loro.setPuedeVolar(false);
                    contenido.append("No puede volar, hay que cuidarlo bastante\n");
                }
                animalAgregar.agregarAnimal(loro, Fecha.getText());
            }
            // CONEJO
            if (Animal.getSelectedIndex() == 1) {
                this.conejo = new Conejo();
                conejo.setNombre(Nombre.getText());
                conejo.setEspecie("Conejo");
                if (Masculino.isSelected()) {
                    conejo.setsexo("Masculino");
                    contenido.append("Es masculino\n");
                }
                if (Femenino.isSelected()) {
                    conejo.setsexo("Femenino");
                    contenido.append("Es femenino\n");
                }
                conejo.setRaza(Raza.getText());
                conejo.setEstadoSalud(EstadoSalud.getText());
                conejo.setEdad(Integer.parseInt(Edad.getText()));
                if (SiVacunado.isSelected()) {
                    conejo.setEstaVacunado(true);
                    contenido.append("Tiene sus vacunas al dia\n");
                }
                if (NoVacunado.isSelected()) {
                    conejo.setEstaVacunado(false);
                    contenido.append("Hay que aplicarle sus vacunas\n");
                }
                conejo.setFecha(Fecha.getText());
                conejo.setEstadoDisponibilidad("Disponible");
                conejo.settamano(Tamano.getText());
                contenido.append("Su tamaño es " + Tamano.getText() + "\n");
                conejo.settipoDieta(TipoDieta.getText());
                contenido.append("Su dieta es " + TipoDieta.getText() + "\n");
                animalAgregar.agregarAnimal(conejo, Fecha.getText());
            }
            // GATO
            if (Animal.getSelectedIndex() == 2) {
                this.gato = new Gato();
                gato.setNombre(Nombre.getText());
                gato.setEspecie("Gato");
                if (Masculino.isSelected()) {
                    gato.setsexo("Masculino");
                    contenido.append("Es un masculino\n");
                }
                if (Femenino.isSelected()) {
                    gato.setsexo("Femenino");
                    contenido.append("Es un femenino\n");
                }
                gato.setRaza(Raza.getText());
                gato.setEstadoSalud(EstadoSalud.getText());
                gato.setEdad(Integer.parseInt(Edad.getText()));
                if (SiVacunado.isSelected()) {
                    gato.setEstaVacunado(true);
                    contenido.append("Tiene sus vacunas al dia\n");
                }
                if (NoVacunado.isSelected()) {
                    gato.setEstaVacunado(false);
                    contenido.append("Hay que aplicarle sus vacunas\n");
                }
                gato.setFecha(Fecha.getText());
                gato.setEstadoDisponibilidad("Disponible");
                gato.setnivelAgresividad(NivelAgresividad.getText());
                if (SiEsterelizado.isSelected()) {
                    gato.setestaEsterilizado(true);
                    contenido.append("Esta esterilizado\n");
                }
                if (NoEsterelizado.isSelected()) {
                    gato.setestaEsterilizado(false);
                    contenido.append("No esta esterilizado\n");
                }
                animalAgregar.agregarAnimal(gato, Fecha.getText());
            }
            // PERRO
            if (Animal.getSelectedIndex() == 3) {
                this.perro = new Perro();
                perro.setNombre(Nombre.getText());
                perro.setEspecie("Perro");
                if (Masculino.isSelected()) {
                    perro.setsexo("Masculino");
                    contenido.append("Es un masculino\n");
                }
                if (Femenino.isSelected()) {
                    perro.setsexo("Femenino");
                    contenido.append("Es un femenino\n");
                }
                perro.setRaza(Raza.getText());
                perro.setEstadoSalud(EstadoSalud.getText());
                perro.setEdad(Integer.parseInt(Edad.getText()));
                if (SiVacunado.isSelected()) {
                    perro.setEstaVacunado(true);
                    contenido.append("Tiene sus vacunas al dia\n");
                }
                if (NoVacunado.isSelected()) {
                    perro.setEstaVacunado(false);
                    contenido.append("Hay que aplicarle sus vacunas\n");
                }
                perro.setFecha(Fecha.getText());
                perro.setEstadoDisponibilidad("Disponible");
                perro.setnivelAdiestramiento(NivelAdiestramiento.getText());
                contenido.append(
                        "Su nivel de adiestramiento es " + NivelAdiestramiento.getText() + " y su pelo es de color "
                                + ColorPelo.getText() + "\n");
                perro.setcolorPelo(ColorPelo.getText());
                animalAgregar.agregarAnimal(perro, Fecha.getText());
            }
            // HAMSTER
            if (Animal.getSelectedIndex() == 4) {
                this.hamster = new Hamster();
                hamster.setNombre(Nombre.getText());
                hamster.setEspecie("Hamster");
                if (Masculino.isSelected()) {
                    hamster.setsexo("Masculino");
                    contenido.append("Es masculino\n");
                }
                if (Femenino.isSelected()) {
                    hamster.setsexo("Femenino");
                    contenido.append("Es femenino\n");
                }
                hamster.setRaza(Raza.getText());
                hamster.setEstadoSalud(EstadoSalud.getText());
                hamster.setEdad(Integer.parseInt(Edad.getText()));
                if (SiVacunado.isSelected()) {
                    hamster.setEstaVacunado(true);
                    contenido.append("Tiene sus vacunas al dia\n");
                }
                if (NoVacunado.isSelected()) {
                    hamster.setEstaVacunado(false);
                    contenido.append("Hay que aplicarle sus vacunas\n");
                }
                hamster.setFecha(Fecha.getText());
                hamster.setEstadoDisponibilidad("Disponible");
                hamster.setnivelAgresividad(NivelAgresividad.getText());
                contenido.append("Su nivel de agresividad es " + NivelAgresividad.getText() + "\n");
                animalAgregar.agregarAnimal(hamster, Fecha.getText());
            }
            // SERPIENTE
            if (Animal.getSelectedIndex() == 5) {
                this.serpiente = new Serpiente();
                serpiente.setNombre(Nombre.getText());
                serpiente.setEspecie("Serpiente");
                if (Masculino.isSelected()) {
                    serpiente.setsexo("Masculino");
                    contenido.append("Es masculino\n");
                }
                if (Femenino.isSelected()) {
                    serpiente.setsexo("Femenino");
                    contenido.append("Es femenino\n");
                }
                serpiente.setRaza(Raza.getText());
                serpiente.setEstadoSalud(EstadoSalud.getText());
                serpiente.setEdad(Integer.parseInt(Edad.getText()));
                if (SiVacunado.isSelected()) {
                    serpiente.setEstaVacunado(true);
                    contenido.append("Tiene sus vacunas al dia\n");
                }
                if (NoVacunado.isSelected()) {
                    serpiente.setEstaVacunado(false);
                    contenido.append("Hay que aplicarle sus vacunas\n");
                }
                serpiente.setFecha(Fecha.getText());
                serpiente.setEstadoDisponibilidad("Disponible");
                serpiente.setfrecuenciaAlimentacion(Integer.parseInt(FrecuenciaAlimentacion.getText()));
                contenido.append("Hay que alimentarla " + FrecuenciaAlimentacion.getText() + "\n");
                if (SiVenenosa.isSelected()) {
                    serpiente.setesVenenosa(true);
                    contenido.append("Es venenosa\n");
                }
                if (NoVenenosa.isSelected()) {
                    serpiente.setesVenenosa(false);
                    contenido.append("No es venenosa\n");
                }
                animalAgregar.agregarAnimal(serpiente, Fecha.getText());
            }
            if (Animal.getSelectedIndex() == 6) {
                this.tortuga = new Tortuga();
                tortuga.setNombre(Nombre.getText());
                tortuga.setEspecie("Tortuga");
                if (Masculino.isSelected()) {
                    tortuga.setsexo("Masculino");
                    contenido.append("Es un masculino\n");
                }
                if (Femenino.isSelected()) {
                    tortuga.setsexo("Femenino");
                    contenido.append("Es un femenino\n");
                }
                tortuga.setRaza(Raza.getText());
                tortuga.setEstadoSalud(EstadoSalud.getText());
                tortuga.setEdad(Integer.parseInt(Edad.getText()));
                if (SiVacunado.isSelected()) {
                    tortuga.setEstaVacunado(true);
                    contenido.append("Tiene sus vacunas al dia\n");
                }
                if (NoVacunado.isSelected()) {
                    tortuga.setEstaVacunado(false);
                    contenido.append("Hay que aplicarle sus vacunas\n");
                }
                tortuga.setFecha(Fecha.getText());
                tortuga.setEstadoDisponibilidad("Disponible");
                tortuga.settamanoCaparazon(Double.parseDouble(TamanoCaparazon.getText()));
                contenido.append("Su caparazon mide " + TamanoCaparazon.getText() + "\n");
                tortuga.setdietaPrincipal(DietaPrincipal.getText());
                contenido.append("Su dieta es " + DietaPrincipal.getText() + "\n");
                animalAgregar.agregarAnimal(tortuga, Fecha.getText());
            }

            String rutaArchivo = "C:\\Users\\matia\\OneDrive\\Documents\\Universidad\\Pensamiento Computacional\\Entrega Proyecto\\Recibos\\Registro_"
                    + Nombre.getText() + ".txt";
            ArchivoCreado.crearRecibo(rutaArchivo, contenido.toString());
        }
    }
}