package core.action;

import core.entity.Entity;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class InspectAction extends GameAction {
    private Entity entity;

    public InspectAction(JComponent component, Entity entity) {
        super(component, false);
        this.entity = entity;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        super.actionPerformed(e);
        this.entity.inspect();
    }
}
