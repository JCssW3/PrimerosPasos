package graficos.componentes;

import javax.swing.*;
import java.awt.*;

public class PruebaMenus {

    public static void main(String[] args) {

        MarcoMenus miMarco = new MarcoMenus();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}

class MarcoMenus extends JFrame{

    public MarcoMenus(){

        setBounds(100,100,400,300);
        setTitle("Probando los menús");

        add(new LaminaMenus());

        setVisible(true);

    }

}

class LaminaMenus extends JPanel{

    public LaminaMenus(){

        setLayout(new BorderLayout());

        JSlider miSlider = new JSlider(0, 100);
        // miSlider.setOrientation(SwingConstants.VERTICAL);

        JMenuBar miBarra = new JMenuBar();

        JMenu jmArchivo = new JMenu("Archivo");
        JMenu jmEdicion = new JMenu("Edición");
            JMenu jmOpciones = new JMenu("Opciones");
        JMenu jmHerramientas = new JMenu("Herramientas");

        JMenuItem jmiGuardar = new JMenuItem("Guardar");
        JMenuItem jmiGuardarComo = new JMenuItem("Guardar como");

        JMenuItem jmiCortar = new JMenuItem("Cortar", new ImageIcon("src/graficos/iconos/cut.png"));
        JMenuItem jmiCopiar = new JMenuItem("Copiar", new ImageIcon("src/graficos/iconos/copy.png"));
        JMenuItem jmiPegar = new JMenuItem("Pegar", new ImageIcon("src/graficos/iconos/paste.png"));

        jmiCopiar.setHorizontalTextPosition(SwingConstants.LEFT);

        JMenuItem jmiOpcion1 = new JMenuItem("Opción 1");
        JMenuItem jmiOpcion2 = new JMenuItem("Opción 2");

        JMenuItem jmiGenerales = new JMenuItem("Generales");

        miBarra.add(jmArchivo);
            jmArchivo.add(jmiGuardar);
            jmArchivo.add(jmiGuardarComo);
        miBarra.add(jmEdicion);
            jmEdicion.add(jmiCortar);
            jmEdicion.add(jmiCopiar);
            jmEdicion.add(jmiPegar);
            jmEdicion.addSeparator();
            jmEdicion.add(jmOpciones);
                jmOpciones.add(jmiOpcion1);
                jmOpciones.add(jmiOpcion2);
                jmOpciones.add(miSlider);
        miBarra.add(jmHerramientas);
            jmHerramientas.add(jmiGenerales);

        add(miBarra, BorderLayout.NORTH);

    }

}