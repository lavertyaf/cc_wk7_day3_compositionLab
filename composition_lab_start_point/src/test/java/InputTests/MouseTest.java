package InputTests;

import device_management.InputDevices.Mouse;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MouseTest {

    Mouse mouse;

    @Before
    public void before(){
        mouse = new Mouse ("Apple", 1);
    }

    @Test
    public void canGetType(){
        assertEquals("Apple",mouse.getType());
    }

    @Test
    public void canGetNumberOfButtons(){
        assertEquals(1, mouse.getNumberOfButtons());
    }

    @Test
    public void canSendData(){
        assertEquals("I am sending data from the mouse", mouse.sendData("the mouse"));
    }

    @Test
    public void canMoveMouse(){
        assertEquals("I can move the mouse", mouse.canMoveMouse("the mouse"));
    }

    @Test
    public void canClickTheButton(){
        assertEquals("I can click on the mouse", mouse.clickTheButton("the mouse"));
    }

}
