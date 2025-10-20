public class HomeAutomationFacade {
    private Light light;
    private MusicSystem musicSystem;
    private Thermostat thermostat;
    private SecurityCamera camera;

    public HomeAutomationFacade(Light light, MusicSystem musicSystem, Thermostat thermostat, SecurityCamera camera) {
        this.light = light;
        this.musicSystem = musicSystem;
        this.thermostat = thermostat;
        this.camera = camera;
    }

    public void activateNightMode() {
        System.out.println("\n--- Activating Night Mode ---");
        light.turnOff();
        thermostat.ecoMode();
        camera.activate();
    }

    public void startPartyMode() {
        System.out.println("\n--- Starting Party Mode ---");
        light.operate();
        System.out.println("Lights set to dim mode.");
        musicSystem.operate();
    }

    public void leaveHome() {
        System.out.println("\n--- Leaving Home ---");
        light.turnOff();
        musicSystem.stop();
        camera.activate();
        System.out.println("All systems secured.");
    }
}
