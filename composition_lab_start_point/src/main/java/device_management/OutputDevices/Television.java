package device_management.OutputDevices;

public class Television extends VideoDevice {
    public Television(int screenSize, int pixels) {
        super(screenSize, pixels);
    }

    public String tune(String station) {
      return "tuning to: " + station;
    };
}
