package core.action;

import core.Location;
import core.entity.Entity;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class MoveAction extends GameAction {
    private Entity entity;
    private Location displacement;

    public MoveAction(JComponent component, Entity entity, Location displacement) {
        super(component, true);
        this.entity = entity;
        this.displacement = displacement;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        super.actionPerformed(e);
        if(this.entity.getMap().isBlocked(this.entity.getLocation().plus(this.displacement))) {
            return;
        }
        this.entity.move(this.displacement);
    }
}
