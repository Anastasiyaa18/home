package ru.netology.javaqa;

public class Radio {
    private int currentWave;
    private int currentVolume;

    public void next() {
        if (currentWave != 9) {
            currentWave++;
        } else {
            currentWave = 0;
        }
    }

    public void prev() {
        if (currentWave == 0) {
            currentWave = 9;
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
        if (currentWave > 9) {
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




