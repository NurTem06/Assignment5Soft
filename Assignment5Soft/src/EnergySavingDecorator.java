public class EnergySavingDecorator extends DeviceDecorator {
    public EnergySavingDecorator(Device decoratedDevice) {
        super(decoratedDevice);
    }

    @Override
    public void operate() {
        decoratedDevice.operate();
        enableEnergySaving();
    }

    private void enableEnergySaving() {
        System.out.println("Energy saving mode enabled.");
    }
}
