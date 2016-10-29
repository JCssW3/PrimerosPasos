package graficos.eventos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class PruebaAcciones {

    public static void main(String[] args) {

        MarcoAcciones miMarco = new MarcoAcciones();

        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}

class MarcoAcciones extends JFrame {

    public MarcoAcciones() {

        setBounds(100, 100, 500, 400);
        setTitle("Acciones múltiples");

        add(new LaminaAcciones());

        setVisible(true);
    }

}

class LaminaAcciones extends JPanel {

    public LaminaAcciones() {

        /*
        JButton botonAmarillo = new JButton("Amarillo");
        JButton botonAzul = new JButton("Azul");
        JButton botonRojo = new JButton("Rojo");
        */

        AccionColor accionAmarillo = new AccionColor("Amarillo", new ImageIcon("src/graficos/yellow ball.png"), Color.YELLOW);
        AccionColor accionAzul = new AccionColor("Azul", new ImageIcon("src/graficos/blue ball.png"), Color.BLUE);
        AccionColor accionRojo = new AccionColor("Rojo", new ImageIcon("src/graficos/red ball.png"), Color.RED);

        // JButton botonAmarillo = new JButton(accionAmarillo);

        add(new JButton(accionAmarillo));
        add(new JButton(accionAzul));
        add(new JButton(accionRojo));

        // InputMap: Proporciona un vínculo entre un evento y un objeto MapStroke
        // WHEN_IN_FOCUSED_WINDOW : Cuando el componente está en la ventana que tiene el foco
        // WHEN_FOCUSED : Cuando el objeto tiene el foco
        // WHEN_ANCESTOR_OF_FOCUSED_COMPONENT : Cuando el elemento esta contenido dentro del elemento padre que tiene el foco
        InputMap mapaEntrada = getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);

        // KeyStroke teclaAmarillo = KeyStroke.getKeyStroke("ctrl A");

        mapaEntrada.put(KeyStroke.getKeyStroke("ctrl A"), "fondoAmarillo");
        mapaEntrada.put(KeyStroke.getKeyStroke("ctrl B"), "fondoAzul");
        mapaEntrada.put(KeyStroke.getKeyStroke("ctrl R"), "fondoRojo");

        ActionMap mapaAccion = getActionMap();

        // Agrega un vínculo entre la combinación de teclas y la acción
        mapaAccion.put("fondoAmarillo", accionAmarillo);
        mapaAccion.put("fondoAzul", accionAzul);
        mapaAccion.put("fondoRojo", accionRojo);

    }

    public void paintComponents(Graphics g) {

        super.paintComponents(g);

    }

    private class AccionColor extends AbstractAction {

        // Cuando suceda un evento este va a contener los siguientes
        // valores en formato Key:Value - Clave:Valor
        public AccionColor(String nombre, Icon icono, Color colorBoton) {

            putValue(Action.NAME, nombre);
            putValue(Action.SMALL_ICON, icono);
            putValue(Action.SHORT_DESCRIPTION, "Poner la lámina de color " + nombre);
            putValue("colorDeFondo", colorBoton);

        }

        @Override
        public void actionPerformed(ActionEvent e) {

            Color c = (Color) getValue("colorDeFondo");

            setBackground(c);

            System.out.println("Nombre: " + getValue(Action.NAME));
            System.out.println("Descripción: " + getValue(Action.SHORT_DESCRIPTION));

        }

    }

}

