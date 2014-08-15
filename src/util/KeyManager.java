package util;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.HashMap;

public class KeyManager implements KeyListener {
    private static HashMap<Integer, Boolean> keys = new HashMap<>();

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        keys.put(e.getKeyCode(), true);
    }

    @Override
    public void keyReleased(KeyEvent e) {
        keys.put(e.getKeyCode(), false);
    }

    public boolean isKeyDown(int keyCode) {
        return keys.containsKey(keyCode) && keys.get(keyCode);
    }
}