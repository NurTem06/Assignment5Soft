public class Main {
    public static void main(String[] args) {
        Light light = new Light();
        MusicSystem musicSystem = new MusicSystem();
        Thermostat thermostat = new Thermostat();
        SecurityCamera camera = new SecurityCamera();
        Device smartLight = new VoiceControlDecorator(new EnergySavingDecorator(light));
        Device smartMusic = new RemoteAccessDecorator(new EnergySavingDecorator(musicSystem));
        System.out.println("--- Demonstrating Decorators ---");
        smartLight.operate();
        smartMusic.operate();

        HomeAutomationFacade home = new HomeAutomationFacade(light, musicSystem, thermostat, camera);

        home.startPartyMode();
        home.activateNightMode();
        home.leaveHome();
    }
}
