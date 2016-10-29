package graficos.componentes;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class MarcoSliders {

    public static void main(String[] args) {

        MarcoSlider miMarco = new MarcoSlider();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}

class MarcoSlider extends JFrame{

    public MarcoSlider(){

        setBounds(100, 100, 400,300);
        setTitle("Prueba JSilders");

        add(new LaminaSlider());

        setVisible(true);

    }

}

class LaminaSlider extends JPanel{

    private JLabel rotulo;
    private JSlider control;

    public LaminaSlider(){

        setLayout(new BorderLayout());

        rotulo = new JLabel("En un lugar de la Mancha de cuyo nombre...");
        rotulo.setHorizontalAlignment(SwingConstants.CENTER);
        add(rotulo, BorderLayout.CENTER);

        JPanel laminaSlider = new JPanel();

        control = new JSlider(8,48,12);
        // control.setOrientation(SwingConstants.VERTICAL);

        // Define las marcas, las mayores y las menores
        control.setMajorTickSpacing(20);
        control.setMinorTickSpacing(5);

        // Pinta las marcas previamente definidas
        control.setPaintTicks(true);

        // Pinta el texto de las marcas mayores
        control.setPaintLabels(true);

        // Pega el selector a las marcas (menores o mayores)
        control.setSnapToTicks(true);

        control.setFont(new Font("SanSerif", Font.ITALIC, 10));

        control.addChangeListener(new EventoSlider());

        laminaSlider.add(control);

        add(laminaSlider, BorderLayout.NORTH);

    }

    private class EventoSlider implements ChangeListener{

        @Override
        public void stateChanged(ChangeEvent e) {

            rotulo.setFont(new Font("SanSerif", Font.PLAIN, control.getValue()));

        }
    }

}