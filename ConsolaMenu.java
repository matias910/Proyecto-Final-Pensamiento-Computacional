import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ConsolaMenu implements ActionListener {

    JFrame VentanaPrincipal = new JFrame();
    JLabel TextoInicio = new JLabel("Inicio");
    JButton BotonVentanaRegistro = new JButton("Registrar");
    JButton BotonVentanaAdoptar = new JButton("Adoptar");
    JButton BotonVentanaAcoger = new JButton("Acoger");
    JButton BotonBuscarPorFiltros = new JButton("Buscar por Filtros");

    public ConsolaMenu() {

        // TEXTO INICIO//
        TextoInicio.setText("Inicio");
        TextoInicio.setFont(new Font("Arial", Font.BOLD, 30));
        TextoInicio.setBounds(275, 0, 300, 100);

        // BOTON REGISTRO//
        BotonVentanaRegistro.setBounds(50, 100, 150, 50);
        BotonVentanaRegistro.addActionListener(this);

        // BOTON ADOPTAR//
        BotonVentanaAdoptar.setBounds(225, 100, 150, 50);
        BotonVentanaAdoptar.addActionListener(this);

        // BOTON ACOGER//
        BotonVentanaAcoger.setBounds(400, 100, 150, 50);
        BotonVentanaAcoger.addActionListener(this);

        // BOTON BUSCAR POR FILTRO//
        BotonBuscarPorFiltros.setBounds(200, 180, 200, 50);
        BotonBuscarPorFiltros.addActionListener(this);

        ImageIcon ImagenMenu = new ImageIcon("ImagenMenu.png");
        Image imagenEscalada = ImagenMenu.getImage().getScaledInstance(400, 400, Image.SCALE_SMOOTH);
        ImageIcon imagenFinal = new ImageIcon(imagenEscalada);

        JLabel Imagen = new JLabel();
        Imagen.setIcon(imagenFinal);
        Imagen.setBounds(85, 240, 450, 450);

        VentanaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        VentanaPrincipal.getContentPane().setBackground(new Color(211, 211, 211));
        VentanaPrincipal.setSize(600, 750);
        VentanaPrincipal.setResizable(false);
        VentanaPrincipal.setLayout(null);
        VentanaPrincipal.setVisible(true);
        VentanaPrincipal.add(TextoInicio);
        VentanaPrincipal.add(BotonVentanaRegistro);
        VentanaPrincipal.add(BotonVentanaAdoptar);
        VentanaPrincipal.add(BotonVentanaAcoger);
        VentanaPrincipal.add(BotonBuscarPorFiltros);
        VentanaPrincipal.add(Imagen);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == BotonVentanaRegistro) {
            VentanaPrincipal.dispose();
            ConsolaRegistro VentanaRegistro = new ConsolaRegistro();
        }
        if (e.getSource() == BotonVentanaAdoptar) {
            VentanaPrincipal.dispose();
            ConsolaAdoptar VentanaAdoptar = new ConsolaAdoptar();
        }
        if (e.getSource() == BotonVentanaAcoger) {
            VentanaPrincipal.dispose();
            ConsolaAcoger VentanaAcoger = new ConsolaAcoger();
        }
        if (e.getSource() == BotonBuscarPorFiltros) {
            VentanaPrincipal.dispose();
            ConsolaBuscador VentanaBuscador = new ConsolaBuscador();
        }
    }

}