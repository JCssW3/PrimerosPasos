package graficos.dialogos;

import javax.swing.*;
import java.awt.*;

/**
 * Created by User on 28/10/2016.
 */
public class LayerOptions extends JPanel {

    public LayerOptions() {

        setLayout(new GridLayout(3, 3));

        JPanel pnlMethod = new JPanel();
        pnlMethod.setBorder(BorderFactory.createTitledBorder("Tipo de Ventana"));

        JPanel pnlMessageType = new JPanel();
        pnlMessageType.setBorder(BorderFactory.createTitledBorder("Tipo de Mensaje"));

        ButtonGroup btgMethod = new ButtonGroup();
        ButtonGroup btgMessageType = new ButtonGroup();
        ButtonGroup btgMessage = new ButtonGroup();
        ButtonGroup btgOptionType = new ButtonGroup();
        ButtonGroup btgOptions = new ButtonGroup();
        ButtonGroup btgInputMethod = new ButtonGroup();

        pnlMethod.add(insOpt("Mensaje", btgMethod));
        pnlMethod.add(insOpt("Confirmar", btgMethod));
        pnlMethod.add(insOpt("Opción", btgMethod));
        pnlMethod.add(insOpt("Entrada", btgMethod));

        pnlMessageType.add(insOpt("Mensaje", btgMessageType));
        pnlMessageType.add(insOpt("Confirmar", btgMessageType));
        pnlMessageType.add(insOpt("Opción", btgMessageType));
        pnlMessageType.add(insOpt("Entrada", btgMessageType));

        this.add(pnlMethod);
        this.add(pnlMessageType);
        this.add(new JButton());
        this.add(new JButton());
        this.add(new JButton());
        this.add(new JButton());
        this.add(new JButton());
        this.add(new JButton());
        this.add(new JButton());

    }

    public JRadioButton insOpt(String label, ButtonGroup btnGrp) {

        JRadioButton rdb = new JRadioButton(label);

        btnGrp.add(rdb);

        if (btnGrp.getButtonCount() == 1) {
            rdb.setSelected(true);
        }

        return rdb;

    }

}
