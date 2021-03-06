package ru.sbt.mipt.oop;

public class AlarmSystemStateOn implements AlarmSystemState {
    private final AlarmSystem alarmSystem;

    public AlarmSystemStateOn(AlarmSystem system) {
        alarmSystem = system;
    }

    @Override
    public AlarmSystemStateEnum getState() {
        return AlarmSystemStateEnum.ON;
    }

    @Override
    public void turnOn() {
    }

    @Override
    public void turnOff() {
        alarmSystem.setAlarmSystemState(new AlarmSystemStateOff(alarmSystem));
    }

    @Override
    public void onSensorEvent(SensorEvent sensorEvent) {
        alarmSystem.setAlarmSystemState(new AlarmSystemStateWaitForPassword(alarmSystem));
    }

    @Override
    public void enterPassword(String password) {
    }
}
