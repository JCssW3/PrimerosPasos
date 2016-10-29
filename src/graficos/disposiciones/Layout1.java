package graficos.disposiciones;

import javax.swing.*;
import java.awt.*;

public class Layout1 {

    public static void main(String[] args) {

        MarcoLayout miMarco = new MarcoLayout();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        miMarco.setVisible(true);

    }

}

class MarcoLayout extends JFrame {

    public MarcoLayout() {

        setBounds(100, 100, 400, 400);
        setTitle("Layouts");

        add(new LaminaLayout(), BorderLayout.NORTH);
        add(new LaminaLayout2(), BorderLayout.SOUTH);

    }

}

class LaminaLayout extends JPanel {

    public LaminaLayout() {

        // FlowLayout(Disposición, espacio horizontal, espacio vertical)
        // -------------------------------------------------------------
        // FlowLayout disposicion = new FlowLayout(FlowLayout.LEFT);
        // miLamina.setLayout(disposicion);
        // -------------------------------------------------------------
        // setLayout(new FlowLayout(FlowLayout.LEFT, 15,15));

        setLayout(new FlowLayout(FlowLayout.LEFT));

        add(new JButton("Amarillo"));
        add(new JButton("Azul"));

    }

}

class LaminaLayout2 extends JPanel {

    public LaminaLayout2() {

        // Border Layout
        // Rellena cada una de sus zonas con los controles que tenga
        // ---------------------------------------------------------
        //                         NORTH
        // ---------------------------------------------------------
        //       |                                           |
        //       |                                           |
        //  WEST |                 CENTER                    | EAST
        //       |                                           |
        //       |                                           |
        // ---------------------------------------------------------
        //                         SOUTH
        // ---------------------------------------------------------

        setLayout(new BorderLayout());

        add(new JButton("Rojo"), BorderLayout.WEST);
        add(new JButton("Verde"), BorderLayout.EAST);
        add(new JButton("Negro"), BorderLayout.CENTER);

    }

}