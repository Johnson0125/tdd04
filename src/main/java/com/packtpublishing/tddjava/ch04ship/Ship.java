package com.packtpublishing.tddjava.ch04ship;

public class Ship {
    private Location location;

    public Ship(Location location) {
        this.location = location;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void moveForward() {
        location.forward();
    }

    public void moveBackward() {
        location.backward();
    }
}
