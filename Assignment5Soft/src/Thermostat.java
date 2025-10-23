public class Thermostat implements Device {
    private int temperature = 22;

    @Override
    public void operate() {
        System.out.println("Thermostat set to comfortable temperature (" + temperature + "°C).");
    }

    public void setTemperature(int temp) {
        temperature = temp;
        System.out.println("Thermostat now set to " + temp + "°C.");
    }

    public void ecoMode() {
        temperature = 18;
        System.out.println("Thermostat set to eco mode (" + temperature + "°C).");
    }
}
