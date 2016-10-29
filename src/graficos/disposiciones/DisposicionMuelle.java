package graficos.disposiciones;

import javax.swing.*;

/**
 * Created by User on 19/10/2016.
 */
public class DisposicionMuelle {

    public static void main(String[] args) {

        MarcoMuelle miMarco = new MarcoMuelle();
        miMarco.setVisible(true);
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}

class MarcoMuelle extends JFrame{

    public MarcoMuelle(){

        setBounds(100,100,800,400);
        setTitle("Prueba Disposición de Muelle -o resorte-");

        add(new LaminaMuelle());

    }

}

class LaminaMuelle extends JPanel{

    public LaminaMuelle(){

        JButton btnUno = new JButton("Botón 1");
        JButton btnDos = new JButton("Botón 2");
        JButton btnTres = new JButton("Botón 3");

        // Le defino como nueva disposición un SpringLayout
        SpringLayout miLayout = new SpringLayout();
        setLayout(miLayout);

        add(btnUno);
        add(btnDos);
        add(btnTres);

        // Creo el resorte constant(min, pref, max)
        Spring resorte = Spring.constant(0,10,100);

        Spring resorteRigido = Spring.constant(10);

        miLayout.putConstraint(SpringLayout.WEST, btnUno, resorte, SpringLayout.WEST, this);
        miLayout.putConstraint(SpringLayout.WEST, btnDos, resorteRigido, SpringLayout.EAST, btnUno);
        miLayout.putConstraint(SpringLayout.WEST, btnTres, resorteRigido, SpringLayout.EAST, btnDos);
        miLayout.putConstraint(SpringLayout.EAST, this, resorte, SpringLayout.EAST, btnTres);

    }

}