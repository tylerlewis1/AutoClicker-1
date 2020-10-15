import java.awt.event.KeyEvent;
import static java.awt.event.KeyEvent.*;
import java.awt.event.KeyListener;

public class Hotkeys {
    
    static KeyListener key_listener = new KeyListener() {
        @Override
        public void keyTyped(KeyEvent ke) {
            int pressed_key = ke.getExtendedKeyCode();
            if(pressed_key == VK_F3){
                GUI.start_hotkey = true;
            }
            if (pressed_key == VK_F4){
                GUI.close_hotkey = true;
            }
        }
        @Override
        public void keyPressed(KeyEvent ke) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
        @Override
        public void keyReleased(KeyEvent ke) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    };
}
