package core.action;

import javax.swing.*;
import java.awt.event.ActionEvent;

public abstract class GameAction extends AbstractAction {
    private JComponent component;
    private boolean shouldRepaint;

    public GameAction(JComponent component, boolean shouldRepaint) {
        this.component = component;
        this.shouldRepaint = shouldRepaint;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(this.shouldRepaint) {
            this.component.repaint();
        }
    }
}
