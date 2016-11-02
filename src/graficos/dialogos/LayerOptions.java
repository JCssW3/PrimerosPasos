package graficos.dialogos;

import javax.swing.*;

/**
 * Created by User on 28/10/2016.
 */
public class LayerOptions extends JPanel {

    private ButtonGroup bgp;

    public LayerOptions(String label) {

        setLayout(new SortLayout());
        setBorder(BorderFactory.createTitledBorder(label));
        bgp = new ButtonGroup();

    }

    public void insOpt(String label) {

        JRadioButton rdb = new JRadioButton(label);

        bgp.add(rdb);

        if (bgp.getButtonCount() == 1) {
            rdb.setSelected(true);
        }

        add(rdb);

    }

}
