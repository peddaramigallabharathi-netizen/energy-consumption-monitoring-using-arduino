/*
 * Energy Consumption Monitoring
 * Arduino + Voltage Sensor + Current Sensor
 *
 * Arduino sends:
 * Voltage, Current
 * Example: 230.0,2.5
 */

const int voltagePin = A0;
const int currentPin = A1;

void setup() {
  Serial.begin(9600);
}

void loop() {

  // Example sensor readings.
  // Replace these calculations with calibration
  // values for your actual sensors.
  int voltageRaw = analogRead(voltagePin);
  int currentRaw = analogRead(currentPin);

  float voltage = (voltageRaw / 1023.0) * 5.0 * 46.0;
  float current = (currentRaw / 1023.0) * 5.0;

  Serial.print(voltage);
  Serial.print(",");
  Serial.println(current);

  delay(1000);
}
