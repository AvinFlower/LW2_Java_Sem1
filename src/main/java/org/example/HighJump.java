package org.example;

public enum HighJump {
    low(1), normal(3), longest(4);
    private int height;
    HighJump(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }
}
