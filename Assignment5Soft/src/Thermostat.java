public class Thermostat implements Device {
    @Override
    public void operate() {
        System.out.println("Thermostat set to comfortable temperature.");
    }

    public void ecoMode() {
        System.out.println("Thermostat set to eco mode.");
    }
}
