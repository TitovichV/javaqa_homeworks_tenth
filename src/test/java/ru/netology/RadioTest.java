package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

   //Тест при выборе количества радиостанций пользователем
    @Test
    public void shouldSetStationMoreThatUsual() {

        Radio radio = new Radio(30);

        radio.setCurrentStation(25);

        int expected = 25;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    //Тесты переключения на следующую радиостанцию
    @Test
    public void shouldSetNexStationMoreThatUsual() {

        Radio radio = new Radio(30);

        radio.setCurrentStation(24);
        radio.next();

        int expected = 25;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNexStationMoreThatUsualToMax() {

        Radio radio = new Radio(30);

        radio.setCurrentStation(28);
        radio.next();

        int expected = 29;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNexStationMoreThatUsualAboveMax() {

        Radio radio = new Radio(30);

        radio.setCurrentStation(29);
        radio.next();

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    //Тесты переключения на предыдущую радиостанцию
    @Test
    public void shouldSetPrevStationMoreThatUsual() {

        Radio radio = new Radio(30);

        radio.setCurrentStation(24);
        radio.prev();

        int expected = 23;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevStationMoreThatUsualToMax() {

        Radio radio = new Radio(30);

        radio.setCurrentStation(1);
        radio.prev();

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevStationMoreThatUsualAboveMax() {

        Radio radio = new Radio(30);

        radio.setCurrentStation(0);
        radio.prev();

        int expected = 29;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }



    //Тесты классов эквивалентности громкости звука
    @Test
    public void shouldSetCorrectVolume() {

        Radio radio = new Radio();

        radio.setCurrentVolume(50);

        int expected = 50;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeBelowMin() {

        Radio radio = new Radio();

        radio.setCurrentVolume(-50);

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeAfterMax() {

        Radio radio = new Radio();

        radio.setCurrentVolume(150);

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    //Тесты граничных значений увеличения громкости звука
    @Test
    public void shouldVolumeUp() {

        Radio radio = new Radio();

        radio.setCurrentVolume(98);
        radio.increaseVolume();

        int expected = 99;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldVolumeUpToMax() {

        Radio radio = new Radio();

        radio.setCurrentVolume(99);
        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetAfterMaxVolume() {

        Radio radio = new Radio();

        radio.setCurrentVolume(100);
        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    //Тесты граничных значений уменьшения громкости звука
    @Test
    public void shouldVolumeDown() {

        Radio radio = new Radio();

        radio.setCurrentVolume(2);
        radio.decreaseVolume();

        int expected = 1;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldVolumeDownToMin() {

        Radio radio = new Radio();

        radio.setCurrentVolume(1);
        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetVolumeBelowZero() {

        Radio radio = new Radio();

        radio.setCurrentVolume(0);
        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
}
