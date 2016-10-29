package graficos.eventos;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;

public class Prueba {

    public static void main(String[] args){

        MarcoPrueba miMarco = new MarcoPrueba();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miMarco.setVisible(true);

    }

}

class MarcoPrueba extends JFrame{

    public MarcoPrueba(){

        setBounds(100,100,400,300);
        setTitle("Prueba Eventos en el texto");

        add(new LaminaPrueba());
    }

}

class LaminaPrueba extends JPanel{

    public LaminaPrueba(){

        JTextField miCampo = new JTextField(20);

        Document miDoc = miCampo.getDocument();

        miDoc.addDocumentListener(new EscuchaTexto());

        add(miCampo);

    }

    private class EscuchaTexto implements DocumentListener{

        @Override
        public void insertUpdate(DocumentEvent e) {
            System.out.println("Has insertado texto");
        }

        @Override
        public void removeUpdate(DocumentEvent e) {
            System.out.println("Has borrado texto");
        }

        @Override
        public void changedUpdate(DocumentEvent e) {

        }
    }

}