
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

import InformacionBasica.Perro;
import InformacionBasica.Gato;
import InformacionBasica.Hamster;
import InformacionBasica.Conejo;
import InformacionBasica.Hamster;
import InformacionBasica.Loro;
import InformacionBasica.Serpiente;
import InformacionBasica.Tortuga;
import InformacionBasica.Registros;

public class ConsolaAcoger implements ActionListener {

    public Perro perro = new Perro(null, null, null, null, null, 0, false, null, null, null, null);
    public Gato gato = new Gato(null, null, null, null, null, 0, false, null, null, null, false);
    public Conejo conejo = new Conejo(null, null, null, null, null, 0, false, null, null, null, null);
    public Hamster hamster = new Hamster(null, null, null, null, null, 0, false, null, null, null);
    public Loro loro = new Loro(null, null, null, null, null, 0, false, null, null, null, false);
    public Serpiente serpiente = new Serpiente(null, null, null, null, null, 0, false, null, null, 0, false);
    public Tortuga tortuga = new Tortuga(null, null, null, null, null, 0, false, null, null, 0, null);
    public Registros animalAgregar;
    public Archivos ArchivoCreado;

    JFrame VentanaAcoger = new JFrame();
    JButton GuardarBoton = new JButton("<html>Guardar<br>Acogida</html>");
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
    JTextField CuantosDias = new JTextField();
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

