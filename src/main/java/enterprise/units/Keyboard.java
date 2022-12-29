
package enterprise.units;

import enterprise.enums.KeyboardEnum;

public class Keyboard {

    private KeyboardEnum keyboardEnum;

    public Keyboard(KeyboardEnum keyboardEnum) {
        this.keyboardEnum = keyboardEnum;
    }

    public KeyboardEnum getKeyboardEnum() {
        return keyboardEnum;
    }

    public String toString() {
        return "Keyboard: " + keyboardEnum;
    }
}
