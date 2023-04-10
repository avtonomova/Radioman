package ru.netology;

public class Radio {
    private int numberStation;
    private int volumeStation;

public void next() {
    if (numberStation !=9) {
        numberStation++;
    } else {
        numberStation =0;
    }
}

    public void prev() {
        if (numberStation != 0) {
           numberStation--;
       } else {
           numberStation =9;
}
    }

    public int getNumberStation() {
        return numberStation;
    }

    public void setNumberStation(int numberStation) {
        if (numberStation < 0) {
            return;
        }
        if (numberStation > 9) {
            return;
        }
        this.numberStation = numberStation;
    }

    public int getVolumeStation() {
        return volumeStation;
    }

    public void setVolumeStation(int volumeStation)  {
        if (volumeStation < 0) {
            return;
        }
        if (volumeStation >10) {
            return;
        }
        this.volumeStation = volumeStation;
    }
}
