package org.example;

public class Road implements Trials{
    int length;

    public Road(RunningRoad runningRoad) {
        this.length = runningRoad.getLength();
    }
    @Override
    public boolean can (Participant participant){
        return participant.run(length);
    }
}

