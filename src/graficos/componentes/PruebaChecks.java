package graficos.componentes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PruebaChecks {

    public static void main( String [] args) {

        MarcoChecks miMarco = new MarcoChecks();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miMarco.setVisible(true);

    }

}

class MarcoChecks extends JFrame{

    public MarcoChecks(){

        setBounds(100,100,400,300);
        setTitle("Prueba Checks Boxes");

        add(new LaminaChecks());

    }

}

class LaminaChecks extends JPanel{

    private JLabel txtTexto;
    private JCheckBox chxNegrita, chxCursiva;

    public LaminaChecks(){

        setLayout(new BorderLayout());

        Font miLetra = new Font("Serif", Font.PLAIN, 20);

        txtTexto = new JLabel("En un lugar de la Mancha de cuyo nombre...");

        txtTexto.setFont(miLetra);

        JPanel laminaTexto = new JPanel();

        laminaTexto.add(txtTexto);

        add(laminaTexto, BorderLayout.CENTER);

        chxNegrita = new JCheckBox("Negrita");
        chxCursiva = new JCheckBox("Cursiva");

        chxNegrita.addActionListener(new ManejaChecks());
        chxCursiva.addActionListener(new ManejaChecks());

        JPanel laminaChecks = new JPanel();

        laminaChecks.add(chxNegrita);
        laminaChecks.add(chxCursiva);

        add(laminaChecks, BorderLayout.SOUTH);

    }

    private class ManejaChecks implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {

            int tipo = 0;

            if(chxNegrita.isSelected()) tipo+= Font.BOLD;

            if(chxCursiva.isSelected()) tipo+= Font.ITALIC;

            txtTexto.setFont(new Font("Serif", tipo, 20));

        }
    }

}
