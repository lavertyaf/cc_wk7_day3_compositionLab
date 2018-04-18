package device_management.InputDevices;

import behaviours.IInput;

public class Mouse implements IInput{

    private String type;
    private int numberOfButtons;

    public Mouse(String type, int numberOfButtons){
        this.type = type;
        this.numberOfButtons = numberOfButtons;
    }

    public String sendData(String data) {
        return "I am sending data from " + data;
    }

    public String getType(){
        return type;
    }

    public int getNumberOfButtons(){
        return numberOfButtons;
    }

    public String canMoveMouse(String data){
        return "I can move " + data;
    }

    public String clickTheButton(String data){
        return "I can click on " + data;
    }
}
