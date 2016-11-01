package graficos.dialogos;

import javax.swing.*;
import java.awt.*;

/**
 * Created by User on 28/10/2016.
 */
public class LayerOptions extends JPanel {

    public LayerOptions() {

        setLayout(new GridLayout(2, 3));

        JPanel pnlMethod = new JPanel();
        pnlMethod.setLayout(new SortLayout());
        pnlMethod.setBorder(BorderFactory.createTitledBorder("Tipo de Ventana"));

        JPanel pnlMessageType = new JPanel();
        pnlMessageType.setLayout(new SortLayout());
        pnlMessageType.setBorder(BorderFactory.createTitledBorder("Tipo de Mensaje"));

        JPanel pnlMessage = new JPanel();
        pnlMessage.setLayout(new SortLayout());
        pnlMessage.setBorder(BorderFactory.createTitledBorder("Mensaje"));

        JPanel pnlOptions = new JPanel();
        pnlOptions.setLayout(new SortLayout());
        pnlOptions.setBorder(BorderFactory.createTitledBorder("Opciones"));

        JPanel pnlOptionType = new JPanel();
        pnlOptionType.setLayout(new SortLayout());
        pnlOptionType.setBorder(BorderFactory.createTitledBorder("Tipo de Opciones"));

        JPanel pnlInputMethod = new JPanel();
        pnlInputMethod.setLayout(new SortLayout());
        pnlInputMethod.setBorder(BorderFactory.createTitledBorder("Tipo de entrada"));

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

        pnlMessageType.add(insOpt("ERROR_MESSAGE", btgMessageType));
        pnlMessageType.add(insOpt("INFORMATION_MESSAGE", btgMessageType));
        pnlMessageType.add(insOpt("WARNING_MESSAGE", btgMessageType));
        pnlMessageType.add(insOpt("QUESTION_MESSAGE", btgMessageType));
        pnlMessageType.add(insOpt("QUESTION_MESSAGE", btgMessageType));

        pnlMessage.add(insOpt("Cadena", btgMessage));
        pnlMessage.add(insOpt("Icono", btgMessage));
        pnlMessage.add(insOpt("Componente", btgMessage));
        pnlMessage.add(insOpt("Otros", btgMessage));
        pnlMessage.add(insOpt("Object[]", btgMessage));

        pnlOptions.add(insOpt("DEFAULT_OPTION", btgOptions));
        pnlOptions.add(insOpt("YES_NO_OPTION", btgOptions));
        pnlOptions.add(insOpt("YES_NO_CANCEL_OPTION", btgOptions));
        pnlOptions.add(insOpt("OK_CANCEL_OPTION", btgOptions));

        pnlOptionType.add(insOpt("String[]", btgOptionType));
        pnlOptionType.add(insOpt("Icon", btgOptionType));
        pnlOptionType.add(insOpt("Object[]", btgOptionType));

        pnlInputMethod.add(insOpt("Campo de texto", btgInputMethod));
        pnlInputMethod.add(insOpt("Combo box", btgInputMethod));

        this.add(pnlMethod);
        this.add(pnlMessageType);
        this.add(pnlMessage);
        this.add(pnlOptions);
        this.add(pnlOptionType);
        this.add(pnlInputMethod);


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
