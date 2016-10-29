package graficos.componentes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PruebaComboBox {

    public static void main(String[] args) {

        MarcoCombo miMarco = new MarcoCombo();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}

class MarcoCombo extends JFrame{

    public MarcoCombo(){

        setBounds(100,100,400,300);
        setTitle("Prueba Combo Box");

        add(new LaminaCombo());

        setVisible(true);

    }

}

class LaminaCombo extends JPanel{

    private JLabel texto;
    private JComboBox miCombo;

    public LaminaCombo(){

        setLayout(new BorderLayout());

        texto = new JLabel("En un lugar de la Mancha de cuyo nombre...");
        texto.setFont(new Font("Serif", Font.PLAIN, 18));
        texto.setHorizontalAlignment(SwingConstants.CENTER);

        add(texto, BorderLayout.CENTER);

        JPanel LaminaNorte = new JPanel();

        miCombo = new JComboBox();
        miCombo.setEditable(true);

        miCombo.addItem("Serif");
        miCombo.addItem("SansSerif");
        miCombo.addItem("Monospaced");
        miCombo.addItem("Dialog");

        miCombo.addActionListener(new EventoCombo());

        LaminaNorte.add(miCombo);

        add(LaminaNorte, BorderLayout.NORTH);

    }

    private class EventoCombo implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {

            texto.setFont(new Font((String)miCombo.getSelectedItem(), Font.PLAIN, 18));

        }
    }

}