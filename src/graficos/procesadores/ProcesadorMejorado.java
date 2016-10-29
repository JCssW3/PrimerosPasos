package graficos.procesadores;

import javax.swing.*;
import javax.swing.text.StyledEditorKit;
import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class ProcesadorMejorado {

    public static void main(String[] args) {

        MarcoProcesador2 miMarco = new MarcoProcesador2();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}

class MarcoProcesador2 extends JFrame {

    public MarcoProcesador2() {

        setBounds(100, 100, 500, 400);
        setTitle("Procesador Precario");

        add(new LaminaProcesador2());

        setVisible(true);

    }

}

class LaminaProcesador2 extends JPanel {

    // TODO: Documentar correctamente este ejemplo!!!

    private JToolBar barra;

    public LaminaProcesador2() {

        setLayout(new BorderLayout());

        JPanel laminaMenu = new JPanel();
        // Le asigno disposición BorderLayout para que lo estire
        laminaMenu.setLayout(new BorderLayout());

        JMenuBar jmbMenu = new JMenuBar();
        //---------------------------------------------------------//
        JMenu jmFuente = new JMenu("Fuente");
        JMenu jmEstilo = new JMenu("Estilo");
        JMenu jmTamano = new JMenu("Tamaño");

        // Creo los elementos del menú mediante la llamada al método configuraMenú
        // Fuentes:
        configuraMenu("Arial", jmFuente, "Arial", 9, 10, "");
        configuraMenu("Courier", jmFuente, "Courier", 9, 10, "");
        configuraMenu("Verdana", jmFuente, "Verdana", 9, 10, "");

        // Formatos:
        configuraMenu("Negrita", jmEstilo, "", Font.BOLD, 1, "src/graficos/iconos/bold.png");
        configuraMenu("Cursiva", jmEstilo, "", Font.ITALIC, 1, "src/graficos/iconos/italic.png");

        // Creo un grupo de botones para permitir el correcto funcionamiento de los JRadioButtons
        ButtonGroup bgpTamano = new ButtonGroup();

        // Tamaños:
        JRadioButtonMenuItem doce = new JRadioButtonMenuItem("12");
        JRadioButtonMenuItem catorce = new JRadioButtonMenuItem("14");
        JRadioButtonMenuItem dieciseis = new JRadioButtonMenuItem("16");
        JRadioButtonMenuItem dieciocho = new JRadioButtonMenuItem("18");

        // Los pongo a la escucha del StyledEditorKit
        doce.addActionListener(new StyledEditorKit.FontSizeAction("doce", 12));
        catorce.addActionListener(new StyledEditorKit.FontSizeAction("catorce", 14));
        dieciseis.addActionListener(new StyledEditorKit.FontSizeAction("dieciseis", 16));
        dieciocho.addActionListener(new StyledEditorKit.FontSizeAction("dieciocho", 18));

        // Le asigno un atajo de teclado
        dieciocho.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, InputEvent.CTRL_DOWN_MASK));

        // Los agrego al grupo...
        bgpTamano.add(doce);
        bgpTamano.add(catorce);
        bgpTamano.add(dieciseis);
        bgpTamano.add(dieciocho);

        // Y luego los agrego al menú tamaño
        jmTamano.add(doce);
        jmTamano.add(catorce);
        jmTamano.add(dieciseis);
        jmTamano.add(dieciocho);

        // Agrego los menús a la barra de menús, y luego esta a la lamina y la lamina a la lamina contenedora
        jmbMenu.add(jmFuente);
        jmbMenu.add(jmEstilo);
        jmbMenu.add(jmTamano);

        laminaMenu.add(jmbMenu);
        add(laminaMenu, BorderLayout.NORTH);

        // Agrego el área de texto
        JTextPane miArea = new JTextPane();
        add(miArea, BorderLayout.CENTER);

        // Creo el menú emergente, las opciones y las pongo a la escucha
        JPopupMenu emergente = new JPopupMenu();

        JMenuItem negritaE = new JMenuItem("Negrita", new ImageIcon("src/graficos/iconos/bold.png"));
        JMenuItem cursivaE = new JMenuItem("Cursiva", new ImageIcon("src/graficos/iconos/italic.png"));

        negritaE.addActionListener(new StyledEditorKit.BoldAction());
        cursivaE.addActionListener(new StyledEditorKit.ItalicAction());

        emergente.add(negritaE);
        emergente.add(cursivaE);

        // Agrego el menú emergente al área de texto
        miArea.setComponentPopupMenu(emergente);

        // Creo una barra de herramientas
        barra = new JToolBar();

        // Creo los botones de la barra mediante la llamada al método configuraBarra y al devolverne un botón
        // lo pongo a la escucha del método correspondiente
        configuraBarra("src/graficos/iconos/bold.png").addActionListener(new StyledEditorKit.BoldAction());
        configuraBarra("src/graficos/iconos/italic.png").addActionListener(new StyledEditorKit.ItalicAction());
        configuraBarra("src/graficos/iconos/underline.png").addActionListener(new StyledEditorKit.UnderlineAction());

        barra.addSeparator();

        configuraBarra("src/graficos/iconos/blue.png").addActionListener(new StyledEditorKit.ForegroundAction("azul", Color.BLUE));
        configuraBarra("src/graficos/iconos/yellow.png").addActionListener(new StyledEditorKit.ForegroundAction("amarillo", Color.YELLOW));
        configuraBarra("src/graficos/iconos/red.png").addActionListener(new StyledEditorKit.ForegroundAction("rojo", Color.RED));

        barra.addSeparator();

        configuraBarra("src/graficos/iconos/left.png").addActionListener(new StyledEditorKit.AlignmentAction("izquierda", 0));
        configuraBarra("src/graficos/iconos/center.png").addActionListener(new StyledEditorKit.AlignmentAction("centro", 1));
        configuraBarra("src/graficos/iconos/right.png").addActionListener(new StyledEditorKit.AlignmentAction("derecha", 2));
        configuraBarra("src/graficos/iconos/justify.png").addActionListener(new StyledEditorKit.AlignmentAction("justificado", 3));

        // Pongo la barra de manera vertical y la agrego a la lamina contenedora
        barra.setOrientation(SwingConstants.VERTICAL);

        add(barra, BorderLayout.WEST);

    }

    public JButton configuraBarra(String ruta) {

        JButton boton = new JButton(new ImageIcon(ruta));
        barra.add(boton);

        return boton;

    }


    private void configuraMenu(String rotulo, JMenu menu, String tipoLetra, int estilos, int tamano, String icono) {

        // Creo los items del menú mediante los parámetros pasados por el método
        JMenuItem jmiItem = new JMenuItem(rotulo, new ImageIcon(icono));
        jmiItem.setFont(new Font("Dialog", Font.PLAIN, 12));
        menu.add(jmiItem);

        // Según el texto del menú lo pongo a la escucha
        switch (menu.getText()) {

            case "Fuente":
                jmiItem.addActionListener(new StyledEditorKit.FontFamilyAction(rotulo, rotulo));
                break;

            case "Estilo":
                if (rotulo.equals("Negrita")) {
                    jmiItem.addActionListener(new StyledEditorKit.BoldAction());
                    jmiItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_DOWN_MASK));
                } else if (rotulo.equals("Cursiva")) {
                    jmiItem.addActionListener(new StyledEditorKit.ItalicAction());
                    jmiItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_K, InputEvent.CTRL_DOWN_MASK));
                }
                break;
        }

    }

}