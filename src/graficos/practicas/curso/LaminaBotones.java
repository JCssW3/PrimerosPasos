package graficos.practicas.curso;

import javax.swing.*;

/**
 * Created by User on 7/11/2016.
 */
public class LaminaBotones extends JPanel {

    public LaminaBotones(String titulo, String [] opciones){

        setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), titulo));
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        ButtonGroup grupo = new ButtonGroup();

        for(String etiqueta : opciones){
            JRadioButton rdbOpcion = new JRadioButton(etiqueta);

            grupo.add(rdbOpcion);
            add(rdbOpcion);

            rdbOpcion.setSelected(grupo.getButtonCount() == 1);

            /* La línea previa es igual a hacer esto
                if (grupo.getButtonCount() == 1) {
                    rdbOpcion.setSelected(true);
                }
            */

        }


    }

}
