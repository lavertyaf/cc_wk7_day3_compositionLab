package device_management.InputDevices;

import behaviours.IInput;

public class Keyboard implements IInput{

    private String language;

    public Keyboard(String language){
        this.language = language;

    }

    public String sendData(String data) {
        return "I am sending data from " + data;
    }

    public String getLanguage(){
        return language;
    }

    public String clickTheButton(String data){
        return "I can click on " + data;
    }

}
