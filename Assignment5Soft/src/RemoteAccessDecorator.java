public class RemoteAccessDecorator extends DeviceDecorator {
    public RemoteAccessDecorator(Device decoratedDevice) {
        super(decoratedDevice);
    }

    @Override
    public void operate() {
        decoratedDevice.operate();
        addRemoteAccess();
    }

    private void addRemoteAccess() {
        System.out.println("Remote access enabled via Internet.");
    }
}
