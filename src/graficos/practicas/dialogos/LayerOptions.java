package graficos.practicas.dialogos;

import javax.swing.*;
import java.awt.*;

/**
 * Created by User on 28/10/2016.
 */
public class LayerOptions extends JPanel {

    private ButtonGroup bgp;

    public LayerOptions(String label, String [] options) {

        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(),label));

        bgp = new ButtonGroup();

        for(String option : options){

            JRadioButton rdb = new JRadioButton(option);
            rdb.setFont(new Font("Dialog",Font.ITALIC,12));

            bgp.add(rdb);
            rdb.setSelected(bgp.getButtonCount() == 1);

            add(rdb);

        }

    }

}
