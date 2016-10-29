package graficos.procesadores;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class Procesador {

    public static void main(String[] args) {

        MarcoProcesador miMarco = new MarcoProcesador();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}

class MarcoProcesador extends JFrame {

    public MarcoProcesador() {

        setBounds(100, 100, 500, 400);
        setTitle("ProcesadorMejorado Precario");

        add(new LaminaProcesador());

        setVisible(true);

    }

}

class LaminaProcesador extends JPanel {

    private JTextPane miArea;
    private Font letras;

    public LaminaProcesador() {

        setLayout(new BorderLayout());

        JPanel laminaMenu = new JPanel();
        // Le asigno disposición BorderLayout para que lo estire
        laminaMenu.setLayout(new BorderLayout());

        JMenuBar jmbMenu = new JMenuBar();
        //---------------------------------------------------------//
        JMenu jmFuente = new JMenu("Fuente");
        JMenu jmEstilo = new JMenu("Estilo");
        JMenu jmTamano = new JMenu("Tamaño");
        //---------------------------------------------------------//
        configuraMenu("Arial", jmFuente,"Arial",9,10);
        configuraMenu("Courier", jmFuente,"Courier",9,10);
        configuraMenu("Verdana", jmFuente,"Verdana",9,10);

        FabricaMenu fm = new FabricaMenu();
        fm.CrearMenu("Comics Sans","src/graficos/iconos/bold.png", KeyEvent.VK_A, jmFuente,new PruebaEventoMenu());

        configuraMenu("Negrita", jmEstilo,"",Font.BOLD,1);
        configuraMenu("Cursiva", jmEstilo,"",Font.ITALIC,1);

        configuraMenu("12", jmTamano,"",9,12);
        configuraMenu("14", jmTamano,"",9,14);
        configuraMenu("16", jmTamano,"",9,16);
        configuraMenu("18", jmTamano,"",9,18);
        //---------------------------------------------------------//
        jmbMenu.add(jmFuente);
        jmbMenu.add(jmEstilo);
        jmbMenu.add(jmTamano);
        //---------------------------------------------------------//

        laminaMenu.add(jmbMenu);

        add(laminaMenu, BorderLayout.NORTH);

        miArea = new JTextPane();

        add(miArea, BorderLayout.CENTER);

    }

    private void configuraMenu(String rotulo, JMenu menu, String tipoLetra, int estilos, int tamano){

        // Todo: Crear clase que se dedique a crear los menús!
        JMenuItem jmiItem = new JMenuItem(rotulo);
        jmiItem.addActionListener(new GestionaEventos(rotulo, tipoLetra, estilos, tamano));
        menu.add(jmiItem);

    }

    private class GestionaEventos implements ActionListener{

        private String fuente, menu;
        private int estilo, tamano;

        public GestionaEventos (String elemento, String rotulo, int est, int tam){

            menu = elemento;
            fuente= rotulo;
            estilo = est;
            tamano = tam;

        }

        @Override
        public void actionPerformed(ActionEvent e) {

            Font fuenteArea = miArea.getFont();

            if(menu.equals("Arial") || menu.equals("Courier") || menu.equals("Verdana" )){

                estilo = fuenteArea.getStyle();
                tamano = fuenteArea.getSize();

            } else if(menu.equals("Negrita") || menu.equals("Cursiva")){

                if(fuenteArea.getStyle() == 1 || fuenteArea.getStyle() == 2){
                    estilo = 3;
                }

                fuente = fuenteArea.getFontName();
                tamano = fuenteArea.getSize();

            } else if(menu.equals("12")||menu.equals("14")||menu.equals("16")||menu.equals("18")){

                fuente = fuenteArea.getFontName();
                estilo = fuenteArea.getStyle();

            }

            miArea.setFont(new Font(fuente, estilo,tamano));

        }

    }

    public class PruebaEventoMenu implements ActionListener{

        public void actionPerformed(ActionEvent e){

        }

    }

    //----------------------------------------------------------------------------------------------------

    class FabricaMenu { /* No funcional */

        public void CrearMenu(String rotulo, String icono, int mnemonic, JMenu menu, ActionListener event){

            JMenuItem jmiItem = new JMenuItem(rotulo, new ImageIcon(icono));
            jmiItem.setMnemonic(mnemonic);
            jmiItem.setFont(new Font("Dialog",Font.PLAIN,12));
            jmiItem.addActionListener(event);
            menu.add(jmiItem);

        }

    }

}

