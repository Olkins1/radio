package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    void incMaxChannel() {
        Radio receiver = new Radio();
        receiver.setChannelNumber(9);
        receiver.nextChannelNumber();
        int actual = receiver.getChannelNumber();
        assertEquals(0, actual);
    }

    @Test
    void decMinChannel() {
        Radio receiver = new Radio();
        receiver.setChannelNumber(0);
        receiver.prevChannelNumber();
        int actual = receiver.getChannelNumber();
        assertEquals(9, actual);
    }

    @Test
    void setIncorrectMaxChannel() {
        Radio receiver = new Radio();
        receiver.setChannelNumber(5);
        receiver.setChannelNumber(10);
        int actual = receiver.getChannelNumber();
        assertEquals(5, actual);
    }

    @Test
    void setIncorrectMinChannel() {
        Radio receiver = new Radio();
        receiver.setChannelNumber(1);
        receiver.setChannelNumber(-1);
        int actual = receiver.getChannelNumber();
        assertEquals(1, actual);
    }

    @Test
    void incMaxVolume() {
        Radio receiver = new Radio();
        for (int i = 0; i < 15; i++) {
            receiver.increaseVolume();
        }
        int actual = receiver.getVolume();
        assertEquals(10, actual);
    }

    @Test
    void decMinVolume() {
        Radio receiver = new Radio();
        receiver.decreaseVolume();
        int actual = receiver.getVolume();
        assertEquals(0, actual);
    }
}