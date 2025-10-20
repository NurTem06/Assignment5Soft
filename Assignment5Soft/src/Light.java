public class Light implements Device {
    @Override
    public void operate() {
        System.out.println("Light is ON.");
    }

    public void turnOff() {
        System.out.println("Light is OFF.");
    }
}
