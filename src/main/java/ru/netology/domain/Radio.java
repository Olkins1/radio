package ru.netology.domain;

public class Radio {
    private int channelNumber = 0;
    private int volume = 0;

    public void nextChannelNumber() {
        if (channelNumber == 9) {
            this.channelNumber = 0;
            return;

        }
        this.channelNumber++;
    }

    public void prevChannelNumber() {
        if (channelNumber == 0) {
            this.channelNumber = 9;
            return;

        }
        this.channelNumber--;
    }

    public void increaseVolume() {
        if (volume == 10) {
            return;

        }
        this.volume++;
    }

    public void decreaseVolume() {
        if (volume == 0) {
            return;

        }
        this.volume--;
    }

    public void setChannelNumber(int channelNumber) {
        if (channelNumber > 9) {
            return;
        }
        if (channelNumber < 0) {
            return;
        }
        this.channelNumber = channelNumber;
    }

    public int getChannelNumber() {
        return this.channelNumber;

    }

    public int getVolume() {
        return this.volume;

    }

}
