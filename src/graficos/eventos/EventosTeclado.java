package graficos.eventos;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class EventosTeclado {

    public static void main(String[] args){

        MarcoConTeclas miMarco = new MarcoConTeclas();

        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
}

class MarcoConTeclas extends JFrame{

    public MarcoConTeclas(){

        setVisible(true);

        setBounds(300,300,600,450);

        addKeyListener(new EventoDeTeclado());

    }

}

class EventoDeTeclado implements KeyListener{


    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

        System.out.print(e.getKeyCode() + " : ");
        System.out.println(e.getKeyChar());

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

}