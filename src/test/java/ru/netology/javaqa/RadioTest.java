package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void setStation() {
        Radio radio = new Radio();
        radio.setCurrentWave(9);


        int expected = 9;
        int actual = radio.getCurrentWave();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setStationAboveMax() {
        Radio radio = new Radio();
        radio.setCurrentWave(10);


        int expected = 0;
        int actual = radio.getCurrentWave();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setStationLessMax() {
        Radio radio = new Radio();
        radio.setCurrentWave(8);


        int expected = 8;
        int actual = radio.getCurrentWave();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setStationMin() {
        Radio radio = new Radio();
        radio.setCurrentWave(0);


        int expected = 0;
        int actual = radio.getCurrentWave();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void setStationAboveMin() {
        Radio radio = new Radio();
        radio.setCurrentWave(1);


        int expected = 1;
        int actual = radio.getCurrentWave();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setStationNext() {
        Radio radio = new Radio();
        radio.setCurrentWave(8);
        radio.next();


        int expected = 9;
        int actual = radio.getCurrentWave();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setStationMoreMax() {
        Radio radio = new Radio();
        radio.setCurrentWave(9);
        radio.next();


        int expected = 0;
        int actual = radio.getCurrentWave();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setStationLessMin() {
        Radio radio = new Radio();
        radio.setCurrentWave(0);
        radio.prev();


        int expected = 9;
        int actual = radio.getCurrentWave();

        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void setStationLess() {
        Radio radio = new Radio();
        radio.setCurrentWave(1);
        radio.prev();


        int expected = 0;
        int actual = radio.getCurrentWave();

        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void setVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(56);


        int expected = 56;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void setVolumeMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);


        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void setVolumeMoreMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);


        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void setVolumeLessMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);


        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void makeLouder() {
        Radio radio = new Radio();
        radio.setCurrentVolume(84);

        radio.forward();

        int expected = 85;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void makeLouderMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);

        radio.forward();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void makeLouderMoreMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);

        radio.forward();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void makeLouderMoreMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.forward();

        int expected = 1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void makeQuieter() {
        Radio radio = new Radio();
        radio.setCurrentVolume(66);

        radio.back();

        int expected = 65;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void makeQuieterLessMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);

        radio.back();

        int expected = 99;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void makeQuieterLessMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.back();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

}
