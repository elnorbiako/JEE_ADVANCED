package pl.coderslab.entity;

public class Train extends Vehicle{

    public int trackWidth;

    public Train(String model, int maxSpeed, int trackWidth) {

        this.setTrackWidth(trackWidth);
        this.maxSpeed = maxSpeed;
        this.model = model;
    }

    public int getTrackWidth() {
        return trackWidth;
    }

    public void setTrackWidth(int trackWidth) {
        this.trackWidth = trackWidth;
    }
}
