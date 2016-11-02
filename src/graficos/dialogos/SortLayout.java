package graficos.dialogos;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.LayoutManager;

/**
 * Created by User on 1/11/2016.
 */
public class SortLayout implements LayoutManager {

    @Override
    public void removeLayoutComponent(Component comp) {

    }

    @Override
    public Dimension preferredLayoutSize(Container parent) {
        return null;
    }

    @Override
    public Dimension minimumLayoutSize(Container parent) {
        return null;
    }

    @Override
    public void layoutContainer(Container parent) {

        final int x = 20;
        int y = 20;

        for(Component c : parent.getComponents()){
            c.setBounds(x, y, 180,25);
            y = y + 20;
        }

    }

    @Override
    public void addLayoutComponent(String name, Component comp) {

    }
}
