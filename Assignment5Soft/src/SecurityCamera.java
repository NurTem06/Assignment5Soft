public class SecurityCamera implements Device {
    @Override
    public void operate() {
        System.out.println("Security camera is recording.");
    }

    public void activate() {
        System.out.println("Security camera activated.");
    }

    public void deactivate() {
        System.out.println("Security camera deactivated.");
    }
}
