import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    public void testSetCurrentStationRegular() {
        Radio radio = new Radio();

        radio.setCurrentStation(7);
        int actual = radio.getCurrentStation();
        int expected = 7;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testSetCurrentStationOverNine() {
        Radio radio = new Radio();

        radio.setCurrentStation(7);
        radio.setCurrentStation(10);
        int actual = radio.getCurrentStation();
        int expected = 7;

        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void testSetCurrentStationOverLimit() {
        Radio radio = new Radio(15);

        radio.setCurrentStation(5);
        radio.setCurrentStation(15);
        int actual = radio.getCurrentStation();
        int expected = 5;

        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void testSetCurrentStationBelowZero() {
        Radio radio = new Radio();

        radio.setCurrentStation(7);
        radio.setCurrentStation(-1);
        int actual = radio.getCurrentStation();
        int expected = 7;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testNextRegular() {
        Radio radio = new Radio();

        radio.setCurrentStation(7);
        radio.next();
        int actual = radio.getCurrentStation();
        int expected = 8;

        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void testPrevRegular() {
        Radio radio = new Radio();

        radio.setCurrentStation(7);
        radio.prev();
        int actual = radio.getCurrentStation();
        int expected = 6;

        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void testNextAfterNine() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);
        radio.next();
        int actual = radio.getCurrentStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void testNextAfterLimit() {
        Radio radio = new Radio(15);

        radio.setCurrentStation(14);
        radio.next();
        int actual = radio.getCurrentStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void testPrevBeforeZero() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);
        radio.prev();
        int actual = radio.getCurrentStation();
        int expected = 9;

        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void testPrevBeforeZero2() {
        Radio radio = new Radio(15);

        radio.setCurrentStation(0);
        radio.prev();
        int actual = radio.getCurrentStation();
        int expected = 14;

        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void testSetVolumeRegular() {
        Radio radio = new Radio();

        radio.setCurrentVolume(35);
        int actual = radio.getCurrentVolume();
        int expected = 35;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testSetVolumeOverHundred() {
        Radio radio = new Radio();

        radio.setCurrentVolume(35);
        radio.setCurrentVolume(101);
        int actual = radio.getCurrentVolume();
        int expected = 35;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testSetVolumeBelowZero() {
        Radio radio = new Radio();

        radio.setCurrentVolume(35);
        radio.setCurrentVolume(-1);
        int actual = radio.getCurrentVolume();
        int expected = 35;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNextVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(35);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 36;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testPrevVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(35);
        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 34;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testIncreaseOverHundred() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 100;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testDecreaseBeforeZero() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(expected, actual);

    }
}