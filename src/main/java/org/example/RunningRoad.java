package org.example;

public enum RunningRoad {
    LOW(100), NORMAL(300), LONGEST(400);
    private  int length;
    RunningRoad(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }
}