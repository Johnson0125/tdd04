package com.packtpublishing.tddjava.ch04ship;

public class Ship {
    private Location location;
    private Planet planet;


    public Ship(Location location, Planet planet) {
        this.location = location;
        this.planet = planet;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void moveForward() {
        location.forward(planet.getMax());
    }

    public void moveBackward() {
        location.backward(planet.getMax());
    }

    public void turnLeft() {
        location.turnLeft();
    }

    public void turnRight() {
        location.turnRight();
    }

    public Planet getPlanet() {
        return planet;
    }

    public void setPlanet(Planet planet) {
        this.planet = planet;
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
