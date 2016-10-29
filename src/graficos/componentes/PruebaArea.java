package graficos.componentes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//@// TODO: 1/10/2016   Pasar todo este ejemplo a varios archivos de clase

public class PruebaArea {

    public static void main(String[] args){

        MarcoPruebaArea miMarco = new MarcoPruebaArea();

    }

}

class MarcoPruebaArea extends JFrame{

    private JButton btnSaltoLinea;
    private JTextArea areaTexto;

    public MarcoPruebaArea(){

        setBounds(100,100,400,300);
        setTitle("Probando Área de texto");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel laminaBotones = new JPanel();

        JButton btnInsertar = new JButton("Insertar");
        btnInsertar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                areaTexto.append("En un lugar de la mancha de cuyo nombre no quiero acordarme...");
            }
        });

        laminaBotones.add(btnInsertar);

        btnSaltoLinea = new JButton("Salto de línea");

        btnSaltoLinea.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean saltar = !areaTexto.getLineWrap();
                areaTexto.setLineWrap(saltar);
                /*
                if(saltar){
                    btnSaltoLinea.setText("Quitar salto");
                } else {
                    btnSaltoLinea.setText("Salto línea");
                }
                */
                btnSaltoLinea.setText(saltar ? "Quitar salto" : "Salto línea");
            }
        });

        laminaBotones.add(btnSaltoLinea);

        add(laminaBotones, BorderLayout.SOUTH);

        areaTexto = new JTextArea(8,20);

        JScrollPane laminaConBarras = new JScrollPane(areaTexto);

        add(laminaConBarras, BorderLayout.CENTER);

        setVisible(true);

    }

}