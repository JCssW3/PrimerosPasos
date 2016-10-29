package graficos.componentes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class BarraHerramientas {

    public static void main(String[] args){

        MarcoHerramientas miMarco = new MarcoHerramientas();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miMarco.setVisible(true);

    }

}

class MarcoHerramientas extends JFrame{

    JPanel lamina;

    public MarcoHerramientas(){

        setBounds(100,100,400,500);
        setTitle("Barra de Herramientas");

        lamina = new JPanel();

        add(lamina);

        AccionColor accionAmarillo = new AccionColor("Amarillo", new ImageIcon("src/graficos/yellow ball.png"), Color.YELLOW);
        AccionColor accionAzul = new AccionColor("Azul", new ImageIcon("src/graficos/blue ball.png"), Color.BLUE);
        AccionColor accionRojo = new AccionColor("Rojo", new ImageIcon("src/graficos/red ball.png"), Color.RED);
        Action accionSalir = new AbstractAction("Salir", new ImageIcon("src/graficos/iconos/out.png")) {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        };


        JMenu menu = new JMenu("Color");

        menu.add(accionAmarillo);
        menu.add(accionAzul);
        menu.add(accionRojo);

        JMenuBar barraMenu = new JMenuBar();
        barraMenu.add(menu);

        setJMenuBar(barraMenu);

        // Construcción de la barra de herramientas

        JToolBar barra = new JToolBar();

        barra.add(accionAmarillo);
        barra.add(accionAzul);
        barra.add(accionRojo);
        barra.addSeparator();
        barra.add(accionSalir);

        add(barra, BorderLayout.NORTH);

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

            lamina.setBackground(c);

            System.out.println("Nombre: " + getValue(Action.NAME));
            System.out.println("Descripción: " + getValue(Action.SHORT_DESCRIPTION));

        }

    }

}