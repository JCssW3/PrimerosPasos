package graficos.practicas.dialogos;

import javax.swing.JPanel;
import java.awt.GridLayout;

/**
 * Created by User on 1/11/2016.
 */
public class ConfigLayer extends JPanel {

    private LayerOptions pnlMethod, pnlMessageType, pnlMessage, pnlOptions, pnlOptionType, pnlInputMethod;

    public ConfigLayer() {
        setLayout(new GridLayout(2, 3));

        pnlMethod = new LayerOptions("Tipo de Ventana:", new String[]{
                "Mensaje",
                "Confirmar",
                "Opción",
                "Entrada"
        });

        pnlMessageType = new LayerOptions("Tipo de Mensaje:",new String[]{
                "ERROR_MESSAGE",
                "INFORMATION_MESSAGE",
                "QUESTION_MESSAGE",
                "PLAIN_MESSAGE"
        });

        pnlMessage = new LayerOptions("Mensaje:", new String[]{
                "Cadena",
                "Icono",
                "Componente",
                "Otros",
                "Object[]"
        });

        pnlOptions = new LayerOptions("Confirmar:", new String[]{
                "DEFAULT_OPTION",
                "YES_NO_OPTION",
                "YES_NO_CANCEL_OPTION",
                "OK_CANCEL_OPTION"
        });

        pnlOptionType = new LayerOptions("Opción:", new String[]{
                "String[]",
                "Icon[]",
                "Object[]"
        });

        pnlInputMethod = new LayerOptions("Entrada:", new String[]{
                "Campo de texto",
                "Combo"
        });

        this.add(pnlMethod);
        this.add(pnlMessageType);
        this.add(pnlMessage);
        this.add(pnlOptions);
        this.add(pnlOptionType);
        this.add(pnlInputMethod);

    }

    public JPanel[] getPanels(){
        return new JPanel[]{pnlMethod, pnlMessageType, pnlMessage, pnlOptions, pnlOptionType, pnlInputMethod};
    }

}