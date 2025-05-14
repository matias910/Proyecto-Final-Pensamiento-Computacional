import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import InformacionBasica.InformacionAnimal;
import InformacionBasica.Registros;
import javax.swing.JOptionPane;

public class ConsolaBuscador implements ActionListener {

    JFrame VentanaBuscador = new JFrame();
    JButton VolverMenu = new JButton("Volver");
    String[] Buscador = { "Por Especie", "Por Edad", "Por Estado de Salud", "Por Raza",
            "Por Estado de Disponibilidad" };
    JComboBox<String> ListaOpciones = new JComboBox<>(Buscador);
    JButton Buscar = new JButton("Buscar");
    JTextField BuscarTexto = new JTextField();
    Registros BuscadorFiltro;
    JComboBox<String> Resultados = new JComboBox<>();

    public ConsolaBuscador() {

        BuscadorFiltro = Registros.getInstancia();

        JLabel TextoInicioBusqueda = new JLabel("Busqueda de Animales");
        TextoInicioBusqueda.setFont(new Font("Tahoma", Font.BOLD, 24));
        TextoInicioBusqueda.setBounds(175, 0, 300, 50);

        JLabel TextoBuscar = new JLabel("Buscar Por: ");
        TextoBuscar.setFont(new Font("Tahoma", Font.BOLD, 14));
        TextoBuscar.setBounds(20, 70, 300, 50);

        ListaOpciones.setBounds(130, 80, 300, 30);

        Resultados.setBounds(130, 120, 300, 30);
        Resultados.setVisible(false);

        BuscarTexto.setBounds(450, 80, 120, 30);

        VolverMenu.setFont(new Font("Tahoma", Font.BOLD, 14));
        VolverMenu.setBounds(20, 120, 100, 60);
        VolverMenu.addActionListener(this);

        Buscar.setFont(new Font("Tahoma", Font.BOLD, 14));
        Buscar.setBounds(460, 120, 100, 60);
        Buscar.addActionListener(this);

        ImageIcon imagen = new ImageIcon("ImagenBusqueda.png");
        Image imagenEscalada = imagen.getImage().getScaledInstance(400, 400, Image.SCALE_SMOOTH);
        ImageIcon imagenFinal = new ImageIcon(imagenEscalada);

        JLabel Imagen = new JLabel();
        Imagen.setIcon(imagenFinal);
        Imagen.setBounds(85, 240, 450, 450);

        VentanaBuscador.setVisible(true);
        VentanaBuscador.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        VentanaBuscador.getContentPane().setBackground(new Color(211, 211, 211));
        VentanaBuscador.setSize(600, 750);
        VentanaBuscador.setResizable(false);
        VentanaBuscador.setLayout(null);

        VentanaBuscador.add(TextoInicioBusqueda);
        VentanaBuscador.add(VolverMenu);
        VentanaBuscador.add(Buscar);
        VentanaBuscador.add(BuscarTexto);
        VentanaBuscador.add(TextoBuscar);
        VentanaBuscador.add(ListaOpciones);
        VentanaBuscador.add(Resultados);
        VentanaBuscador.add(Imagen);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == VolverMenu) {
            VentanaBuscador.dispose();
            ConsolaMenu VentanaPrincipal = new ConsolaMenu();
        }
        if (e.getSource() == Buscar) {

            Resultados.setVisible(true);
            Resultados.removeAllItems();

            if (ListaOpciones.getSelectedIndex() == 0) {
                if (BuscadorFiltro.animales.isEmpty()) {
                    System.out.println("No hay animales de esta especie");
                } else {
                    for (InformacionAnimal animal : BuscadorFiltro.animales) {
                        if (BuscarTexto.getText().equals(animal.getEspecie())) {
                            Resultados.addItem(animal.getNombre());
                        }
                    }
                }
            }
            if (ListaOpciones.getSelectedIndex() == 1) {
                if (BuscadorFiltro.animales.isEmpty()) {
                    System.out.println("No hay animales de esta edad");
                } else {
                    for (InformacionAnimal animal : BuscadorFiltro.animales) {
                        if (Integer.parseInt(BuscarTexto.getText()) == animal.getEdad()) {
                            Resultados.addItem(animal.getNombre() + " - " + animal.getEspecie());
                        }
                    }
                }
            }
            if (ListaOpciones.getSelectedIndex() == 2) {
                if (BuscadorFiltro.animales.isEmpty()) {
                    System.out.println("No hay animales de este estado de salud");
                } else {
                    for (InformacionAnimal animal : BuscadorFiltro.animales) {
                        if (BuscarTexto.getText().equals(animal.getEstadoSalud())) {
                            Resultados.addItem(animal.getNombre() + " - " + animal.getEspecie());
                        }
                    }
                }
            }
            if (ListaOpciones.getSelectedIndex() == 3) {
                if (BuscadorFiltro.animales.isEmpty()) {
                    System.out.println("No hay animales de esta raza");
                } else {
                    for (InformacionAnimal animal : BuscadorFiltro.animales) {
                        if (BuscarTexto.getText().equals(animal.getRaza())) {
                            Resultados.addItem(animal.getNombre() + " - " + animal.getEspecie());
                        }
                    }
                }
            }
            if (ListaOpciones.getSelectedIndex() == 4) {
                if (BuscadorFiltro.animales.isEmpty()) {
                    System.out.println("No hay animales de esta especie");
                } else {
                    for (InformacionAnimal animal : BuscadorFiltro.animales) {
                        if (BuscarTexto.getText().equals(animal.getEstadoDisponibilidad())) {
                            Resultados.addItem(animal.getNombre() + " - " + animal.getEspecie());
                        }
                    }
                }
            }
        }
    }
}
