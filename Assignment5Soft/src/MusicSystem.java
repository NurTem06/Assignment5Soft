public class MusicSystem implements Device {
    @Override
    public void operate() {
        System.out.println("Music system is playing music.");
    }

    public void stop() {
        System.out.println("Music system is stopped.");
    }
}
