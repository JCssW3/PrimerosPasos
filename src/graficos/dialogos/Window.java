package graficos.dialogos;

import javax.swing.JFrame;
import java.awt.BorderLayout;

/**
 * Created by User on 28/10/2016.
 */
public class Window extends JFrame{

    public Window(){

        setBounds(100,100,650,400);
        setTitle("Prueba de ventanas de dialogos");
        setLayout(new BorderLayout());
        setResizable(false); // que no se dimensione
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add(new ConfigLayer(), BorderLayout.CENTER);
        add(new LayerLaunchTest(), BorderLayout.SOUTH);
        setVisible(true);

    }

}
