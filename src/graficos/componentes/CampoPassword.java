package graficos.componentes;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;
import java.awt.*;

public class CampoPassword {

    public static void main(String[] args){

        MarcoPassword miMarco = new MarcoPassword();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miMarco.setVisible(true);

    }

}

class MarcoPassword extends JFrame{

    public MarcoPassword(){

        setBounds(100,100,400,300);
        setTitle("Password");

        add(new LaminaPassword());
    }

}

class LaminaPassword extends JPanel{

    JPasswordField pswPassword;


    public LaminaPassword(){

        setLayout(new BorderLayout());

        JPanel laminaSuperior = new JPanel();
        laminaSuperior.setLayout(new GridLayout(2,2));
        add(laminaSuperior, BorderLayout.NORTH);

        JLabel lblUsuario = new JLabel("Usuario: ");
        JLabel lblPassword = new JLabel("Password: ");

        JTextField txtUsuario = new JTextField(15);
        pswPassword = new JPasswordField(15);

        laminaSuperior.add(lblUsuario);
        laminaSuperior.add(txtUsuario);
        laminaSuperior.add(lblPassword);
        laminaSuperior.add(pswPassword);

        JButton btnEnviar = new JButton("Enviar");
        add(btnEnviar, BorderLayout.SOUTH);


        Document miPass = pswPassword.getDocument();
        miPass.addDocumentListener(new ComruebaPass());

    }

    private class ComruebaPass implements DocumentListener{

        @Override
        public void insertUpdate(DocumentEvent e) {

            comprobar();

        }

        @Override
        public void removeUpdate(DocumentEvent e) {

            comprobar();

        }

        @Override
        public void changedUpdate(DocumentEvent e) {

        }


        public void comprobar(){

            char[] password = pswPassword.getPassword();

            if((password.length < 8) || (password.length > 12)){

                pswPassword.setBackground(new Color(232, 124, 117));

            } else {

                pswPassword.setBackground(new Color(255, 255, 255));

            }


        }

    }


}