    public ConsolaAcoger() {

        animalAgregar = Registros.getInstancia();
        ArchivoCreado = new Archivos();

        VentanaAcoger.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        VentanaAcoger.getContentPane().setBackground(new Color(211, 211, 211));
        VentanaAcoger.setSize(600, 750);
        VentanaAcoger.setResizable(false);
        VentanaAcoger.setLayout(null);

        JLabel TextoInicio = new JLabel("Acogida de animales");
        TextoInicio.setFont(new Font("Tahoma", Font.BOLD, 24));
        TextoInicio.setBounds(175, 0, 300, 50);

        JLabel TextoAnimal = new JLabel("Que animal vas a acoger: ");
        TextoAnimal.setFont(new Font("Tahoma", Font.BOLD, 14));
        TextoAnimal.setBounds(20, 60, 200, 30);
        Animal.setBounds(250, 60, 150, 30);

        GuardarBoton.setFont(new Font("Tahoma", Font.BOLD, 14));
        GuardarBoton.setBounds(150, 570, 100, 60);
        GuardarBoton.addActionListener(this);
        VentanaAcoger.add(GuardarBoton);

        VolverMenu.setFont(new Font("Tahoma", Font.BOLD, 14));
        VolverMenu.setBounds(300, 570, 100, 60);
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
        TextoNivelAdiestramiento.setBounds(20, 460, 300, 30);
        NivelAdiestramiento.setBounds(140, 460, 300, 30);

        // ColorPelo: Perros
        JLabel TextoColorPelo = new JLabel("<html>Color de<br>Pelo:</html>");
        TextoColorPelo.setFont(new Font("Tahoma", Font.BOLD, 14));
        TextoColorPelo.setBounds(20, 500, 300, 30);
        ColorPelo.setBounds(140, 500, 300, 30);

        // Tamano: Conejo
        JLabel TextoTamano = new JLabel("Tamaño:");
        TextoTamano.setFont(new Font("Tahoma", Font.BOLD, 14));
        TextoTamano.setBounds(20, 460, 100, 30);
        Tamano.setBounds(140, 460, 300, 30);

        // Dieta Conejo
        JLabel TextoTipoDieta = new JLabel("Tipo de Dieta:");
        TextoTipoDieta.setFont(new Font("Tahoma", Font.BOLD, 14));
        TextoTipoDieta.setBounds(20, 500, 150, 30);
        TipoDieta.setBounds(140, 500, 300, 30);

        // Nivel Agresividad Gato y Hamster
        JLabel TextoNivelAgresividad = new JLabel("<html>Nivel de<br>Agresividad:</html>");
        TextoNivelAgresividad.setFont(new Font("Tahoma", Font.BOLD, 14));
        TextoNivelAgresividad.setBounds(20, 460, 300, 40);
        NivelAgresividad.setBounds(140, 460, 300, 30);

        // Esterilizado Gato
        JLabel TextoEstaEsterilizado = new JLabel("Esterelizado?");
        TextoEstaEsterilizado.setFont(new Font("Tahoma", Font.BOLD, 14));
        TextoEstaEsterilizado.setBounds(20, 500, 150, 30);
        Esterelizado.add(SiEsterelizado);
        Esterelizado.add(NoEsterelizado);
        SiEsterelizado.setBounds(160, 460, 50, 30);
        SiEsterelizado.setBackground(new Color(211, 211, 211));
        NoEsterelizado.setBounds(220, 460, 50, 30);
        NoEsterelizado.setBackground(new Color(211, 211, 211));

        // Color plumas Loro
        JLabel TextoColorPlumas = new JLabel("<html>Color de<br>las Plumas:</html>");
        TextoColorPlumas.setFont(new Font("Tahoma", Font.BOLD, 14));
        TextoColorPlumas.setBounds(20, 460, 300, 40);
        ColorPlumas.setBounds(140, 460, 300, 30);

        // Puede volar Loro
        JLabel TextoPuedeVolar = new JLabel("Puede Volar?");
        TextoPuedeVolar.setFont(new Font("Tahoma", Font.BOLD, 14));
        TextoPuedeVolar.setBounds(20, 500, 150, 30);
        PuedeVolar.add(SiVuela);
        PuedeVolar.add(NoVuela);
        SiVuela.setBounds(160, 460, 50, 30);
        SiVuela.setBackground(new Color(211, 211, 211));
        NoVuela.setBounds(220, 460, 50, 30);
        NoVuela.setBackground(new Color(211, 211, 211));

        // Frecuencia de Alimentación: Serpiente
        JLabel TextoFrecuenciaAlimentacion = new JLabel("<html>Frecuencia de<br>Alimentación:</html>");
        TextoFrecuenciaAlimentacion.setFont(new Font("Tahoma", Font.BOLD, 14));
        TextoFrecuenciaAlimentacion.setBounds(20, 460, 200, 40);
        FrecuenciaAlimentacion.setBounds(140, 460, 300, 30);

        // Es venenosa Serpiente
        JLabel TextoEsVenenosa = new JLabel("Es Venenosa?");
        TextoEsVenenosa.setFont(new Font("Tahoma", Font.BOLD, 14));
        TextoEsVenenosa.setBounds(20, 500, 150, 30);
        Venenosa.add(SiVenenosa);
        Venenosa.add(NoVenenosa);
        SiVenenosa.setBounds(160, 500, 50, 30);
        SiVenenosa.setBackground(new Color(211, 211, 211));
        NoVenenosa.setBounds(220, 500, 50, 30);
        NoVenenosa.setBackground(new Color(211, 211, 211));

        // Tamaño del Caparazón: Tortuga
        JLabel TextoTamanoCaparazon = new JLabel("<html>Tamaño del<br>Caparazón:</html>");
        TextoTamanoCaparazon.setFont(new Font("Tahoma", Font.BOLD, 14));
        TextoTamanoCaparazon.setBounds(20, 460, 200, 40);
        TamanoCaparazon.setBounds(140, 460, 300, 30);

        // Dieta Principal: Tortuga
        JLabel TextoDietaPrincipal = new JLabel("Dieta Principal:");
        TextoDietaPrincipal.setFont(new Font("Tahoma", Font.BOLD, 14));
        TextoDietaPrincipal.setBounds(20, 500, 150, 30);
        DietaPrincipal.setBounds(140, 500, 300, 30);

        JLabel TextoCuantosDias = new JLabel("Cuantos dias:");
        TextoCuantosDias.setFont(new Font("Tahoma", Font.BOLD, 14));
        TextoCuantosDias.setBounds(20, 420, 150, 30);
        CuantosDias.setBounds(140, 420, 300, 30);

        VentanaAcoger.setVisible(true);
        VentanaAcoger.add(TextoInicio);
        VentanaAcoger.add(TextoAnimal);
        VentanaAcoger.add(Animal);
        VentanaAcoger.add(TextoNombre);
        VentanaAcoger.add(Nombre);
        VentanaAcoger.add(TextoEspecie);
        VentanaAcoger.add(Especie);
        VentanaAcoger.add(TextoSexo);
        VentanaAcoger.add(Masculino);
        VentanaAcoger.add(Femenino);
        VentanaAcoger.add(Masculino);
        VentanaAcoger.add(Femenino);
        VentanaAcoger.add(TextoRaza);
        VentanaAcoger.add(Raza);
        VentanaAcoger.add(TextoEstadoSalud);
        VentanaAcoger.add(EstadoSalud);
        VentanaAcoger.add(TextoEdad);
        VentanaAcoger.add(Edad);
        VentanaAcoger.add(TextoVacunado);
        VentanaAcoger.add(SiVacunado);
        VentanaAcoger.add(NoVacunado);
        VentanaAcoger.add(TextoFecha);
        VentanaAcoger.add(TextoFecha);
        VentanaAcoger.add(Fecha);
        VentanaAcoger.add(TextoNivelAdiestramiento);
        VentanaAcoger.add(NivelAdiestramiento);
        VentanaAcoger.add(TextoColorPelo);
        VentanaAcoger.add(ColorPelo);
        VentanaAcoger.add(TextoTamano);
        VentanaAcoger.add(Tamano);
        VentanaAcoger.add(TextoTipoDieta);
        VentanaAcoger.add(TipoDieta);
        VentanaAcoger.add(TextoNivelAgresividad);
        VentanaAcoger.add(NivelAgresividad);
        VentanaAcoger.add(TextoEstaEsterilizado);
        VentanaAcoger.add(SiEsterelizado);
        VentanaAcoger.add(NoEsterelizado);
        VentanaAcoger.add(TextoColorPlumas);
        VentanaAcoger.add(ColorPlumas);
        VentanaAcoger.add(TextoPuedeVolar);
        VentanaAcoger.add(SiVuela);
        VentanaAcoger.add(NoVuela);
        VentanaAcoger.add(TextoFrecuenciaAlimentacion);
        VentanaAcoger.add(FrecuenciaAlimentacion);
        VentanaAcoger.add(TextoEsVenenosa);
        VentanaAcoger.add(SiVenenosa);
        VentanaAcoger.add(NoVenenosa);
        VentanaAcoger.add(TextoTamanoCaparazon);
        VentanaAcoger.add(TamanoCaparazon);
        VentanaAcoger.add(DietaPrincipal);
        VentanaAcoger.add(TextoDietaPrincipal);
        VentanaAcoger.add(TextoCuantosDias);
        VentanaAcoger.add(CuantosDias);
        VentanaAcoger.add(VolverMenu);

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
            VentanaAcoger.dispose();
            ConsolaMenu VentanaMenu = new ConsolaMenu();
        }
        if (e.getSource() == GuardarBoton) {
            Excepciones validador = new Excepciones(Nombre, Especie, Raza, EstadoSalud, Edad);
            if (validador.Error()) {
                // NO CONTINUAR
                return;
            }

            StringBuilder contenido = new StringBuilder();
            contenido.append("Acogida registrada exitosamente el" + Fecha.getText() + "\n");
            contenido.append("Acogise exitosamente a " + Nombre.getText() + " el " + Fecha.getText() + "\n");
            contenido.append(
                    "Vas a quedarte con " + Nombre.getText() + " por " + CuantosDias.getText() + " dias" + "\n");
            contenido.append("Registraste un " + Especie.getText() + " " + Raza.getText() + "\n");
            contenido.append("Tiene " + Edad.getText() + " años\n");
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
                loro.setEstadoDisponibilidad("Acogido");
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
                animalAgregar.registrarAcogida(Nombre.getText(), CuantosDias.getText(), Fecha.getText());
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
                conejo.setEstadoDisponibilidad("Acogido");
                conejo.settamano(Tamano.getText());
                contenido.append("Su tamaño es " + Tamano.getText() + "\n");
                conejo.settipoDieta(TipoDieta.getText());
                contenido.append("Su dieta es " + TipoDieta.getText() + "\n");
                conejo.settipoDieta(TipoDieta.getText());
                animalAgregar.agregarAnimal(conejo, Fecha.getText());
                animalAgregar.registrarAcogida(conejo.getNombre(), CuantosDias.getText(), conejo.getFecha());
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
                gato.setEstadoDisponibilidad("Acogido");
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
                animalAgregar.registrarAcogida(gato.getNombre(), CuantosDias.getText(), gato.getFecha());
            }
            // PERRO//
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
                perro.setEstadoDisponibilidad("Adoptado");
                perro.setnivelAdiestramiento(NivelAdiestramiento.getText());
                contenido.append("Su nivel de adiestramiento es " + NivelAdiestramiento.getText() + " y es de color "
                        + ColorPelo.getText() + "\n");
                perro.setcolorPelo(ColorPelo.getText());
                animalAgregar.agregarAnimal(perro, Fecha.getText());
                animalAgregar.registrarAcogida(perro.getNombre(), CuantosDias.getText(), perro.getFecha());
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
                hamster.setEstadoDisponibilidad("Acogido");
                hamster.setnivelAgresividad(NivelAgresividad.getText());
                contenido.append("Su nivel de agresividad es " + NivelAgresividad.getText() + "\n");
                animalAgregar.agregarAnimal(hamster, Fecha.getText());
                animalAgregar.registrarAcogida(hamster.getNombre(), CuantosDias.getText(), hamster.getFecha());
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
                serpiente.setEstadoDisponibilidad("Acogido");
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
                animalAgregar.registrarAcogida(Nombre.getText(), CuantosDias.getText(), Fecha.getText());
            }
            // TORTUGA
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
                tortuga.setEstadoDisponibilidad("Acogido");
                tortuga.settamanoCaparazon(Double.parseDouble(TamanoCaparazon.getText()));
                contenido.append("Su caparazon mide " + TamanoCaparazon.getText() + "\n");
                tortuga.setdietaPrincipal(DietaPrincipal.getText());
                contenido.append("Su dieta es " + DietaPrincipal.getText() + "\n");
                animalAgregar.agregarAnimal(tortuga, Fecha.getText());
                animalAgregar.registrarAcogida(tortuga.getNombre(), CuantosDias.getText(), tortuga.getFecha());
            }

            String rutaArchivo = "C:\\Users\\matia\\OneDrive\\Documents\\Universidad\\Pensamiento Computacional\\Entrega Proyecto\\Recibos\\Acogida_"
                    + Nombre.getText() + ".txt";
            ArchivoCreado.crearRecibo(rutaArchivo, contenido.toString());
        }
    }
}