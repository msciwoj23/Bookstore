package View;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Special {

    public static char getCh() {
        final char[] character = new char[1];
        final int[] code = new int[1];

        final JFrame frame = new JFrame();
        synchronized (frame) {
            frame.setUndecorated(true);
            frame.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
            frame.addKeyListener(new KeyListener() {
                @Override
                public void keyPressed(KeyEvent e) {
                    synchronized (frame) {
                        character[0] = e.getKeyChar();
                        code[0] = e.getKeyCode();
                        frame.setVisible(false);
                        frame.dispose();
                        frame.notify();
                    }
                }
                @Override
                public void keyReleased(KeyEvent e) {
                }
                @Override
                public void keyTyped(KeyEvent e) {
                }
            });
            frame.setVisible(true);
            try {
                frame.wait();
            } catch (InterruptedException e1) {
            }
        }
        return character[0];
//        return code[0];
    }
}
