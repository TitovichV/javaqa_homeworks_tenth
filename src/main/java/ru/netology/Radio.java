package ru.netology;

public class Radio {
    private int currentStation;
    private int currentVolume;
    private int maxStation;

    public Radio() {
        maxStation = 9;
    }

    public Radio(int stationsCount) {
        maxStation = stationsCount - 1;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > maxStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void next() {
        if (currentStation != maxStation) {
            currentStation++;
        } else {
            currentStation = 0;
        }
    }

    public void prev() {
        if (currentStation != 0) {
            currentStation--;
        } else {
            currentStation = maxStation;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 100) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume++;
        } else {
            currentVolume = 100;
        }
    }

    public void  decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        } else {
            currentVolume = 0;
        }
    }
}