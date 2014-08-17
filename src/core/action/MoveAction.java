package core.action;

import core.Direction;
import core.entity.Entity;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class MoveAction extends GameAction {
    private Entity entity;
    private Direction direction;

    public MoveAction(JComponent component, Entity entity, Direction direction) {
        super(component, true);
        this.entity = entity;
        this.direction = direction;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        super.actionPerformed(e);
        if(this.entity.getMap().isBlocked(this.entity.getLocation().plus(Direction.getDisplacementLocation(this.direction)))) {
            return;
        }
        this.entity.move(this.direction);
    }
}
