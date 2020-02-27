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

    public void turnLeft() {
        location.turnLeft();
    }

    public void turnRight() {
        location.turnRight();
    }

    public void receiveCommand(String command) {
        char[] commands = command.toCharArray();
        for (int i = 0; i < commands.length; i++) {
            char comm = commands[i];

            if (comm == 'f') {
                moveForward();
            } else if (comm == 'b') {
                moveBackward();
            } else if (comm == 'l') {
                turnLeft();
            } else {
                turnRight();
            }

        }

    }
}
