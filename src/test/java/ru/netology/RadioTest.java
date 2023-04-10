package ru.netology;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void testNull() {
        Radio radio = new Radio();

        radio.setNumberStation(0);

        int expected = 0;
        int actual = radio.getNumberStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNumberStationOne() {
        Radio radio = new Radio();

        radio.setNumberStation(1);

        int expected = 1;
        int actual = radio.getNumberStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNumberStationNine() {
        Radio radio = new Radio();

        radio.setNumberStation(9);

        int expected = 9;
        int actual = radio.getNumberStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNumberStationTen() {
        Radio radio = new Radio();

        radio.setNumberStation(10);

        int expected = 0;
        int actual = radio.getNumberStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNumberStationMinusOne() {
        Radio radio = new Radio();

        radio.setNumberStation(-1);

        int expected = 0;
        int actual = radio.getNumberStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testVolumeNull() {
        Radio radio = new Radio();

        radio.setVolumeStation(0);

        int expected = 0;
        int actual = radio.getVolumeStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void tesVolumeOne() {
        Radio radio = new Radio();

        radio.setVolumeStation(1);
        ;

        int expected = 1;
        int actual = radio.getVolumeStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testVolumeEleven() {
        Radio radio = new Radio();

        radio.setVolumeStation(11);

        int expected = 0;
        int actual = radio.getVolumeStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testVolumeTen() {
        Radio radio = new Radio();

        radio.setVolumeStation(10);

        int expected = 10;
        int actual = radio.getVolumeStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testVolumeMinusOne() {
        Radio radio = new Radio();

        radio.setVolumeStation(-1);

        int expected = 0;
        int actual = radio.getVolumeStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testStationSwitch() {
        Radio radio = new Radio();
        radio.setNumberStation(1);

        radio.next();

        int expected = 2;
        int actual = radio.getNumberStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testStationSwitchMax() {
        Radio radio = new Radio();
        radio.setNumberStation(9);

        radio.next();

        int expected = 0;
        int actual = radio.getNumberStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testStationSwitchNull() {
        Radio radio = new Radio();
        radio.setNumberStation(0);

        radio.next();

        int expected = 1;
        int actual = radio.getNumberStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testStationSwitchEight() {
        Radio radio = new Radio();
        radio.setNumberStation(8);

        radio.next();

        int expected = 9;
        int actual = radio.getNumberStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testStationSwitchMinusMin() {
        Radio radio = new Radio();
        radio.setNumberStation(0);

        radio.prev();

        int expected = 9;
        int actual = radio.getNumberStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testStationSwitchPrev() {
        Radio radio = new Radio();
        radio.setNumberStation(1);

        radio.prev();

        int expected = 0;
        int actual = radio.getNumberStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testStationSwitchPrevNine() {
        Radio radio = new Radio();
        radio.setNumberStation(9);

        radio.prev();

        int expected = 8;
        int actual = radio.getNumberStation();
        Assertions.assertEquals(expected, actual);
    }


}