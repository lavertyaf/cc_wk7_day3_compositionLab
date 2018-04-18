package InputTests;

import device_management.InputDevices.Keyboard;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KeyboardTest {

    Keyboard keyboard;

    @Before
    public void before(){
        keyboard = new Keyboard("QWERTY");
    }

    @Test
    public void getLanguage(){
        assertEquals("QWERTY", keyboard.getLanguage());
    }

    @Test
    public void canSendData(){
        assertEquals("I am sending data from the keyboard", keyboard.sendData("the keyboard"));
    }

    @Test
    public void canClickTheButton(){
        assertEquals("I can click on the keyboard", keyboard.clickTheButton("the keyboard"));
    }
}