public class VoiceControlDecorator extends DeviceDecorator {
    public VoiceControlDecorator(Device decoratedDevice) {
        super(decoratedDevice);
    }

    @Override
    public void operate() {
        decoratedDevice.operate();
        addVoiceControl();
    }

    private void addVoiceControl() {
        System.out.println("Voice control feature added.");
    }
}
