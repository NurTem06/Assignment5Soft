public class EnergySavingDecorator extends DeviceDecorator {
    public EnergySavingDecorator(Device decoratedDevice) {
        super(decoratedDevice);
    }

    @Override
    public void operate() {
        decoratedDevice.operate();
        System.out.println("Energy saving mode enabled.");
    }
}
