package graficos.disposiciones;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora {

    public static void main(String[] args) {

        MarcoCalculadora miMarco = new MarcoCalculadora();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miMarco.setVisible(true);

    }

}

class MarcoCalculadora extends JFrame {

    public MarcoCalculadora() {

        setTitle("Calculadora");
        setBounds(150, 150, 450, 300);

        // Pack reduce el marco al tamaño estandar de todos
        // los componentes de la misma
        // pack();

        LaminaCalculadora miLamina = new LaminaCalculadora();
        add(miLamina);

    }

}

class LaminaCalculadora extends JPanel {

    private JPanel miLamina2;
    private JButton btnPantalla;
    private boolean principio;
    private double resultado;
    private String UltimaOperacion = "=";

    public LaminaCalculadora() {

        principio = true;

        setLayout(new BorderLayout());

        btnPantalla = new JButton("0");
        // Desactiva el botón
        btnPantalla.setEnabled(false);

        add(btnPantalla, BorderLayout.NORTH);

        miLamina2 = new JPanel();
        miLamina2.setLayout(new GridLayout(4, 4));

        ActionListener insertar = new InsertaNumero();
        ActionListener orden = new AccionOrden();

        ponerBoton("7", insertar);
        ponerBoton("8", insertar);
        ponerBoton("9", insertar);
        ponerBoton("/", orden);
        ponerBoton("4", insertar);
        ponerBoton("5", insertar);
        ponerBoton("6", insertar);
        ponerBoton("*", orden);
        ponerBoton("1", insertar);
        ponerBoton("2", insertar);
        ponerBoton("3", insertar);
        ponerBoton("-", orden);
        ponerBoton("0", insertar);
        ponerBoton(".", orden);
        ponerBoton("=", orden);
        ponerBoton("+", orden);

        add(miLamina2, BorderLayout.CENTER);

    }

    private void ponerBoton(String rotulo, ActionListener oyente) {

        JButton boton = new JButton(rotulo);
        // Pone el botón a la escucha
        boton.addActionListener(oyente);
        miLamina2.add(boton);

    }

    private class InsertaNumero implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            String entrada = e.getActionCommand();

            if (principio) {

                btnPantalla.setText("");
                principio = false;

            }

            btnPantalla.setText(btnPantalla.getText() + entrada);

        }

    }

    private class AccionOrden implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            String operacion = e.getActionCommand();

            calcular(Double.parseDouble(btnPantalla.getText()));

            UltimaOperacion = operacion;

            // Se establece el valor de principio en true, para
            // que cuando el usuario presione nuevamente un botón
            // de numero, al llamar al oyente InsertaNumero este
            // entre en el if ( principio == true ) y ponga el
            // setText("")
            principio = true;

        }

        public void calcular(double x){

            switch (UltimaOperacion) {
                case "+":
                    resultado += x;
                    break;
                case "-":
                    resultado -= x;
                    break;
                case "*":
                    resultado *= x;
                    break;
                case "/":
                    resultado /= x;
                    break;
                case "=":
                    resultado = x;
                    break;
            }

            btnPantalla.setText("" + resultado);

        }

    }

}