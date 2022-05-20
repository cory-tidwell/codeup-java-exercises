package util;

import util.Input;

public class InputTest {
     public static void main(String[] args) {
        Input userInput =  new Input();
        userInput.getString();
        userInput.yesNo();
        userInput.getInt(1, 10);
        userInput.getDouble(1, 10);
    }
}
