package graficos.dialogos;

import javax.swing.JPanel;
import java.awt.GridLayout;

/**
 * Created by User on 1/11/2016.
 */
public class ConfigLayer extends JPanel {

    public ConfigLayer() {
        setLayout(new GridLayout(2, 3));

        LayerOptions pnlMethod = new LayerOptions("Tipo de Ventana");
        LayerOptions pnlMessageType = new LayerOptions("Tipo de Mensaje");
        LayerOptions pnlMessage = new LayerOptions("Mensaje");
        LayerOptions pnlOptions = new LayerOptions("Opciones");
        LayerOptions pnlOptionType = new LayerOptions("Tipo de Opciones");
        LayerOptions pnlInputMethod = new LayerOptions("Tipo de entrada");

        pnlMethod.insOpt("Mensaje");
        pnlMethod.insOpt("Confirmar");
        pnlMethod.insOpt("Opción");
        pnlMethod.insOpt("Entrada");

        pnlMessageType.insOpt("ERROR_MESSAGE");
        pnlMessageType.insOpt("INFORMATION_MESSAGE");
        pnlMessageType.insOpt("WARNING_MESSAGE");
        pnlMessageType.insOpt("QUESTION_MESSAGE");
        pnlMessageType.insOpt("QUESTION_MESSAGE");

        pnlMessage.insOpt("Cadena");
        pnlMessage.insOpt("Icono");
        pnlMessage.insOpt("Componente");
        pnlMessage.insOpt("Otros");
        pnlMessage.insOpt("Object[]");

        pnlOptions.insOpt("DEFAULT_OPTION");
        pnlOptions.insOpt("YES_NO_OPTION");
        pnlOptions.insOpt("YES_NO_CANCEL_OPTION");
        pnlOptions.insOpt("OK_CANCEL_OPTION");

        pnlOptionType.insOpt("String[]");
        pnlOptionType.insOpt("Icon");
        pnlOptionType.insOpt("Object[]");

        pnlInputMethod.insOpt("Campo de texto");
        pnlInputMethod.insOpt("Combo box");

        this.add(pnlMethod);
        this.add(pnlMessageType);
        this.add(pnlMessage);
        this.add(pnlOptions);
        this.add(pnlOptionType);
        this.add(pnlInputMethod);

    }

}