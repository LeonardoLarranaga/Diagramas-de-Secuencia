public class DashBoard {
    void despliegaSensores() {
        SensorProxy sensorProxy = new SensorProxy();
        sensorProxy.updateData();
        updateDisplay();
    }

    private void updateDisplay() {
        System.out.println("Update display.");
    }
}
