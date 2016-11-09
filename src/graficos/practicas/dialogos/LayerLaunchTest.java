package graficos.practicas.dialogos;

import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by User on 28/10/2016.
 */
public class LayerLaunchTest extends JPanel {

    private ConfigLayer configLayer;

    public LayerLaunchTest(ConfigLayer configLayer){

        this.configLayer = configLayer;

        JButton btn = new JButton("Test");
        btn.addActionListener(new ConfigDialogs());

        add(btn);

    }

    private class ConfigDialogs implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {

            for(JPanel pnl : configLayer.getPanels()){
                switch (pnl.toString()){
                    case "pnlMethod":
                        break;
                }
            }

        }

    }

}
