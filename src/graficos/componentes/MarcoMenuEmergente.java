package graficos.componentes;

import javax.swing.*;
import java.awt.*;

public class MarcoMenuEmergente {

    public static void main(String[] args) {

        MarcoMenuPopup miMarco = new MarcoMenuPopup();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}

class MarcoMenuPopup extends JFrame{

    public MarcoMenuPopup(){

        setBounds(100,100,400,500);
        setTitle("Marco con menú Pop Up");

        add(new LaminaMenuPopup());

        setVisible(true);

    }

}

class LaminaMenuPopup extends JPanel{

    public LaminaMenuPopup(){

        setLayout(new BorderLayout());

        JMenuBar miMenu = new JMenuBar();
            JMenu edicion = new JMenu("Edición");
                JMenuItem deshacer = new JMenuItem("Deshacer");
                JMenuItem rehacer = new JMenuItem("Rehacer");
                JMenuItem seleccionar = new JMenuItem("Seleccionar Todo");

        miMenu.add(edicion);
            edicion.add(deshacer);
            edicion.add(rehacer);
            edicion.add(seleccionar);

        add(miMenu, BorderLayout.NORTH);

        JPanel laminaTexto = new JPanel();
        JTextPane texto = new JTextPane();

        laminaTexto.setLayout(new BorderLayout());
        laminaTexto.add(texto);
        add(laminaTexto, BorderLayout.CENTER);

        JPopupMenu emergente = new JPopupMenu();

        JMenuItem opcion1 = new JMenuItem("Opción N°1");
        JMenuItem opcion2 = new JMenuItem("Opción N°2");
        JMenuItem opcion3 = new JMenuItem("Opción N°3");

        emergente.add(opcion1);
        emergente.add(opcion2);
        emergente.add(opcion3);

        texto.setComponentPopupMenu(emergente);

    }

}