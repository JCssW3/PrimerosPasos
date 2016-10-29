package graficos.eventos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class FocoEvento {

    public static void main(String[] args) {

        MarcoFoco miMarco = new MarcoFoco();

        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}

class MarcoFoco extends JFrame {

    public MarcoFoco() {

        setBounds(300, 300, 300, 300);
        setTitle("Prueba de Foco");
        LaminaFoco miLamina = new LaminaFoco();

        add(miLamina);

        // Siempre setear setVisible a lo último de todo,
        // para poder ver los componentes "pintados"
        setVisible(true);

    }


}

class LaminaFoco extends JPanel {

    private JTextField cuadro1;

    public LaminaFoco(){

        // Invalida el layout por defecto -"Centrado de componentes"-
        setLayout(null);

        cuadro1 = new JTextField();
        JTextField cuadro2 = new JTextField();

        cuadro1.setBounds(25, 10, 150, 20);
        cuadro2.setBounds(25, 50, 150, 20);

        add(cuadro1);
        add(cuadro2);

        LanzaFocos elFoco = new LanzaFocos();

        cuadro1.addFocusListener(elFoco);
    }

    public void paintComponents(Graphics g) {

        super.paintComponents(g);

    }

    private class LanzaFocos implements FocusListener {

        @Override
        public void focusGained(FocusEvent e) {

        }

        @Override
        public void focusLost(FocusEvent e) {

            String email = cuadro1.getText();
            boolean comprobacion = false;

            for(int i=0; i<email.length(); i++){

                if(email.charAt(i) == '@'){
                    comprobacion = true;
                }

            }

            if(comprobacion){
                System.out.println("Es correcta");
            } else {
                System.out.println("Es incorrecta");
            }
        }

    }

}

