package graficos.practicas.curso;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;

/**
 * Created by User on 7/11/2016.
 */
public class MarcoDialogos extends JFrame{

    private LaminaBotones laminaTipo,
            laminaTipoMensaje,
            laminaMensaje,
            laminaConfirmar,
            laminaOpcion,
            laminaEntrada;

    public MarcoDialogos(){

        setTitle("Prueba de dialogos");
        setBounds(500,300,600,450);

        JPanel laminaCuadricula = new JPanel(new GridLayout(2,3));

        laminaTipo = new LaminaBotones("Tipo:", new String[]{
                "Mensaje",
                "Confirmar",
                "Opción",
                "Entrada"
        });

        laminaTipoMensaje = new LaminaBotones("Tipo de Mensaje:",new String[]{
                "ERROR_MESSAGE",
                "INFORMATION_MESSAGE",
                "QUESTION_MESSAGE",
                "PLAIN_MESSAGE"
        });

        laminaMensaje = new LaminaBotones("Mensaje:", new String[]{
                "Cadena",
                "Icono",
                "Componente",
                "Otros",
                "Object[]"
        });

        laminaConfirmar = new LaminaBotones("Confirmar:", new String[]{
                "DEFAULT_OPTION",
                "YES_NO_OPTION",
                "YES_NO_CANCEL_OPTION",
                "OK_CANCEL_OPTION"
        });

        laminaOpcion = new LaminaBotones("Opción:", new String[]{
                "String[]",
                "Icon[]",
                "Object[]"
        });

        laminaEntrada = new LaminaBotones("Entrada:", new String[]{
                "Campo de texto",
                "Combo"
        });

        setLayout(new BorderLayout());

        laminaCuadricula.add(laminaTipo);
        laminaCuadricula.add(laminaTipoMensaje);
        laminaCuadricula.add(laminaMensaje);
        laminaCuadricula.add(laminaConfirmar);
        laminaCuadricula.add(laminaOpcion);
        laminaCuadricula.add(laminaEntrada);

        // Construimos la lamina inferior
        JPanel laminaMostrar = new JPanel();
        JButton botonMostrar = new JButton("Mostrar");
        laminaMostrar.add(botonMostrar);

        add(laminaCuadricula, BorderLayout.CENTER);
        add(laminaMostrar, BorderLayout.SOUTH);

    }

}
