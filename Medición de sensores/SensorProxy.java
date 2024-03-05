public class SensorProxy {

    String[] sensores = { "TemperatureSensor", "LightSensor" };

    void updateData() {
        for (String sensor : sensores) {
            System.out.println("Updatinf " + sensor);
        }
    }
}
