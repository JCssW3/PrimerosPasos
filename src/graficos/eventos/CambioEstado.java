package graficos.eventos;

import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;

import javax.swing.*;

public class CambioEstado {

    public static void main(String[] args) {

        MarcoVentana2 miMarco = new MarcoVentana2();

        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}

class MarcoVentana2 extends JFrame {

    public MarcoVentana2() {

        setVisible(true);

        setBounds(300, 300, 500, 350);

        CambiaEstado nuevoEstado = new CambiaEstado();

        addWindowStateListener(nuevoEstado);

    }

}

class CambiaEstado implements WindowStateListener {

    @Override
    public void windowStateChanged(WindowEvent e) {
        // System.out.println("La ventana ha cambiado de estado");
        // System.out.println(e.getNewState());

        if(e.getNewState() == Frame.MAXIMIZED_BOTH){
            System.out.println("La ventana esta a pantalla completa");
        }else if(e.getNewState() == Frame.NORMAL){
            System.out.println("La ventana está normal");
        } else if(e.getNewState() == Frame.ICONIFIED){
            System.out.println("La ventana esta minimizada");
        }

    }

}