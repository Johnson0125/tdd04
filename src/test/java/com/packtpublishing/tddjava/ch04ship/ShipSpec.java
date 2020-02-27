package com.packtpublishing.tddjava.ch04ship;

import org.testng.annotations.*;

import static org.testng.Assert.*;

@Test
public class ShipSpec {
    private Ship ship;
    private Location location;
    private Planet planet;

    @BeforeMethod
    public void setUp() {
        location = new Location(new Point(21, 13), Direction.NORTH);

        Point max = new Point(50, 50);
        planet = new Planet(max);
        ship = new Ship(location, planet);
    }

    public void whenInstantiatedThenLocationIsSet() {
        assertEquals(ship.getLocation(), location);
    }


    @Test
    public void whenMoveForwardThenForward() {
        Location expected = location.copy();
        expected.forward();
        ship.moveForward();

        assertEquals(ship.getLocation(), expected);
    }

    @Test
    public void whenMoveBackwardThenBackward() {
        Location expected = location.copy();
        expected.backward();
        ship.moveBackward();

        assertEquals(ship.getLocation(), expected);
    }

    @Test
    public void whenTurnLeftThenLeft() {
        Location expected = location.copy();
        expected.turnLeft();

        ship.turnLeft();

        assertEquals(ship.getLocation(), expected);
    }

    @Test
    public void whenTurnRightThenRight() {
        Location expected = location.copy();
        expected.turnRight();
        ship.turnRight();

        assertEquals(ship.getLocation(), expected);
    }

    @Test
    public void whenReceiveCommandFThenForward() {
        Location expected = location.copy();

        expected.forward();

        ship.receiveCommand("f");
        assertEquals(ship.getLocation(), expected);
    }

    @Test
    public void whenReceiveCommandsThenAllAreExecuted() {
        Location expected = location.copy();
        expected.turnRight();
        expected.forward();
        expected.turnLeft();
        expected.backward();

        ship.receiveCommand("rflb");

        assertEquals(ship.getLocation(), expected);
    }

    @Test
    public void whenInstantiatedThenPlantIsStored() {
        ship = new Ship(location, planet);
        assertEquals(ship.getPlanet(), planet);

    }
}
