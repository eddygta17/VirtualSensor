package fr.frazew.virtualgyroscope;

public class SensorModel {
    public String name;
    public int handle;
    public float resolution;
    public int minDelay;
    public float maxRange;
    public boolean alreadyThere = false;

    public SensorModel(int sensorType, String name, int handle, float resolution, int minDelay, float maxRange) {
        this.name = name;
        this.handle = (handle == -1 ? sensorType : handle);
        this.resolution = resolution;
        this.minDelay = minDelay;
        this.maxRange = maxRange;
    }
}