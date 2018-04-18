package device_management.OutputDevices;
import behaviours.IOutput;
import device_management.OutputDevices.SoundDevice;

public class Speaker extends SoundDevice implements IOutput {
    public Speaker(int maxVolume) {
        super(maxVolume);
    }

    public String outputData(String data) {
        return playSound(data);
    }
}
