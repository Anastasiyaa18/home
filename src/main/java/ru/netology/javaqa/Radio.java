package ru.netology.javaqa;

public class Radio {
    private int currentWave;
    private int currentVolume;
    private int maxWave;


    public Radio() {
        this.maxWave = 9;

    }

    public Radio(int quantityWave) {
        this.maxWave = quantityWave - 1;

    }

    public void next() {
        if (currentWave != maxWave) {
            currentWave++;
        } else {
            currentWave = 0;
        }
    }

    public void prev() {
        if (currentWave == 0) {
            currentWave = maxWave;
        } else {
            currentWave = currentWave - 1;
        }
    }

    public void forward() {
        if (currentVolume < 100) {
            currentVolume++;
        } else {
            currentVolume = 100;
        }

    }

    public void back() {
        if (currentVolume > 0) {
            currentVolume--;
        } else {
            currentVolume = 0;
        }
    }

    public int getCurrentWave() {
        return currentWave;
    }

    public void setCurrentWave(int currentWave) {
        if (currentWave < 0) {
            return;
        }
        if (currentWave > maxWave) {
            return;
        }
        this.currentWave = currentWave;
    }


    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > 100) {
            return;
        }
        if (currentVolume < 0) {
            return;
        }
        this.currentVolume = currentVolume;
    }

}




